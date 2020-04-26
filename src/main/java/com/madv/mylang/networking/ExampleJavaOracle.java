package com.madv.mylang.networking;

import org.junit.Test;

import java.io.*;
import java.net.*;

public class ExampleJavaOracle {

    @Test
    public void parseRrl () throws MalformedURLException {
        URL aURL = new URL("http://example.com:80/docs/books/tutorial"
                + "/index.html?name=networking#DOWNLOADING");

        System.out.println("protocol = " + aURL.getProtocol());
        System.out.println("authority = " + aURL.getAuthority());
        System.out.println("host = " + aURL.getHost());
        System.out.println("port = " + aURL.getPort());
        System.out.println("path = " + aURL.getPath());
        System.out.println("query = " + aURL.getQuery());
        System.out.println("filename = " + aURL.getFile());
        System.out.println("ref = " + aURL.getRef());
    }
    @Test
    public void createUrl() throws MalformedURLException, URISyntaxException {
        URL myURL = new URL("http://example.com/");
//        URL(URL baseURL, String relativeURL)
        myURL = new URL("http://example.com/pages/");
        URL page1URL = new URL(myURL, "page1.html");
        URL page2URL = new URL(myURL, "page2.html");

        URL gamelan = new URL("http", "example.com", 80, "pages/page1.html");
// адреса с пробелами, русские символы и тд
        URI uri = new URI("http", "example.com", "/hello пробелы world/", "");
        URL url = uri.toURL();
    }
    @Test
    public void urlReading() throws IOException {

        URL google = new URL("https://google.com");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(google.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
    @Test
    public void urlConnectionReader() throws IOException {
        URL google = new URL("https://google.com");
        URLConnection yc = google.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
    @Test
    public void google () throws IOException {
        String url = "https://google.com";
        String filePath = "Google.html";

        URL urlObj = new URL(url);
        URLConnection urlCon = urlObj.openConnection();

        InputStream inputStream = urlCon.getInputStream();
        BufferedInputStream reader = new BufferedInputStream(inputStream);

        BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(filePath));

        byte[] buffer = new byte[4096];
        int bytesRead = -1;

        while ((bytesRead = reader.read(buffer)) != -1) {
            writer.write(buffer, 0, bytesRead);
        }

        writer.close();
        reader.close();
    }
}
