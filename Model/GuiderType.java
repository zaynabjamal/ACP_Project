package Model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class GuiderType {
  private String guidertypeid;
  private String guidername;
  private String discription;
  private double price;
  private LinkedList<GuiderType> guidertypes = new LinkedList<>();

  
  // Constracor
  public GuiderType(String guidertypeid, String guidername, String discription, double price) {
    setguidertypeid(guidertypeid);
    setguidername(guidername);
    setdiscription(discription);
    setprice(price);
  }

  // method setter and getter

  public void setguidertypeid(String guidertypeid) {
    if (guidertypeid != null) {
      this.guidertypeid = guidertypeid;
    }
  }

  public String getGuidertypeid() {
    return this.guidertypeid;
  }

  public void setguidername(String guidername) {
    if (guidername != null) {
      this.guidername = guidername;
    }
  }

  public String getguidername() {
    return this.guidername;
  }

  public void setdiscription(String discription) {
    if (discription != null) {
      this.discription = discription;
    }
  }

  public String getdiscription() {
    return this.discription;
  }

  public void setprice(double price) {
    if (price > 0) {
      this.price = price;
    }
  }

  public double getprice() {
    return this.price;
  }

     // delete GuiderType
   public void deleteGuiderType(String guidertypeid) {
      for (Iterator<GuiderType> iterator = guidertypes.iterator(); iterator.hasNext();) {
          GuiderType guidertype = iterator.next();
          if (guidertype.getGuidertypeid().equals(guidertypeid)) {
              iterator.remove();
              System.out.println("Tourist with ID: " + guidertypeid + " removed");
          }
 
      }
      System.out.println("Tourist with ID: " +guidertypeid+ " not found ");
  }

   // insert Tourist 
   public void insertGuiderType(GuiderType newGuidertype){
    guidertypes.add(newGuidertype);
    writetoFile();
 }


   //update 
   public void UpdateGuiderType(GuiderType updateGuiderType){
    for(int i=0;i<guidertypes.size();i++){
       GuiderType guiderType =guidertypes.get(i);
       if(guiderType.getGuidertypeid().equals(updateGuiderType.getGuidertypeid())){
          guidertypes.set(i,updateGuiderType);
          writetoFile();;
       }
    }
 }

  // method to retun guidertype by ID
  public GuiderType getGuiderTypeById(String id) {
    readfromfile();
    for (GuiderType guidertype : guidertypes) {
      if (guidertype.getGuidertypeid().equals(id)) {
        return guidertype;
      }
    }
    return null;
  }

  // method to retun guidertype by NAME
  public GuiderType getGuiderTypeByname(String name){
    readfromfile();
    for(GuiderType guidertype:guidertypes){
       if(guidertype.getguidername().equals(name)){
          return guidertype;
       }
    }
       return null;
 }

  public void writetoFile() {
    try {
      BufferedWriter write = new BufferedWriter(
          new FileWriter("C:\\Users\\HC\\OneDrive\\Desktop\\code\\MyCodeLast\\files\\guidertype.txt", true));
      for (GuiderType guidertype : guidertypes) {
        write.write(guidertype.toString() + "\n");
      }
      write.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void readfromfile() {
    try {
      BufferedReader read = new BufferedReader(
          new FileReader("C:\\Users\\HC\\OneDrive\\Desktop\\code\\MyCodeLast\\files\\guidertype.txt"));
      String line;
      while ((line = read.readLine()) != null) {
        System.out.println(line);
      }
      read.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String toString() {
    return "\n[" + "\n{" + "'guidertypeid' : " + this.guidertypeid + "\n'guidername' : " + this.guidername
        + "\n'discription' : "
        + this.discription + "\n'price' :" + this.price + "}\n]";
  }

}
