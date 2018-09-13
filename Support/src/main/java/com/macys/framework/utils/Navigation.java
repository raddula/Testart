package com.macys.framework.utils;
import com.macys.framework.exceptions.DriverNotFoundException;
import com.macys.framework.log.LocalLog;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.util.*;


/**
 * Created by yc05r3a on 4/17/2017.
 */
public class Navigation {

    static WebDriver driver = null;

//    private static final Logger log = LoggerFactory.getLogger(Navigation.class);

    public static void visitSite(String homeUrl){
        WebDriver weddrive = startDriver();
        weddrive.get(homeUrl);
        LocalLog.debug("Started browser with the provided url");
    }

    public static WebDriver startDriver(){
//        System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
//        WebDriverManager driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
//        if (driver != null){
//            driver.quit();
//        }
//        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        return driver;
    }

    public static WebDriver getDriver() throws DriverNotFoundException {
        if (driver == null){
            throw new DriverNotFoundException("Driver not started");
        }
        return driver;
    }

    public static String getPageUrl(){
        String pageurl = null;
        try{
            WebDriver drive = getDriver();
            pageurl = drive.getCurrentUrl();
        } catch (DriverNotFoundException ex){
            System.err.println(ex.getMessage());
        }
        return pageurl;
    }

}
