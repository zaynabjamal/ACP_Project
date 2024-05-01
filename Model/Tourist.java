package Model;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Tourist {
   private String TouristID;
   private String FirstName;
   private String Lastname;
   private String Nationality;
   private String Email;
   private String PhoneNo;
   private String Address;
   private String Gender;
   private String Age;
   private String UserName;
   private String Password;
   private String PassportNO;
   private String Disabilities;
   private String DisabledNeeds;
   private LinkedList<Tourist> tourists = new LinkedList<>();

   
   public Tourist(String TouristID, String FirstName, String Lastname, String Nationality, String Email, String PhoneNo,
         String Address, String Gender, String Age, String UserName, String Password, String PassportNO,
         String Disabilities, String DisabledNeeds) {
      this.TouristID=TouristID;
      this.FirstName=FirstName;
      this.Lastname=Lastname;
      this.Nationality=Nationality;
      this.Email=Email;
      this.PhoneNo=PhoneNo;
      this.Address=Address;
      this.Gender=Gender;
      this.Age=Age;
      this.UserName=UserName;
      this.Password=Password;
      this.PassportNO=PassportNO;
      this.Disabilities=Disabilities;
      this.DisabledNeeds= DisabledNeeds;

   }

   // method setter and getter

   public void setTouristID(String TouristID) {
      if (TouristID != null) {
         this.TouristID = TouristID;
      }
   }

   public String getTouristID() {
      return this.TouristID;
   }

   public void setFirstName(String FirstName) {
      if (FirstName != null) {
         this.FirstName = FirstName;
      }
   }

   public String getFirstName() {
      return this.FirstName;
   }

   public void setLastName(String Lastname) {
      if (Lastname != null) {
         this.Lastname = Lastname;
      }
   }

   public String getLastName() {
      return this.Lastname;
   }

   public void setNationality(String Nationality) {
      if (Nationality != null) {
         this.Nationality = Nationality;
      }
   }

   public String getNationality() {
      return this.Nationality;
   }

   public void setEmail(String Email) {
      String regex = "^[A-Za-z0-9-_.]+@(.+)$";
      if (Email != null && Email.matches(regex)) {
         this.Email = Email;
      } 
      
   }

   public String getEmail() {
      return this.Email;
   }

   public void setPhoneNO(String PhoneNO) {
      String regex = "^[0-9]{10}$"; // contains only 10 digits.
      if (PhoneNO != null && PhoneNO.matches(regex)) {
         this.PhoneNo = PhoneNO;
        
      } 
   }

   public String getPhoneNo() {
      return this.PhoneNo;
   }

   public void setAddress(String Address) {
      if (Address != null) {
         this.Address = Address;
      }
   }

   public String getAddress() {
      return this.Address;
   }

   public void setGender(String Gender) {
      if (Gender != null) {
         this.Gender = Gender;
      }
   }

   public String getGender() {
      return this.Gender;
   }

   public void setAge(String Age) {
      if (Age != null) {
         this.Age = Age;
      }
   }

   public String getAge() {
      return this.Age;
   }

   public void setUserName(String UserName) {

      String regex = "^[A-Za-z][A-Za-z0-9-_]+{4,15}$";// must start with letter and contains letter both upercase
                                                      // lowercase and digits snd underscore

      if (UserName != null && UserName.matches(regex)) {
         this.UserName = UserName;
         System.out.println(" valid UserName ");
      }

      else {
         System.out.println(" invalid UserName ");
      }
   }

   public String getUserName() {
      return this.UserName;
   }

   public void setPassword(String Password) {

      String regex = "^(?=.*[A-Z])(?=.+[a-z])(?=.*\\d).{8,}$";// contains at least (one uppercase , one lowercase ,one
                                                              // digit) and at least 8 characters.
      if (Password != null && Password.matches(regex)) {
         this.Password = Password;
         System.out.println(" valid Password ");
      } else {
         System.out.println(" invalid Password ");
      }
   }

   public String getPassword() {
      return this.Password;
   }

   public void setPassportNo(String PassportNO) {
      if (PassportNO != null) {
         this.PassportNO = PassportNO;
      }
   }

   public String getPassportNO() {
      return this.PassportNO;
   }

   public void setDisabilities(String Disabilities) {
      if (Disabilities != null) {
         this.Disabilities = Disabilities;
      }
   }

   public String getDisabilities() {
      return this.Disabilities;
   }

   public void setDisabledNeeds(String DisabledNeeds) {
      if (DisabledNeeds != null) {
         this.DisabledNeeds = DisabledNeeds;
      }
   }

   public String getDisabledNeeds() {
      return this.DisabledNeeds;
   }

   //delete tourist 
   public void deleteTourist(String touristid) {
      for (Iterator<Tourist> iterator = tourists.iterator(); 
          iterator.hasNext();) {
          Tourist tourist = iterator.next();
          if (tourist.getTouristID().equals(touristid)) {
              iterator.remove();
              System.out.println("Tourist with ID: " + touristid + " removed");
          }
 
      }
      System.out.println("Tourist with ID: " + touristid + " not found ");
  }
   // insert Tourist 
   public void insertTourist(Tourist newTourist){
      tourists.add(newTourist);
      writetoFile();
   }

   //update 
   public void UpdateTourist(Tourist updateTourist){
      for(int i=0;i<tourists.size();i++){
         Tourist tourist= tourists.get(i);
         if(tourist.getTouristID().equals(updateTourist.getTouristID())){
            tourists.set(i,updateTourist);
            writetoFile();;
         }
      }
   }

   // get Tourist by ID
   public Tourist getTouristById(String id) {
      readfromfile();
      for (Tourist tourist : tourists) {
         if (tourist.getTouristID().equals(id)) {
            return tourist;
         }
      }
      return null;
   }

   //get by username 
   public Tourist getTouristByUsername(String username){
      readfromfile();
      for(Tourist tourist:tourists){
         if(tourist.getUserName().equals(username)){
            return tourist;
         }
      }
         return null;
   }

   public LinkedList<Tourist> getAllToursit(){
      readfromfile();
      return tourists;
   }

   public void writetoFile() {
      try {
         BufferedWriter write = new BufferedWriter(
               new FileWriter("C:\\Users\\HC\\OneDrive\\Desktop\\code\\MyCodeLast\\files\\Tourist.txt", true));
         for (Tourist tourist : tourists) {
            write.write(tourist.toString() + "\n");
         }
         write.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static void readfromfile() {
      try {
         BufferedReader read = new BufferedReader(
               new FileReader("C:\\Users\\HC\\OneDrive\\Desktop\\code\\MyCodeLast\\files\\Tourist.txt"));
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
      return "\n[\n{'TouristID' : " + TouristID + "\n 'FirdtName' : " + FirstName + "\n 'LastName' : " + Lastname
            + "\n 'Nationality' : "
            + Nationality + "\n 'Email' : " + Email +
            "\n 'PhoneNO' : " + PhoneNo + "\n 'Address' :" + Address + "\n 'Gender' : " + Gender + "\n 'Age' : " + Age
            + "\n 'UserName' : "
            + UserName + "\n 'Password' : " + Password +
            "\n 'PassportNo' : " + PassportNO + "\n 'Disabilities' : " + Disabilities + "\n 'DisabledNeeds' : "
            + DisabledNeeds + "}\n]";
   }

}
