package Model;
import java.util.LinkedList;
import java.util.ListIterator;


public class TransPortationType  {

    protected int tTypeId;
    private String vehicleType;
    private String owner;
    private String phoneNumber;
    private String seatAvailable;
    private String travelTime;
    private String arrivalTime;
    private String price;
    private int position;
    private String section;
    public LinkedList<TransPortationType> transportationList =new LinkedList<>();

    public TransPortationType( int tTypeId , String vehicleType , String owner, String phoneNumber, String seatAvailable,  String travelTime, String arrivalTime, String price) {
        this.tTypeId = tTypeId;
        this.vehicleType= vehicleType;
        this.owner = owner;
        this.phoneNumber = phoneNumber;
        this.seatAvailable = seatAvailable;
        this.travelTime = travelTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        this.position = position;
        this.section = section;

    }

    //Setters & Getters
    public void setTTypeId(int tTypeId) {
        this.tTypeId = tTypeId;
    }

    public int getTTypeId() {
        return this.tTypeId;
    }

      public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

      public void setSection(String section) {
        this.section = section;
    }

    public String getSection() {
        return this.section;
    }


    

    public void setVehiclType(String vehicleType) {
         if (vehicleType != null && !vehicleType.isEmpty()) {
              this.vehicleType = vehicleType;
           
        }
      
    }

    public String getVehicleType() {
        return this.vehicleType;
    }


