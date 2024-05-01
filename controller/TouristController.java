package controller;
import java.util.LinkedList;
import view.TouristView; 
import Model.Tourist;

public class TouristController {
    private Tourist tourist;
    private TouristView view ;

    public TouristController(Tourist tourist,TouristView view){ 
        this.tourist=tourist;
        this.view=view;
    }

    //method setter and getter 
    public void setTouristID(String TouristID) {
        tourist.setTouristID(TouristID);
    }

    public String getTouristID() {
       return  tourist.getTouristID();
    }

    public void setFirstName(String FirstName) {    
        tourist.setFirstName(FirstName);
    }

    public String getFirstName() {
        return tourist.getFirstName();
    }  
    
    public void setLastName(String Lastname) {
        tourist.setLastName(Lastname);
    }

    public String getLastName() {
        return tourist.getLastName();
    }

    public void setNationality(String Nationality) {
        tourist.setNationality(Nationality);
    }

    public String getNationality() {
        return tourist.getNationality();
    }

    public void setEmail(String Email) {
        tourist.setEmail(Email);
    }

    public String getEmail() {
        return tourist.getEmail();
    }

    public void setPhoneNO(String PhoneNO) {
        tourist.setPhoneNO(PhoneNO);
    }

    public String getPhoneNo() {
        return tourist.getPhoneNo();
    }

    public void setAddress(String Address) {
        tourist.setAddress(Address);
    }

    public String getAddress() {
        return tourist.getAddress();
    }

    public void setGender(String Gender) {
        tourist.setGender(Gender);
    }  

    public String getGender() {
        return tourist.getGender();
    }

    public void setAge(String Age) {
        tourist.setAge(Age);
    }

    public String getAge() {
        return tourist.getAge();
    }

    public void setUserName(String UserName) {
        tourist.setUserName(UserName);
    }

    public String getUserName() {
        return tourist.getUserName();
    }

    public void setPassword(String Password) {
        tourist.setPassword(Password);
    }

    public String getPassword() {
        return tourist.getPassword();
    }

    public void setPassportNo(String PassportNO) {
        tourist.setPassportNo(PassportNO);
    }

    public String getPassportNO() {
        return tourist.getPassportNO();
    }

    public void setDisabilities(String Disabilities) {
        tourist.setDisabilities(Disabilities);
    }

    public String getDisabilities() {
        return tourist.getDisabilities();
    }

    public void setDisabledNeeds(String DisabledNeeds) {
        tourist.setDisabledNeeds(DisabledNeeds);
    }

    public String getDisabledNeeds() {
        return tourist.getDisabledNeeds();
    }
    /////////

    //method delete tourist 
    public void deleteTourist(String touristid){
        tourist.deleteTourist(touristid);
    }

    //method insert 
    public  void insertTourist(Tourist newTourist){
        tourist.insertTourist(newTourist);
    }

    //method update 
    public void updateTourist(Tourist updateTourist){
        tourist.UpdateTourist(updateTourist);
    }

    //get tourist by id
    public Tourist getTouristById(String id){
        return tourist.getTouristById(id);
    }

    //get tourit bt username 
    public Tourist geTouristByUsername(String username){
        return tourist.getTouristByUsername(username);
    }

    //method to get all Tourist 
    public LinkedList<Tourist> getAllTourist(){
        return tourist.getAllToursit();
    }

    // print detalis tourist 
    public  void TouritDetalis(String TouristID, String FirstName, String Lastname, String Nationality, String Email, String PhoneNo,
    String Address, String Gender, String Age, String UserName, String Password, String PassportNO,
    String Disabilities, String DisabledNeeds){

        view.TouritDetalis(TouristID,FirstName,Lastname,Nationality,Email,
        PhoneNo,Address,Gender,Age,UserName,Password,PassportNO,
        Disabilities,DisabledNeeds);
    }
}
