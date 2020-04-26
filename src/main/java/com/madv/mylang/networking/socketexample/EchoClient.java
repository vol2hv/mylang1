package com.madv.mylang.networking.socketexample;


import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        String hostName = "localhost";
        int portNumber = 5500;

        try (
                Socket echoSocket = new Socket(hostName, portNumber);
                PrintWriter out =
                        new PrintWriter(echoSocket.getOutputStream(), true);
                BufferedReader in =
                        new BufferedReader(
                                new InputStreamReader(echoSocket.getInputStream()));
                BufferedReader stdIn =
                        new BufferedReader(
                                new InputStreamReader(System.in))
        ) {
            String userInput;
            String serverResponse;
            System.out.println("Клиент готов к вводу инфотмации:");
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                serverResponse = in.readLine();
                System.out.println("echo: " + serverResponse);
                if (serverResponse.equals("Сервер завершил работу")) {
                    System.out.println("Клиент завершил работу.");
                    System.exit(0);
                }
            }
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                    hostName);
            System.exit(1);
        }
    }
}
