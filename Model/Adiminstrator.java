package Model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Adiminstrator  {

   public int adminID;
   public String adminName="Ahmad Nawzad";
   public String companyName="JourneyVista";// vista ya3ni dimanaki jwan
   public String email="AhmadAdmin@gmail.com";
   public String phoneNumber="07501234567";
   public String userName="ahmadNjourneyVista";
   public String password="7777777"; // 7 7'a
  

   public Adiminstrator(int adminID){
    this.adminID=adminID;
   
   }

   public void setAdminID(int adminID){
    this.adminID=adminID;
   }

   public int getAdminID(){
    return this.adminID;
   }
  // handek case'i tedaya ka dakre flight'aka cancle bkre labar aw hokarana
   public void emergencyCase(String reason) {

    if (hasAuthority()) {// Authority==dasallat
        
        if(reason.equalsIgnoreCase("bad Weather") ){
            
            System.out.println("JourneyVista reject the flight due to "+ reason);
        }
        else if ( reason.equalsIgnoreCase("Plane Issue")){
           
            System.out.println("JourneyVista reject the flight due to "+ reason);

        }
        else if(reason.equalsIgnoreCase("Mechanical problems")) {

             System.out.println("JourneyVista reject the flight due to "+ reason);

            }
    }
     else {
        System.out.println("Admin does not have the authority to reject flights.");
    
}
   }

        public String adminInformation() {// information about admin if user requested for
            return "Admin Name: " + adminName + "\nEmail: " + email + "\nPhone Number: " + phoneNumber;
        }

        private boolean hasAuthority() {
            return true;
       }

       public void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("admin.txt"))) {
            writer.write(this.toString());
            System.out.println("Administrator data written to data.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFromFile(){
        try{
            BufferedReader read =new BufferedReader(new FileReader("admin.txt"));
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
    
     public void updateAdministratorData(int adminId, String newName, String newEmail, String newPhoneNumber) {
        if (this.adminID == adminId) {
            this.adminName = newName;
            this.email = newEmail;
            this.phoneNumber = newPhoneNumber;
            writeAdminDataToFile(); // Update data in the file
            System.out.println("Administrator data updated.");
        } else {
            System.out.println("Administrator with ID " + adminId + " not found.");
        }
    }
    
    private void writeAdminDataToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("admin.txt"))) {
            writer.write(this.toString());
            System.out.println("Administrator data updated in the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void clearAdminDataFromFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("admin.txt", false))) {
            // Clear the file
            System.out.println("Administrator data cleared from the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void removeAdministrator(int adminId) {
        if (this.adminID == adminId) {
            // Remove the administrator (you can define the removal logic here)
            clearAdminDataFromFile(); // Clear data from the file
            System.out.println("Administrator removed.");
        } else {
            System.out.println("Administrator with ID " + adminId + " not found.");
        }
    }
            
    public String toString() {
        return "[\n" +
            "{\n" +
            "'adminID': " + getAdminID() + ",\n" +
            "'adminName': '" + adminName + "',\n" +
            "'companyName': '" + companyName + "',\n" +
            "'email': '" + email + "',\n" +
            "'phoneNumber': '" + phoneNumber + "',\n" +
            "'userName': '" + userName + "'\n" +
            "}\n" +
            "]\n";
    }
    
     
       
// aw methoda dabi rabt bi lagar classi Flight as an object so lera dakama comment lo esta
    
/*   public void flightSchedual(LinkedList<Flight>flightList ) {
       if (hasAuthority()) {
          System.out.println("Flight Schedule:");
        
          for (Transportation transportation : flightList) {
            System.out.println("Flight ID: " + flightList.getFlightID() + ", Departure: " + flightList.travelDate() + ", Arrival: " + transportation.arrivalDate());
        }
    } 
    else {
        System.out.println("Admin does not have the authority to view the flight schedule.");
    }
}

*/


}
   