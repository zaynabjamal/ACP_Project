package Model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;


public class Transportation extends TransPortationType {


  LinkedList<Transportation> transportationList = new LinkedList<>();
public Object displayTransportationList;

    public Transportation(int tTypeId, String vehicleType, String owner, String phoneNumber, String seatAvailable, String travelTime, String arrivalTime, String price) {
        super(tTypeId, vehicleType, owner, phoneNumber, seatAvailable, travelTime, arrivalTime, price);
    }

    

    public void insertTransportation(int tTypeId, String vehicleType, String owner, String phoneNumber, String seatAvailable, String travelTime, String arrivalTime, String price, int position, String section) {
        super.insertTransportation(tTypeId, vehicleType, owner, phoneNumber, seatAvailable, travelTime, arrivalTime, price, position, section);
        
        Transportation newTransportation = new Transportation(tTypeId, vehicleType, owner, phoneNumber, seatAvailable, travelTime, arrivalTime, price);
        transportationList.add(newTransportation);
    }


    public void removeByTTypeId(LinkedList<Transportation> transportationList, int tTypeIdToRemove) {
        super.removeByTTypeId(transportationList,tTypeIdToRemove);
        
    }
    
  

  
 

 public void writeToFile() {
    try {
        int id = this.getTTypeId();
        boolean dataExists = checkIfDataExists(id);// checki aw methoda daka ka bzanint aw ID'ia wjwdi haya

        if (!dataExists) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt", true));

            String data = this.toString();
            writer.write(data);
            writer.newLine();
            writer.close();
            System.out.println("Data with ID " + id + " inserted into the file.");
        } else {
            System.out.println("Data with ID " + id + " already exists in the file. Not inserted again.");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

private boolean checkIfDataExists(int id) {
    try {
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            if (line.contains("'tTypeId':" + id)) {// readi file'aka daka agar hatw aw id'ia wjwdi havw awa read nakatawa
                reader.close();
                return true;
            }
        }

        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    return false;
}

 public static void readFromFile(){
    try{
        BufferedReader read =new BufferedReader(new FileReader("data.txt"));
        String line;
        while((line=read.readLine())!= null){
System.out.println(line);
        }
        read.close();
    }
    catch(IOException e){
        e.printStackTrace();
    }
 }


 


 
    public static void clearDataFromFile() {// clear the whole file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt", false)); 

            writer.close();

            System.out.println("All data in the file has been cleared.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    
    public static void updateDataById(LinkedList<Transportation> transportationList, int tTypeIdToUpdate, Transportation updatedTransportation) {
   
        for (int i = 0; i < transportationList.size(); i++) {
            if (transportationList.get(i).getTTypeId() == tTypeIdToUpdate) {
                transportationList.set(i, updatedTransportation);
                System.out.println("Data with ID " + tTypeIdToUpdate + " updated in the list.");
                break; 
            }
        }
    
        updateDataInFile(tTypeIdToUpdate, updatedTransportation.toString());
        clearAndWriteDataToFile(transportationList);
    }


public static void updateDataInFile(int tTypeIdToUpdate, String updatedData) {
    try {
        File inputFile = new File("data.txt");
        File tempFile = new File("tempData.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile, true));

        String line;

        while ((line = reader.readLine()) != null) {
            if (line.contains("'tTypeId':" + tTypeIdToUpdate)) {
               
                writer.write(updatedData);
                writer.newLine();
            } else {
               
                writer.write(line);
                writer.newLine();
            }
        }

        reader.close();
        writer.close();

        if (inputFile.delete()) {
            if (!tempFile.renameTo(inputFile)) {
                System.out.println("Error renaming the temp file.");
            } else {
                System.out.println("Data with ID " + tTypeIdToUpdate + " updated in the file.");
            }
        } else {
            System.out.println("Error deleting the original file.");
        }
    }
     catch (IOException e) {
        e.printStackTrace();
    }
}

   public  void displayTransportationList(LinkedList<Transportation> transportationList) {
      for (Transportation transportation : transportationList) {
          System.out.println(transportation);
      }
  }


  /* public  void removeTransportationById(LinkedList<Transportation> list, int tTypeId) {
      list.removeIf(t -> t.getTTypeId() == tTypeId);
      clearAndWriteDataToFile(list);
  } */

  public static void clearAndWriteDataToFile(LinkedList<Transportation> list) {

      Transportation.clearDataFromFile();
      for (Transportation t : list) {
          t.writeToFile();
      }
  }


  
   public String toString() {

        return super.toString();
    }
    
}









    










