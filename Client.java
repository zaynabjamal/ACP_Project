import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // first insialize these objects
        Socket socket = null;
        DataInputStream dataIn = null;
        DataOutputStream dataOut = null;
        Scanner scanner = new Scanner(System.in);
        // second use the try catch
        try {
            socket = new Socket();
            socket.connect(new java.net.InetSocketAddress("localhost", 1234), 5000);
            System.out.println("Connection Successful from client");
            dataIn = new DataInputStream(socket.getInputStream());
            dataOut = new DataOutputStream(socket.getOutputStream());
            // this is a list of server's method
            System.out.println("This is server's method you can choose any method if you want!");
            System.out.println("number 1 for Inserting in Transportation " + "\n" +
                    "number 2 for Delete a Transportation by ID"+ "\n" +"number 3 for display Transporation "+
                     "\n" +"number 4 for Update data in the Transportation" +"\n"+ "number 5 for emergensy reason data in the Admin"
                      +"\n"+"number 6 for Admin information"+"\nnumber 7 to insert Tourist \nnumber 8 to remove Tourist "+
                     "\nnumber 9 to insert to  Guider \nnumber 10 to remove Guider ");
            // this part is getting clinets output
            while (true) {
                System.out.println("Please client can you enter an option:)");
                String userRequest = scanner.nextLine();
                switch (userRequest) {
                        case "1":
                        System.out.println("Please server can you give me inserting method of Transportaion class");
                        break;

                        case "2":
                        System.out.println("The ID you want to delete:");
                        break;

                        case "3":
                        System.out.println("Display:");
                        break;

                        case "4":
                        System.out.println("Update the data you have");
                        break;

                         case "5":
                        System.out.println("Emergency ");
                        break;

                        case "6":
                        System.out.println("Admin Info");
                        break;

                        case "7":
                        System.out.println("Insert data to Tourist ");
                        break;

                        case "8":
                        System.out.println("Remove Tourist");
                        break;


                        case"9" :
                        System.out.println(" insert to Guider ");
                        break;

                        case "10":
                        System.out.println("Remove Guider");

                       default:
                        break;
                }
                dataOut.writeUTF(userRequest);
                System.out.println("So dear this is server message :)");
                String serverMessage = dataIn.readUTF();
                System.err.println(serverMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // this is finally process of client class
        } finally {
            try {
                dataIn.close();
                dataOut.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace(); // Handle the exception accordingly
            }
        }
    }

}
