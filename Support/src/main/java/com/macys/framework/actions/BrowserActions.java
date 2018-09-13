package com.macys.framework.actions;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Element;
import java.lang.String;
import java.util.*;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * This contains actions performed on the browser page elements
 */
public class BrowserActions {
//    public static void main(String[] args) {
//        // declaration and instantiation of objects/variables
//        WebDriverManager driver ;
//        System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
//        driver = new FirefoxDriver();
//        String baseUrl = "http://newtours.demoaut.com";
//        String expectedTitle = "Welcome: Mercury Tours";
//        String actualTitle = "";
//
//        // launch Fire fox and direct it to the Base URL
//        driver.get(baseUrl);
//
//        // get the actual value of the title
//        actualTitle = driver.getTitle();
//
//        /*
//         * compare the actual title of the page with the expected one and print
//         * the result as "Passed" or "Failed"
//         */
//        if (actualTitle.contentEquals(expectedTitle)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
//
//        //close Fire fox
//        driver.close();
//
//        // exit the program explicitly
//        System.exit(0);
//    }


    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        driver = new FirefoxDriver();

        String url = "http://www.qa17codemacys.fds.com";
        String expTitle = "Macy's - Shop Fashion Clothing";

        driver.get(url);

       if (driver.getTitle().contentEquals(expTitle)) {
           System.out.println("truekkkkljkfdshkfsd");
       }
       else {
               System.out.println(driver.getTitle());
           }

       System.out.println(driver.getCurrentUrl());
//       String parentWindow = driver.getWindowHandle();
        driver.manage().window().maximize();
        WebElement ele = driver.findElement(By.id("adImages"));
        pressEnter(ele);

//       driver.findElement(By.id("adImages")).click();
//        String[] sample = {"ss" , "sdsd"};
       Set<String>  handles = driver.getWindowHandles();
       String parentWindow = driver.getWindowHandle();
//
//
//
//        System.out.println(handles);
//        handles.iterator().next();
//        String winHandle = handles.iterator().next();
//        System.out.println(parentWindow);
//        System.out.println(winHandle);
//
//        if (winHandle != parentWindow) {
////            String second = winHandle;
//            driver.switchTo().window(winHandle);
//            WebElement myDynamicElement = (new WebDriverWait(driver, 10))
//                    .until(ExpectedConditions.presenceOfElementLocated(By.id("bops-step-one")));
//            driver.findElement(By.id("bops-step-one")).click();
//        }
//
//        for (Set<String> s = driver.getWindowHandles()) driver.switchTo().window(s);
//
        WindowHandler(driver , parentWindow , handles);
//        for (String s : handles) {
//            System.out.println(s);
//            System.out.println(parentWindow);
//
//            if (!s.equals(parentWindow) ) {
//                driver.switchTo().window(s);
////                WebElement myDynamicElement = (new WebDriverWait(driver, 10))
////                    .until(ExpectedConditions.presenceOfElementLocated(By.id("bops-step-one")));
//                driver.findElement(By.id("globalMastheadSignIn")).click();
//                System.out.println("trueeee");
//            }
////            else {
////                System.out.println("false");
////            }
//        }



        driver.navigate().back();
       driver.close();

    }


    public static void WindowHandler(WebDriver driver , String parentWindow , Set<String> windowHandlers) {

        for (String windowTab : windowHandlers) {
            if (!windowTab.equals(parentWindow)){
                driver.switchTo().window(windowTab);
                pressEnter(driver.findElement(By.id("globalMastheadSignIn")));
                System.out.println("trueeee");
            }
        }
    }

    public static void pressEnter(WebElement el) {
        el.sendKeys(Keys.RETURN);

    }

    public static boolean appTest;


    public static void Click(WebElement el) throws NoSuchElementException {
        if (el == null){
            log.print("element is null");
            throw new NoSuchElementException("element is null, unable to click");
        }

        if (appTest) {
//            ((MobileElement) el).tap(1, 250);
            return;
        }

    }

}
