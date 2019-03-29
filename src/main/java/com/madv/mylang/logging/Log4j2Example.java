package com.madv.mylang.logging;
//
import lombok.extern.log4j.Log4j2;
@Log4j2
public class Log4j2Example {
    public static void main(String[] args) {
      log.trace("Trace");
      log.debug("debug");
      log.info("Info");
      log.warn("Warning");
      log.error("Error");
      log.fatal("Fatal");
    }
}
