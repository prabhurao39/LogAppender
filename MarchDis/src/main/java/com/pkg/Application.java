package com.basic.log4j;

// import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Application {
  // private final static Logger logger = Logger.getLogger(Application.class);
  private static final Logger LOGGERS = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {

    // PropertiesConfigurator is used to configure logger from properties file
    PropertyConfigurator.configure(
        "C:\\Users\\prabhurao\\eclipse-workspace\\MarchDis\\src\\main\\resources\\log4j.properties");

    LOGGERS.info("main start ............ ");
    System.out.println("Hello Siddharth");
    LOGGERS.debug("main end ............  ");
  }
}

