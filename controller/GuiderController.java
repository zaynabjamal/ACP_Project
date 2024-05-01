package controller;
import Model.Guider;
import Model.GuiderType;
import view.GuiderView;

public class GuiderController {
    private Guider guider;
    private GuiderType guidertype;
    private GuiderView guiderView;

    public GuiderController(Guider guider , GuiderType guidertype,GuiderView guiderView){
        this.guider=guider;
        this.guidertype=guidertype;
        this.guiderView=guiderView;
    }

    //methods in Guider 
    //setter and getter in Guider 

	public void setguiderid(String guiderid) {
        guider.setguiderid(guiderid);
    }

	public String getguiderid() {
        return guider.getguiderid();
    }

	public void setEmail(String Email) {
        guider.setEmail(Email);
    }

	public String getEmail() {
        return guider.getEmail();
    }

	public void setPhoneNo(String PhoneNO) {
        guider.setPhoneNo(PhoneNO);
    }

	public String getPhoneNo() {
        return guider.getPhoneNo();
    }

	public void setLanguageSpoken(String LanguageSpoken) {
        guider.setLanguageSpoken(LanguageSpoken);
    }

	public String getLanguageSpoken() {
        return guider.getLanguageSpoken();
    }

	public void setguidertypeid(GuiderType guidertypeid) {
        guider.setguidertypeid(guidertypeid);
    }

	public GuiderType getguidertypeid() {
        return guider.getguidertypeid();
    }

	public void setAvailability(String Availability) {
        guider.setAvailability(Availability);
    }

	public String getAvailability() {
        return guider.getAvailability();
    }

    //delte guider
    public void deleteGuider(String guiderid){
        guider.deleteGuider(guiderid);
    }

    //insert guider
    public void insertGuider(Guider newguider){
        guider.insertGuider(newguider);
    }

    //update guider
    public void updateguider(Guider updateguider){
        guider.UpdateGuider(updateguider);
    }

    //get guider by id
    public Guider getGuiderById(String id){
       return guider.getGuiderById(id);
    }

    //methods in guidertype

    //setter an getter

    public void setguidertypeid(String guidertypeid) {
        guidertype.setguidertypeid(guidertypeid);
    }

    public String getGuidertypeid() {
        return guidertype.getGuidertypeid();
    }

    public void setguidername(String guidername) {
        guidertype.setguidername(guidername);
    }

    public String getguidername() {
        return guidertype.getguidername();
    }

    public void setdiscription(String discription) {
        guidertype.setdiscription(discription);
    }

    public String getdiscription() {
        return guidertype.getdiscription();
    }

    public void setprice(double price) {
        guidertype.setprice(price);
    }

    public double getprice() {
        return guidertype.getprice();
    }

    //delete guidertype
    public void deleteGuiderType(String guidertypeid){
        guidertype.deleteGuiderType(guidertypeid);
    }

    //insert to guidertype
    public void insertGuiderType(GuiderType newguidertype){
        guidertype.insertGuiderType(newguidertype);
    }

    //update guidertype
    public void updateGuiderType(GuiderType updaguidertype){
        guidertype.UpdateGuiderType(updaguidertype);
    }

    //get guider by id
    public GuiderType getGuiderTypeById(String id){
        return guidertype.getGuiderTypeById(id);
    }

    //get guider by username
    public GuiderType getGuiderTypeByname(String name){
       return guidertype.getGuiderTypeByname(name);
    }

    public void GuiderDetalis(String guiderid, String Email, String PhoneNo, String LanguageSpoken,
    String guidername, String discription,
    double price,String Availability){
        
        guiderView.GuiderDetalis(guiderid,Email ,PhoneNo,LanguageSpoken, 
       guidername, discription,price, Availability);
    }
}
