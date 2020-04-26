package com.madv.mylang.networking;
/**
 * тест работает с сервелетом com/madv/reverseservlet/ReverseServlet.java
 */
import org.junit.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Reverse {
    @Test
    public void sendMessage() throws IOException {
        String mes = "Привет семье!";
        URL url = new URL("http://localhost:8080/my-app/rev-servlet");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        OutputStreamWriter out = new OutputStreamWriter(
                connection.getOutputStream());
        out.write("string=" + mes);
        out.close();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        connection.getInputStream()));
        String decodedString;
        while ((decodedString = in.readLine()) != null) {
            System.out.println(decodedString);
        }
        in.close();
    }
}
