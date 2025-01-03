package top.homework.OperatingSystemP72;
/*
 * @author  MaRui
 * @date  2024/4/26 8:17
 * @version 1.0
 */


/**
 * @author MaRui
 */
import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 3224);

            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String sentence = "Hello, Server!";
            outToServer.writeBytes(sentence + '\n');

            String modifiedSentence = inFromServer.readLine();
            System.out.println("From Server: " + modifiedSentence);

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}