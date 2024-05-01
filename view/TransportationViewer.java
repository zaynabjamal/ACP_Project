package view;

/* import java.sql.Date;
import java.util.LinkedList;
import java.util.Scanner; */

public class TransportationViewer {
    
    //print krdni datakan
    public void printTransportationInfo ( int tTypeId, String vehicleType, String owner, String phoneNumber, String seatAvailable, String travelTime, String arrivalTime, String price,int position,String section ){  
        System.out.println("Employee Details: ");  
        System.out.println("ID: " + tTypeId);  
        System.out.println("Vhicle Type: " + vehicleType);  
        System.out.println("owner: " + owner); 
        System.out.println("phoneNumber: " + phoneNumber);  
        System.out.println("seatAvailable: " + seatAvailable);  
        System.out.println("travelTime: " + travelTime);  
        System.out.println("arrivalTime: " + arrivalTime);  
        System.out.println("price: " + price);
        System.out.println("position: " + position);  
        System.out.println("section: " + section);  
  

 
     }  
  } 
    
    

    
   
    /* 

    private TransportationController controller;
    Scanner input = new Scanner(System.in);

    public void start(){
        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add Transportation");
            System.out.println("2. Remove Transportation");
            System.out.println("3. Update Transportation");
            System.out.println("4. Display Transportation List");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                   addTransportation();
                    break;
                case 2:
                   removeTransportation();
                    break;
                case 3:
                    updateTransportation();
                    break;
                case 4:
                  displayTransportationList();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
  

    public TransportationViewer(TransportationController controller) {
        this.controller = controller;
    }

    public void addTransportation() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Transportation Details:");
        System.out.print("TTypeId: ");
        int tTypeId = input.nextInt();
        input.nextLine();  // Consume the newline character
        System.out.print("Vehicle Type: ");
        String vehicleType = input.nextLine();
        System.out.print("Owner: ");
        String owner = input.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = input.nextLine();
        System.out.print("Seat Available: ");
        String seatAvailable = input.nextLine();
        System.out.print("Travel Time: ");
        String travelTime = input.nextLine();
        System.out.print("Arrival Time: ");
        String arrivalTime = input.nextLine();
        System.out.print("Price: ");
        String price = input.nextLine();
        System.out.print("Position: ");
        int position = input.nextInt();
        input.nextLine();  // Consume the newline character
        System.out.print("Section: ");
        String section = input.nextLine();

        controller.Insertion(tTypeId, vehicleType, owner, phoneNumber, seatAvailable, travelTime, arrivalTime, price, position, section);
        System.out.println("Transportation added successfully.");
    }

    public void removeTransportation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter TTypeId to remove: ");
        int tTypeIdToRemove = input.nextInt();
        
        LinkedList<Transportation> transportationList = controller.getAllTransportations();
        
        boolean removed = false;
        for (Transportation transportation : transportationList) {
            if (transportation.getTTypeId() == tTypeIdToRemove) {
                controller.removeByTTypeId(transportationList, tTypeIdToRemove);
                System.out.println("Transportation with TTypeId " + tTypeIdToRemove + " removed.");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Transportation with TTypeId " + tTypeIdToRemove + " not found.");
        }
    }
    public void updateTransportation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter TTypeId to update: ");
        int tTypeIdToUpdate = input.nextInt();
    
        LinkedList<Transportation> transportationList = controller.getAllTransportations();
        
        boolean updated = false;
        for (Transportation transportation : transportationList) {
            if (transportation.getTTypeId() == tTypeIdToUpdate) {
                System.out.println("Enter updated Transportation Details:");
    
                System.out.print("Vehicle Type: ");
                String vehicleType = input.nextLine();
                
                // Collect other updated information here
                System.out.print("Owner: ");
                String owner = input.nextLine();
                System.out.print("Phone Number: ");
                String phoneNumber = input.nextLine();
                System.out.print("Seat Available: ");
                String seatAvailable = input.nextLine();
                System.out.print("Travel Time: ");
                String travelTime = input.nextLine();
                System.out.print("Arrival Time: ");
                String arrivalTime = input.nextLine();
                System.out.print("Price: ");
                String price = input.nextLine();
                
                Transportation updatedTransportation = new Transportation(
                    tTypeIdToUpdate, vehicleType, owner, phoneNumber, seatAvailable, 
                    travelTime,arrivalTime, price
                );
                
                controller.updateDataById(transportationList, tTypeIdToUpdate, updatedTransportation);
                System.out.println("Transportation with TTypeId " + tTypeIdToUpdate + " updated.");
                updated = true;
                break;
            }
        }
    
        if (!updated) {
            System.out.println("Transportation with TTypeId " + tTypeIdToUpdate + " not found.");
        }
    }
    

    public void displayTransportationList() {
        LinkedList<Transportation> transportationList = controller.getAllTransportations();
        
        if (transportationList.isEmpty()) {
            System.out.println("No transportation data available.");
        } else {
            System.out.println("Transportation List:");
            controller.displayTransportationList(transportationList);
        }
    }
 */
