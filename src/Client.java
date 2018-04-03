import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;

class Client {


    public static void main(String args[]) throws IOException {

        App app = new App();
        app.start();
        
        Socket socket = new Socket("127.0.0.1", 1200);
        String input = null;

        do {
            input = app.getText1();
            System.out.print(input);
            System.out.print("");
        } while (input == null);

        Scanner scanner = new Scanner(input);
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        String msg = "";
        if (scanner.hasNextLine()){
        msg = scanner.nextLine();
        }


        String str = "GET / HTTP/1.1\r\nUser-Agent: Mozilla/4.0 (compatible; MSIE5.01; Windows NT)\r\n" +
                "Host: 127.0.0.1:1200\r\nAccept-Language: en-us\r\nAccept-Encoding: gzip, deflate\r\nConnection: keep-alive\r\n\r\n";

        try {
        	System.out.println(str);
        	app.getTextField2().setText(str);
            output.writeUTF(str); 

        } catch (IOException e) {
            e.printStackTrace();
        }


        BufferedReader inputMessage = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("2");

        String msgIn = "";
        try {
            System.out.println("4");

            while (true) {
                System.out.println("43");
                msgIn = inputMessage.readLine();
                System.out.println(msgIn);
                System.out.println("42");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("7");

        app.getTextField3().setText(msgIn);
        System.out.println(msgIn);
        System.out.println("1");

    }
}