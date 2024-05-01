package controller;
import view.AdministratorViewer;
import Model.Adiminstrator;
public class AdiminstratorController {

 private Adiminstrator model;
 private AdministratorViewer view;
            
        public AdiminstratorController( Adiminstrator model) {
                this.model=model;
            }

 
public int getAdminID(){
    return model.getAdminID();
}

        public void emergencyCase(String reason){
            model.emergencyCase(reason);
         System.out.println("the reason is :"+ reason);

        }

        public void infoAdmin(){
           view.infoAdmin(getAdminID(), "Ahmad Nawzad", "JourneyVista", 
           "AhmadAdmin@gmail.com", "07501234567", "ahmadNjourneyVista", "7777777");
            
        }

      /*   public String adminInformation(){
            return model.adminInformation();
        } */

        public void writeToFile(){
            model.writeToFile();
        }

        public void readFromFile(){
            model.readFromFile();
        }

        public void updateAdministratorData(int adminId, String newName, String newEmail, String newPhoneNumber){
            model.updateAdministratorData(adminId, newName, newEmail, newPhoneNumber);
        }

        public void removeAdministrator(int adminID){
            model.removeAdministrator(adminID);
        }


        public void adminInfo(String adminInfo) {
        }

}
