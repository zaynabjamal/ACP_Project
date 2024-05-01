package controller;
import Model.Transportation;
import view.TransportationViewer;
import java.util.LinkedList;

public class TransportationController{

    private Transportation model;
    private TransportationViewer view;

    private LinkedList<Transportation> transportationList;

    public TransportationController( Transportation transportation) {
        this.model=transportation;
        transportationList = new LinkedList<>();
    }

    public void setTtypeID(int tTypeId){
        model.setTTypeId(tTypeId);
    }

    public int getTTypeId(){
        return model.getTTypeId();
    }

      public void setVehicleType(String vehicleType){
        model.setVehiclType(vehicleType);
    }

    public String getVehicleType(){
        return model.getVehicleType();
    }

       public void setOwner(String owner){
        model.setOwner(owner);
    }

    public String getOwner(){
        return model.getOwner();
    }

       public void setPhoneNumber(String phoneNumber){
        model.setPhoneNumber(phoneNumber);
    }

    public String getPhoneNumber(){
        return model.getPhoneNumber();
    }


       public void setSeatAvailable(String seatAvailable){
        model.setSeatAvailable(seatAvailable);
    }

    public String getSeatAvailable(){
        return model.getSeatAvailable();
    }

       public void setTravelTime(String travelTime){
        model.setTravelTime(travelTime);
    }

    public String getTravelTime(){
        return model.getTravelTime();
    }

         public void setArrivalTime(String arrivalTime){
        model.setArrivalTime(arrivalTime);
    }

    public String getArrivalTime(){
        return model.getArrivalTime();
    }

         public void setPrice(String price){
        model.setPrice(price);
    }

    public String getPrice(){
        return model.getPrice();
    }

          public void setPosition(int position){
        model.setPosition(position);
    }

    public int getPosition(){
        return model.getPosition();
    }

          public void setSection(String section){
        model.setSection(section);
    }

    public String getSection(){
        return model.getSection();
    }
    public void Insertion(int tTypeId, String vehicleType, String owner, String phoneNumber, String seatAvailable, String travelTime, String arrivalTime, String price, int position, String section){
    model.insertTransportation(tTypeId, vehicleType, owner, phoneNumber, seatAvailable, travelTime, arrivalTime, price, position, section);

        Transportation newTransportation = new Transportation(tTypeId, vehicleType, owner, phoneNumber, seatAvailable,travelTime, arrivalTime, price);
        transportationList.add(newTransportation);
  }
     
    public void removeByTTypeId(LinkedList<Transportation> transportationList, int tTypeIdToRemove){
        model.removeByTTypeId(transportationList, tTypeIdToRemove);
    }


    public void writeToFile(){
        model.writeToFile();
    }

    public void readFromFile(){
        model.readFromFile();
    }

    public void updateDataById(LinkedList<Transportation> transportationList, int tTypeIdToUpdate, Transportation updatedTransportation){
        model.updateDataById(transportationList, tTypeIdToUpdate, updatedTransportation);
    }

    public void displayTransportationList(LinkedList<Transportation> transportationList){
        model.displayTransportationList(transportationList);
    }

    public LinkedList<Transportation> getAllTransportations() {
      return transportationList;
  }

  public void clearDataFromFile(){
    model.clearDataFromFile();
  }


public void printInfo( int tTypeId, String vehicleType, String owner, String phoneNumber, String seatAvailable, String travelTime, String arrivalTime, String price ){  
      
    view.printTransportationInfo(model.getTTypeId(), model.getVehicleType(), 
        model.getOwner(), model.getPhoneNumber(), model.getSeatAvailable(),
        model.getTravelTime(), model.getArrivalTime(), model.getPrice(),model.getPosition(),model.getSection());

}

public void Insertion(Transportation newTransportation) {
}
}