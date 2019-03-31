package com.madv.mylang.exceptions;

//: exceptions/LoggingExceptions.java
// An exception that reports through a Logger.
import lombok.extern.log4j.Log4j2;

import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("LoggingException");
    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
@Log4j2
public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch(Exception e) {
            log.error("Caught Exception");
            log.error("getMessage():" + e.getMessage());
            log.error("getLocalizedMessage():" +
                    e.getLocalizedMessage());
            log.error("toString():" + e);
            log.error("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}