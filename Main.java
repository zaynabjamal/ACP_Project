
// import java.time.LocalDate;
// import java.util.Date;
import java.util.LinkedList;
// import java.util.List;
// import java.util.Scanner;

import javax.swing.text.View;

import Model.Guider;
import Model.GuiderType;
import Model.Tourist;
import controller.GuiderController;
import controller.TouristController;
import view.GuiderView;
import view.TouristView;

public class Main {
   public static void main(String[] args) {


   Tourist t = new Tourist("sara1","sara2","sara3","sara4","sara5","sara6","sara7","sara8","sara9","sara10","sara11"
         ,"sara12","sara13","sara14");
         TouristView touristView= new TouristView();
         TouristController tc= new TouristController(t,touristView);
         // tc.insertTourist(t);
         // tc.deleteTourist("sara1");
        
        // tc.TouritDetalis("ff", "ff", "gg", "f", "saragg", "saragg", "saragg", "saragg", "saragg", "saragg", "saragg", "saragg", "saragg", "saragg");
       
          GuiderType guiderType= new GuiderType("hsfg", "hsfg", "hsfg", 0);
        Guider guider= new Guider("d", "hh", "jj", "jjjj", guiderType, "jjjj");
        GuiderView guiderView=new GuiderView();
        GuiderController guiderController=new GuiderController(guider, guiderType, guiderView);
       // guiderController.insertGuider(guider);
       // guiderController.insertGuiderType(guiderType);
       // guiderController.deleteGuider("0");
        guiderController.deleteGuiderType("9");
       // guiderController.GuiderDetalis("kkkkk", "kkkkk", "kkkkk", "kkkkk", "kkkkk", "kkkkk", 0, "kkkkk");
     
        /*   // Parse command line arguments
        if (args.length > 0) {
            String command = args[0];
            System.out.println("write");
            switch (command) {
                case "1":
                   System.out.println( tc.getAge());
                    System.out.println("sussifull 1");
                    break;
                case "2":
                   tc.getEmail();
                   System.out.println("sussifull 2");
                    break;
                default:
                    System.out.println("Unknown command. Provide a valid command.");
                    break;
            }
        } else {
            System.out.println("Please provide a command.");
        }
               

      ///////////////////////////////////////////// Zaynab Jamal
      // Create a Linked list to add flight object into*/
    /*   LinkedList<Flight> flightList = new LinkedList<>();
      Flight flight = new Flight("F001", "TurkishAirline", "Erbil", "Dubai",2
            "12/2/2021", "13/2/2021", "normal", 2000);
      flightList.add(flight);

      // adding these date into Date.txt file
      System.out.println("The File Writer is :  ");
      flight.fileWriter(flightList);

      System.out.println("--------------------------------------");

      // Reading date file
      System.out.println("The File Reader is :  ");
      flight.fileReader("Date.txt");*/

      ///////////////////////////////////////////////////////////// Sarah Fariq
      // ACCOMANDATION
      // <Accommodation> accommodationList = new LinkedList<>();

      /*
       * Create an instance of the Accommodation class
       * Accommodation accommodation = new Accommodation();
       * // Add data to the accommodationList
       * accommodation.addData(1, "Accommodation 1", 200.0, new Date(), "Features", 1,
       * "Location 1", 1, accommodationList);
       * accommodation.addData(2, "Accommodation 2", 150.0, new Date(), "Features", 1,
       * "Location 2", 2, accommodationList);
       * accommodation.addData(3, "Accommodation 3", 180.0, new Date(), "Features", 1,
       * "Location 3", 3, accommodationList);
       * // Display the data
       * System.out.println("Accommodation List:");
       * accommodation.displayData(accommodationList);
       */
      // Accommodation accommodation = new Accommodation(1, "Sample Accommodation",
      // 100.0, new Date(), "Features", 1, "Location", 1);

      // available date set dakain ba methody setAvailableDate
      // Date newAvailableDate = new Date(); // You can set a new available date here
      // accommodation.setAvailableDate(newAvailableDate);

      // Display
      // System.out.println(accommodation.toString());

      // // check daka ka agar aw accomandation'a AccessibilityFeatures'y haya yan na
      // boolean hasAccessibilityFeatures = accommodation.hasAccessibilityFeatures();

      // // Display the result
      // if (hasAccessibilityFeatures) {
      // System.out.println("This accommodation has accessibility features.");
      // } else {
      // System.out.println("This accommodation does not have accessibility
      // features.");
      // }

      // String formattedDate = "2023-10-30"; // Replace with the date chosen by the
      // user
      // Date chosenDate = accommodation.chooseDate(formattedDate);

      // if (chosenDate != null) {
      // accommodation.setAvailableDate(chosenDate);
      // System.out.println("ur date is: " + chosenDate);
      // }

      // // ACCOMANDATION TYPE
      // // Create a list of available accommodation types
      // AccommodationType type1 = new AccommodationType(1, "Hotel ", "Luxurious
      // accommodations");
      // AccommodationType type2 = new AccommodationType(2, "Motel ", "Affordable
      // accommodations");
      // AccommodationType type3 = new AccommodationType(3, "House ", "Rent a whole
      // house");
      // List<AccommodationType> accommodationTypes = List.of(type1, type2, type3);
      // AccommodationType exampleType = new AccommodationType(4, "Example Type", "An
      // example type");
      // exampleType.chooseAccommodationType(accommodationTypes);

      // // Create an instance of AccommodationType
      // AccommodationType accommodationType = new AccommodationType();
      // // Add data to the list (you can add data as shown in the previous example)
      // accommodationType.addData(1, "Hotel", "Luxury hotel description");
      // accommodationType.addData(2, "Motel", "Budget motel description");
      // accommodationType.addData(3, "House", "Vacation house description");

      // // Remove data at a specific index
      // int indexToRemove = 0; // Index of the data to be removed
      // accommodationType.removeData(indexToRemove);
      // // Print the updated data
      // accommodationType.displayData();

      // // ROOM TYPE
      // // Create an instance of the RoomType class
      // RoomType room = new RoomType(1, "101", 100.0);

      // // Create a linked list to store room types
      // LinkedList<String> roomTypes = new LinkedList<>();
      // // Adding room types to the linked list
      // roomTypes.add("Single Room");
      // roomTypes.add("Twin/Double Room");
      // roomTypes.add("Studio Room");
      // roomTypes.add("Deluxe Room");
      // roomTypes.add("Room with a View");
      // roomTypes.add("Suite");
      // roomTypes.add("Presidential Suite");

      // // Display available room types
      // room.displayAvailableRoomTypes();

      // // Use Scanner to allow the user to choose a room type
      // Scanner scanner = new Scanner(System.in);
      // System.out.println("Choose a room type by entering the corresponding
      // number:");
      // for (int i = 0; i < roomTypes.size(); i++) {
      // System.out.println((i + 1) + ". " + roomTypes.get(i));
      // }

      // System.out.print("Please select your Room Type: ");
      // int choice = scanner.nextInt();
      // if (choice >= 1 && choice <= roomTypes.size()) {
      // String selectedRoomType = roomTypes.get(choice - 1);
      // room.chooseRoomType(selectedRoomType);
      // System.out.println("Your Selected room type is: " + room.getRoomType());
      // System.out.println("Your room's Description is: " +
      // room.getRoomDescription());
      // } else {
      // System.out.println("Invalid choice.");
      // }
      // scanner.close();

      // // Assuming the user selected a room type (e.g., "Single Room").
      // String selectedRoomType = room.getRoomType();
      // double price = room.getPriceByRoomType(selectedRoomType);

      // if (price > 0.0) {
      // System.out.println("Selected room type: " + selectedRoomType);
      // System.out.println("Price: $" + price);
      // } else {
      // System.out.println("Invalid room type selected.");
      // }

      // // PAYMAENT
      // // Example: Create a Payment object with paymentDate and paymentMethod
      // LocalDate paymentDate = LocalDate.of(2023, 11, 1); // Set the payment date
      // System.out.println("Payment Local Date (The Date you have registered): " +
      // paymentDate);
      // // String paymentMethod = "Credit Card"; // Set the payment method

      // Payment payment = new Payment(paymentDate);

      // // Calculate and print the due date
      // LocalDate dueDate = payment.calculateDueDate();
      // System.out.println("Payment Due Date: " + dueDate);

      // Payment paymentt = new Payment();
      // payment.choosePaymentMethod(); // User selects the payment method
      // String selectedPaymentMethod = paymentt.getPaymentMethod();
      // System.out.println("Selected payment method: " + selectedPaymentMethod);

      // Payment paymentt = new Payment(); // Create an instance of the Payment class
      // paymentt.paymentMethod(); // Call the paymentMethod method
      // String selectedPaymentMethod = paymentt.getPaymentMethod(); // Access the
      // paymentMethod attribute
      // System.out.println("Selected payment method: " + selectedPaymentMethod);

      // String Payment = new Payment(/* constructor arguments */);
      // String statusMessage = payment.checkPaymentStatus();
      // System.out.println(statusMessage);

      //////////////////////////////////////////////////////////////// Sana Assi
      // LinkedList<Transportation> transportationList = new LinkedList<>();

      // Transportation transportation = new Transportation(1, "car", "Ahmad",
      // "1234567890", "2", Date.valueOf("2023-05-15"), Date.valueOf("2023-05-17"),
      // "$50.00");
      // Transportation transportation2 = new Transportation(2, "bus", "Sara",
      // "1234567890", "2", Date.valueOf("2023-05-15"), Date.valueOf("2023-05-17"),
      // "$70.00");

      // transportation.insertTransportation(1, "car", "Ahmad", "1234567890", "2",
      // "2023-05-15", "2023-05-17", "$50.00", 1, "car");
      // transportation2.insertTransportation(2, "bus", "Sara", "1234567890", "2",
      // "2023-05-15", "2023-05-17", "$70.00", 2, "bus");

      // transportationList.add(transportation);
      // transportationList.add(transportation2);

      // System.out.println("Initial Transportation List:");
      // displayTransportationList(transportationList);

      // System.out.println("UPDATED DATA");
      // String updatedData =
      // "{'tTypeId':3,'vehicleType':'Bus','owner':'AHAA','phoneNumber':'123-456-7890','seatAvailable':'7','travelTime':'2023-10-30','arrivalTime':'2023-11-01','price':'60.00'}";
      // updateTransportationById(transportationList, 1, updatedData);

      // System.out.println("Deleted DATA");
      // removeTransportationById(transportationList, 2);

      // clearAndWriteDataToFile(transportationList);

      // System.out.println("Final Transportation List:");
      // displayTransportationList(transportationList);

      // Adiminstrator administrator = new Adiminstrator(1);

      // // Write the Administrator data to the file
      // administrator.writeToFile();

      // System.out.println("Administrator Data from File:");
      // Adiminstrator.readFromFile();

      /*
       * String updatedData2 =
       * "{'tTypeId':3,'vehicleType':'Bus','owner':'Sana','phoneNumber':'123-456-7890','seatAvailable':'7','travelTime':'2023-10-30','arrivalTime':'2023-11-01','price':'60.00'}";
       * transportation.updateDataInFile(2, updatedData2);
       * 
       */

      /*
       * transportation.writeToFile();
       * transportation2.writeToFile();
       */
      // transportation.readFromFile();

      // }
      // private static void displayTransportationList(LinkedList<Transportation>
      // transportationList) {
      // for (Transportation transportation : transportationList) {
      // System.out.println(transportation);
      // }
      // }

      // public static void updateTransportationById(LinkedList<Transportation> list,
      // int tTypeId, String updatedData) {
      // for (Transportation t : list) {
      // System.out.println("Checking object with ID: " + t.getTTypeId());
      // if (t.tTypeId == tTypeId) {
      // System.out.println("Updating object with ID: " + tTypeId);
      // t.updateDataInFile(tTypeId, updatedData);
      // clearAndWriteDataToFile(list);

      // break;
      // }
      // }
      // }

      // public static void removeTransportationById(LinkedList<Transportation> list,
      // int tTypeId) {
      // list.removeIf(t -> t.getTTypeId() == tTypeId);
      // }

      // public static void clearAndWriteDataToFile(LinkedList<Transportation> list) {
      // Transportation.clearDataFromFile();
      // for (Transportation t : list) {
      // t.writeToFile();
      // }
      // }
      // }

      // /*
      // LinkedList<Transportation> mainTransportationList = new LinkedList<>();

      // // Create a Transportation object
      // Transportation transportation = new Transportation(1, "car", "John",
      // "1234567890", "2", Date.valueOf("2023-05-15"), Date.valueOf("2023-05-17"),
      // "$50.00");

      // // Insert transportation record
      // transportation.insertTransportation(1, "car", "John", "1234567890", "2",
      // "2023-11-01", "2023-11-02", "$50.00", 1, "car");
      // mainTransportationList.add(transportation);

      // // Display the main list after inserting
      // System.out.println("Transportation List After Inserting:");
      // displayTransportationList(mainTransportationList);

      // // Remove a transportation record by tTypeId
      // mainTransportationList.remove(transportation);

      // // Display the main list after removing
      // System.out.println("Transportation List After Removing:");
      // displayTransportationList(mainTransportationList);

      // transportation.loadTransportationList();
      // }

      // private static void displayTransportationList(LinkedList<Transportation>
      // transportationList) {
      // for (Transportation transportation : transportationList) {
      // System.out.println(transportation);

      // }
   }
}