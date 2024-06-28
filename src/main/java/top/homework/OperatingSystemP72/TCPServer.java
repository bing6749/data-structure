package top.homework.OperatingSystemP72;
/*
 * @author  MaRui
 * @date  2024/4/26 8:16
 * @version 1.0
 */


/**
 * @author MaRui
 */
import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3224);
            System.out.println("Server is running and waiting for a client...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected...");

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(clientSocket.getOutputStream());

            String clientSentence = inFromClient.readLine();
            System.out.println("Received from client: " + clientSentence);

            String capitalizedSentence = clientSentence.toUpperCase() + '\n';
            outToClient.writeBytes(capitalizedSentence);

            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}