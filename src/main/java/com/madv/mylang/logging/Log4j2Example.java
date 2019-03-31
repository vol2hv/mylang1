package com.madv.mylang.logging;
//
import lombok.extern.log4j.Log4j2;
@Log4j2
public class Log4j2Example {
    public static void main(String[] args) {
      int [] ar ={1,2,3,4,5};
      log.trace("Trace");
      log.debug("debug");
      log.info("Info");
      log.warn("Warning");
      log.error("Error");
      log.fatal("Fatal");
      log.info("Гениальный программист {} {} года рождения.","Madorin",1955 );
        try{
            int a = ar[4];
            a = ar[5];
        }catch(Exception ex){
            log.error("Sorry, something wrong!", ex);
        } finally {
            log.info("Программа завершила работу.");
        }

    }
}