    public void setOwner(String owner) {
        if (owner != null && !owner.isEmpty()) {
            if (owner.length() >= 2 && owner.length() <= 50) { // dabi nawi kasaka la bayni awanda character'a pek be 
                // Owner name should be between 2 and 50 characters
                this.owner = owner;
                System.out.println("Owner name set successfully: " + owner);
            } else {
                System.out.println("Invalid owner name length: Owner name should be between 2 and 50 characters");
            }
        } else {
            System.out.println("Invalid owner name: Empty or null value");
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber != null && phoneNumber.length() >= 0 && phoneNumber.length() <= 8) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setSeatAvailable(String seatAvailable) {
        if (seatAvailable != null && !seatAvailable.isEmpty()) {
            this.seatAvailable = seatAvailable;
        }
    }

    public String getSeatAvailable() {
        return seatAvailable;
    }

    public void setTravelTime(String travelTime) {
        // Parse travelTime from the provided string
      
            this.travelTime = travelTime;// dateFormat.parse(traveltime) detn aw Stringay la constructor
            // drwstman krdia dakata sar formati Date, getTime() /*awanday tegayshtm  */ labo awaya date dakata milisecond hata la sa3at 00:00 dastpebka
 // labo dyarikrdni aw bashaya la stacki methodaka  ka la chendar erroraka haya w throw kraya 
        
    }

    public String getTravelTime() {
        return this.travelTime;
    }

    public void setArrivalTime(String arrivalTime) {
        // Parse arrivalTime from the provided string
       this.arrivalTime=arrivalTime;
    }

    public String getArrivalTime() {
        return this.arrivalTime;
    }

    public void setPrice(String price) {
        String expectedCurrencySymbol = "$"; // Define the expected currency symbol
    
        if (price != null && !price.isEmpty()) {
            if (price.matches("^\\$\\d+\\.\\d{2}$") && price.startsWith(expectedCurrencySymbol)) {
                // matches() check krdna w search krdna ka aw stringa law symbolanay tedaya
                // startwith() check daka ka agar bidayati stringaka ba $ dasti pe krdbi
                this.price = price;
                System.out.println("Price set successfully: " + price);
            } else {
                System.out.println("Invalid price currency symbol: " + price);
            }
        } else {
            System.out.println("Invalid price: Empty or null value");
        }
    }
    

    public String getPrice() {
        return price;
    }

    // check'krdnawa ka bzanin kwrsi bardast haya !
    private boolean hasAvailableSeat (TransPortationType transportation){
     
        return !transportation.getSeatAvailable().isEmpty();
    }

    
    public void insertTransportation(int tTypeId, String vehicleType, String owner, String phoneNumber, String seatAvailable, String travelTime, String arrivalTime, String price, int position, String section) {
        TransPortationType newTransportation = new TransPortationType(tTypeId, vehicleType, owner, phoneNumber, seatAvailable, travelTime, arrivalTime, price);
    
            newTransportation.setTTypeId(tTypeId);
            newTransportation.setVehiclType(vehicleType);
            newTransportation.setOwner(owner);
            newTransportation.setPhoneNumber(phoneNumber);
            newTransportation.setSeatAvailable(seatAvailable);
            newTransportation.setTravelTime(travelTime);
            newTransportation.setArrivalTime(arrivalTime);
            newTransportation.setPrice(price);

        if (newTransportation.getSeatAvailable() != null && hasAvailableSeat(newTransportation)) {

            if (newTransportation.getVehicleType() != null) {

                if (newTransportation.getVehicleType().equalsIgnoreCase("car")) {

                    insertInCarSection(newTransportation, position);
                } 
                else if (newTransportation.getVehicleType().equalsIgnoreCase("bus")) {
                    insertInBusSection(newTransportation, position);
                } 
                else {
                    System.out.println("Unknown vehicle type: " + newTransportation.getVehicleType());
                }
            } else {
                System.out.println("Vehicle type is not specified.");
            }
        } else {
            System.out.println("No available seats for transportation.");
        }
    
        // datakan lanaw listaka xazn dabn
        transportationList.add(newTransportation);

        System.out.println("Inserting New Transportation:");
        System.out.println("tTypeId: " + newTransportation.getTTypeId());
        System.out.println("Vehicle Type: " + newTransportation.getVehicleType());
        System.out.println("Owner: " + newTransportation.getOwner());
        System.out.println("Phone Number: " + newTransportation.getPhoneNumber());
        System.out.println("Seat Available: " + newTransportation.getSeatAvailable());
        System.out.println("Travel Time: " + newTransportation.getTravelTime());
        System.out.println("Arrival Time: " + newTransportation.getArrivalTime());
        System.out.println("Price: " + newTransportation.getPrice());
    }
    
    
    // insert krdn bapey "car"
    private void insertInCarSection(TransPortationType transportation, int desiredPosition) {
        ListIterator<TransPortationType> iterator = transportationList.listIterator();
        
        while (iterator.hasNext()) {
            TransPortationType item = iterator.next();
            if (item.getTTypeId() == desiredPosition) { 
                iterator.add(transportation); 
                return; 
            }
        }
        
        // If we didn't find the specified position, or if the list is empty, add at the end
        iterator.add(transportation);
    }
    
    // insert krd bapey bus
    private void insertInBusSection(TransPortationType transportation, int desiredPosition) {
        ListIterator<TransPortationType> iterator = transportationList.listIterator();
        
        while (iterator.hasNext()) {
            TransPortationType item = iterator.next();
            if (item.getTTypeId() == desiredPosition) {
                iterator.add(transportation); 
                return;
            }
        }
        
        // agar law postiona je nabw awa la axiri zyadi daka
        iterator.add(transportation);
    }


public void removeByTTypeId(LinkedList<Transportation> transportationList, int tTypeIdToRemove) {
    ListIterator<Transportation> iterator = transportationList.listIterator();
    while (iterator.hasNext()) {
        Transportation transportation = iterator.next();
        if (transportation.getTTypeId() == tTypeIdToRemove) {
            iterator.remove();
            System.out.println("Removed transportation with tTypeId " + tTypeIdToRemove);
            return;
        }
    }
    System.out.println("Transportation with tTypeId " + tTypeIdToRemove + " not found, No transportation removed.");
}


public String toString() {
    return "[" +
     "\n"+
    "{" +
           "'tTypeId':" + getTTypeId() +
          "\n"+ "'vehicleType': " + "'"+getVehicleType()  +"' ,"+
           "\n"+"'owner': "  + "'"+getOwner() +"' ,"+
           "\n"+"'phoneNumber': "+"'"+getPhoneNumber() +"' ,"+
           "\n"+"'seatAvailable': " +"'"+getSeatAvailable() +"' ,"+
           "\n"+"'travelTime': " +"'"+ getTravelTime() +"' ,"+
           "\n"+"'arrivalTime': " +"'"+getArrivalTime() +"' ,"+
           "\n"+"'price': " +"'"+ getPrice() +"'"+"}" + 
           "\n"+
           "]";
}

}















