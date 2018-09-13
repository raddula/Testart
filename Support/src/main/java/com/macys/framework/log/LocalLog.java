package com.macys.framework.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by yc05r3a on 4/18/2017.
 */
public class LocalLog {

    public static void debug(String logmsg){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        int len = stackTraceElements.length;
//
//        System.out.println("length is" + len);
        Logger log = LoggerFactory.getLogger(stackTraceElements[2].getClassName());
        log.debug(logmsg);
    }

    public static void info(String logmsg){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        Logger log = LoggerFactory.getLogger(stackTraceElements[2].getClassName());
        log.info(logmsg);
    }
}
