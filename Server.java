import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import Model.*;
import controller.*;
import view.*;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            LinkedList<Transportation> list = new LinkedList<>();
            LinkedList<Tourist> listTourists = new LinkedList<>();
            LinkedList<GuiderController> listguider = new LinkedList<>();
             Transportation trans = new Transportation(1, "car","sana","123355555","dff4","2023-05-06" ,"2023-05-07","$25");
            TransportationController TransporationController = new TransportationController(trans);
            Adiminstrator admin=new Adiminstrator(1);
            AdiminstratorController AdminController = new AdiminstratorController(admin);
            Tourist tourist= new Tourist("1", "lava", "ramzi", "kurd", "lavaramzi@gmail.com", "7504565544", "hawler", "femail", "20", "lavaramzi87", "lava1234", "82847dd33", "no", "no");
            TouristView touristView= new TouristView();
            TouristController touristController=new TouristController(tourist,touristView);
            GuiderType guiderType=new GuiderType("1", "sana", "Group Tour", 500);
            Guider guider = new Guider("1", "sanaassi88@gmail.com", "7503452312", "kurdish", guiderType, "yes");
            GuiderView guiderView= new GuiderView();
            GuiderController guiderController=new GuiderController(guider, guiderType,guiderView);
            serverSocket = new ServerSocket(1234);
            System.out.println("Server starting : wating for client ");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client Connected: " + clientSocket);

                // Create a new thread for each client
                ClientHandler clientHandler = new ClientHandler(clientSocket, list,listTourists,listguider, TransporationController, 
                AdminController,touristController,guiderController,tourist);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (serverSocket != null)
                    serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class ClientHandler implements Runnable {
    Transportation trans = new Transportation(1, "car", "sana", "123355555", "dff4", "2023-05-06", "2023-05-07", "$25");
    private Socket clientSocket;
    private LinkedList<Transportation> list;
    private LinkedList<Tourist> listTourists;
    private LinkedList<GuiderController> listguiders;
    private TouristController touristController;
    private GuiderController guiderController;
    private TransportationController transportationController;
    private AdiminstratorController adminController;
    private Tourist tourist;
    

    public ClientHandler(Socket clientSocket, LinkedList<Transportation> list,LinkedList<Tourist> listTourists,LinkedList<GuiderController> listguiders,
                       TransportationController  transporationController,AdiminstratorController adminController,TouristController touristController,
                        GuiderController guiderController , Tourist tourist) {
        this.clientSocket = clientSocket;
        this.list = list;
        this.listTourists=listTourists;
        this.listguiders=listguiders;
        this.touristController=touristController;
        this.guiderController=guiderController;
        this.transportationController = transporationController;
        this.adminController = adminController;
    }

    @Override
    public void run() {
        try (
                DataInputStream dataIn = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream dataOut = new DataOutputStream(clientSocket.getOutputStream())
        ) {
            String clientMessage = dataIn.readUTF();
            switch (clientMessage) {
                   case "1":
                    list.add(trans);
                        System.out.println("You entered number one now we can send you inserting method of Transportaion class");
                        transportationController.Insertion(1,"car","sana","123355555","dff4","2023-05-06" ,"2023-05-07","$25",1,"car");
                        String trasnportationString = list.toString();
                        dataOut.writeUTF(trasnportationString);
                        break;

                    case "2":

                    int removeID =1;
                      list.add(trans);
                    System.out.println("the ID you want to delete :" + removeID);
                    transportationController.removeByTTypeId(list, removeID);
                   // String trasnportationStringRe = list.toString();
                    dataOut.writeUTF("the data is deleted");
                    break;

                    case "3":
                      list.add(trans);
                    transportationController.displayTransportationList(list);
                     String trasnportationStringGetAll =list.toString();
                    dataOut.writeUTF(trasnportationStringGetAll);
                     break;

                    case"4":
                      list.add(trans);
                    int updateID=1;
                    transportationController.updateDataById(list, updateID, new Transportation(updateID, "bus", "sana", "123568", "gg44", "2023-05-04", "2023-05-06", "$15"));
                    dataOut.writeUTF(" 1 ,bus, sana, 123568, gg44, 2023-05-04, 2023-05-06 , $15");
                    break;

                    case "5":
                    String reason ="bad weather";
                    adminController.emergencyCase(reason);
                    dataOut.writeUTF("the reason of emergency case is " + reason);
                    break;

                    case "6":
                      System.out.print("the Admin Info : ");
                      dataOut.writeUTF("Admin Name : Ahmad" +"\n"+ "phone Number : 07501234567"+ "\n" + "email :AhmadAdmin@gmail.com");
                     break;
                    
                    case "7":
                    System.out.println("You entered number 7 ");
                    tourist = new Tourist("2", "sana", "assi", "kurd", "sanaassi22@gmail.com", "7503453432", 
                    "hawler", "femail", "20", "Sana-assi", "aaa22345", "34322sd234", "no", "no");
                    touristController.insertTourist(tourist);
                    listTourists.add(tourist);
                    String tourisString=listTourists.toString();
                    System.out.println("insert data successfully ");
                    dataOut.writeUTF(tourisString);
                    break;

                    case "8":
                    String removeid ="2";
                    listTourists.add(tourist);
                    System.out.println("the ID you want to delete :" + removeid);
                    touristController.deleteTourist(removeid);
                    dataOut.writeUTF("the data is deleted");
                    break;
                     
                    case "9":
                    listguiders.add(guiderController);
                    guiderController.GuiderDetalis("3","zaynabjamal7$gmail.com", "750453233", 
                    "kurdish", "zaynab", "Group Tour", 600, "yes");
                    dataOut.writeUTF("insert Guider");
                    break;
                    case "10":
                    String remove="3";
                    System.out.println("the ID you want to delete :" + remove);
                    guiderController.deleteGuider(remove);
                    dataOut.writeUTF("the data is deleted");
                    break;
            }

            String serverMessage = "Hi, this is coming from the server!";
            dataOut.writeUTF(serverMessage);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}





/* 

/* 
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import Model.*;
import controller.*;
import view.GuiderView;
import view.TouristView;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        try {

            LinkedList<Transportation> list = new LinkedList<>();
            LinkedList<Tourist> listTourists = new LinkedList<>();
            LinkedList<GuiderController> listguider = new LinkedList<>();
             Transportation trans = new Transportation(1, "car","sana","123355555","dff4","2023-05-06" ,"2023-05-07","$25");
            TransportationController TransporationController = new TransportationController(trans);
            Adiminstrator admin=new Adiminstrator(1);
            AdiminstratorController AdminController = new AdiminstratorController(admin);
            Tourist tourist= new Tourist("1", "lava", "ramzi", "kurd", "lavaramzi@gmail.com", "7504565544", "hawler", "femail", "20", "lavaramzi87", "lava1234", "82847dd33", "no", "no");
            TouristView touristView= new TouristView();
            TouristController touristController=new TouristController(tourist,touristView);
            GuiderType guiderType=new GuiderType("1", "sana", "Group Tour", 500);
            Guider guider = new Guider("1", "sanaassi88@gmail.com", "7503452312", "kurdish", guiderType, "yes");
            GuiderView guiderView= new GuiderView();
            GuiderController guiderController=new GuiderController(guider, guiderType,guiderView);
            serverSocket = new ServerSocket(1234);
            System.out.println("Server starting : wating for client ");
            while (true) {
                Socket clienSocket = serverSocket.accept();
                System.out.println("Client Connect : " + clienSocket);
                DataInputStream dataIn = new DataInputStream(clienSocket.getInputStream());
                DataOutputStream dataOut = new DataOutputStream(clienSocket.getOutputStream());
                String clientMessage = dataIn.readUTF();
                switch (clientMessage) {

                    case "1":
                    list.add(trans);
                        System.out.println("You entered number one now we can send you inserting method of Transportaion class");
                        TransporationController.Insertion(1,"car","sana","123355555","dff4","2023-05-06" ,"2023-05-07","$25",1,"car");
                        String trasnportationString = list.toString();
                        dataOut.writeUTF(trasnportationString);
                        break;

                    case "2":

                    int removeID =1;
                      list.add(trans);
                    System.out.println("the ID you want to delete :" + removeID);
                    TransporationController.removeByTTypeId(list, removeID);
                   // String trasnportationStringRe = list.toString();
                    dataOut.writeUTF("the data is deleted");
                    break;

                    case "3":
                      list.add(trans);
                    TransporationController.displayTransportationList(list);
                     String trasnportationStringGetAll =list.toString();
                    dataOut.writeUTF(trasnportationStringGetAll);
                     break;

                    case"4":
                      list.add(trans);
                    int updateID=1;
                    TransporationController.updateDataById(list, updateID, new Transportation(updateID, "bus", "sana", "123568", "gg44", "2023-05-04", "2023-05-06", "$15"));
                    dataOut.writeUTF(" 1 ,bus, sana, 123568, gg44, 2023-05-04, 2023-05-06 , $15");
                    break;

                    case "5":
                    String reason ="bad weather";
                    AdminController.emergencyCase(reason);
                    dataOut.writeUTF("the reason of emergency case is " + reason);
                    break;

                    case "6":
                      System.out.print("the Admin Info : ");
                      dataOut.writeUTF("Admin Name : Ahmad" +"\n"+ "phone Number : 07501234567"+ "\n" + "email :AhmadAdmin@gmail.com");
                     break;
                    
                    case "7":
                    System.out.println("You entered number 7 ");
                    tourist = new Tourist("2", "sana", "assi", "kurd", "sanaassi22@gmail.com", "7503453432", 
                    "hawler", "femail", "20", "Sana-assi", "aaa22345", "34322sd234", "no", "no");
                    touristController.insertTourist(tourist);
                    listTourists.add(tourist);
                    String tourisString=listTourists.toString();
                    System.out.println("insert data successfully ");
                    dataOut.writeUTF(tourisString);
                    break;

                    case "8":
                    String removeid ="2";
                    listTourists.add(tourist);
                    System.out.println("the ID you want to delete :" + removeid);
                    touristController.deleteTourist(removeid);
                    dataOut.writeUTF("the data is deleted");
                    break;
                     
                    case "9":
                    listguider.add(guiderController);
                    guiderController.GuiderDetalis("3","zaynabjamal7$gmail.com", "750453233", 
                    "kurdish", "zaynab", "Group Tour", 600, "yes");
                    dataOut.writeUTF("insert Guider");
                    break;
                    case "10":
                    String remove="3";
                    System.out.println("the ID you want to delete :" + remove);
                    guiderController.deleteGuider(remove);
                    dataOut.writeUTF("the data is deleted");
                    break;
                    }


                System.out.println(clientMessage);
                String serverMessage = "hi this is coming from server!";
                dataOut.writeUTF(serverMessage);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if (serverSocket != null)
                    serverSocket.close();
                if (clientSocket != null)
                    clientSocket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
*/