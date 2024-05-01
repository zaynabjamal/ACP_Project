package view;
import java.util.Scanner;

public class AdministratorViewer {

    public void infoAdmin(int adminID , String adminName ,String companyName,String email,String phoneNumber, String userName , String password ){
        System.out.println("Employee Details: ");  
        System.out.println("ID: " + adminID);  
        System.out.println("Admin Name: " + adminName);  
        System.out.println("Company Name: " + companyName); 
        System.out.println("email: " + email);  
        System.out.println("Phone Number: " + phoneNumber);  
        System.out.println("User Name: " + userName);  
        System.out.println("Password: " + password);  
        
    }

    
    /* 
    private AdiminstratorController controller;
    private Scanner scanner;

    public AdministratorViewer(AdiminstratorController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("Administrator Menu:");
            System.out.println("1. Handle Emergency Case");
            System.out.println("2. View Admin Information");
            System.out.println("3. Update Admin Data");
            System.out.println("4. Remove Administrator");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    handleEmergencyCase();
                    break;
                case 2:
                    viewAdminInformation();
                    break;
                case 3:
                    updateAdminData();
                    break;
                case 4:
                    removeAdministrator();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
        }
    }

    private void handleEmergencyCase() {
        System.out.print("Enter the reason for the emergency case: ");
        String reason = scanner.nextLine();
        controller.emergencyCase(reason);
    }

    private void viewAdminInformation() {
        String info = controller.adminInformation();
        System.out.println(info);
    }

    private void updateAdminData() {
        System.out.println("what is the Admin ID you want to update ?");
        int adminID = scanner.nextInt();
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new email: ");
        String newEmail = scanner.nextLine();
        System.out.print("Enter new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        controller.updateAdministratorData(adminID, newName, newEmail, newPhoneNumber);
    }

    private void removeAdministrator() {
        System.out.print("Enter the admin ID to confirm removal: ");
        int adminIDToRemove = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
    
        if (adminIDToRemove == controller.getAdminID()) {
            System.out.print("Are you sure you want to remove the administrator? (Y/N): ");
            String confirmation = scanner.nextLine();
    
            if (confirmation.equalsIgnoreCase("Y")) {
                controller.removeAdministrator(adminIDToRemove);
                System.out.println("Administrator removed.");
            }
        } else {
            System.out.println("Admin ID does not match. Administrator not removed.");
        }
    }
     */
}
