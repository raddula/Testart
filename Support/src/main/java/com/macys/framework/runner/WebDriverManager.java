package com.macys.framework.runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.WebDriver;

/*
* This holds all methods to web driver access
* */
public class WebDriverManager {


    private static final Logger log = LoggerFactory.getLogger(WebDriverManager.class);

    /*
    * When no web driver is initiated
    * */
    static WebDriver driver = null;


    public static synchronized WebDriver startWebDriver(){
        if (driver != null){
            driver.quit();
        }
       // System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");

        driver = new ChromeDriver();

        String pageUrl = "http://www.qa17codemacys.fds.com";

        driver.get(pageUrl);
        return driver;
    }


    public static void closeDriver(){
        driver.quit();

    }

    public static void main (String[] args){
        startWebDriver();
        closeDriver();
    }

}


