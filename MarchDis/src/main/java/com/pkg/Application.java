package com.pkg;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Application {
    final static Logger logger = Logger.getLogger(Application.class);
    public static void main(String[] args) {
      
    //PropertiesConfigurator is used to configure logger from properties file
      PropertyConfigurator.configure("C:\\Users\\prabhurao\\eclipse-workspace\\MarchDis\\src\\main\\resources\\log4j.properties");
      
        logger.info("main start ............ "); 
        System.out.println("Hello Siddharth");
        logger.debug("main end ............  ");
    }
}

