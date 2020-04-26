package com.madv.mylang.networking.datagram;

import java.io.IOException;
import java.io.*;

public class QuoteServer {
    public static void main(String[] args) throws IOException {
        new QuoteServerThread().start();
    }
}
