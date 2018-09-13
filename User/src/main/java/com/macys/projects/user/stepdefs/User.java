package com.macys.projects.user.stepdefs;

import com.macys.framework.log.LocalLog;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.macys.framework.utils.Navigation;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Logger;

/**
 * Created by yc05r3a on 4/14/2017.
 */
public class User {
//    private static final Logger log = LoggerFactory.getLogger(User.class);
//    Logger log = Logger.getLogger(User.class);

    @Given("^I visit the site$")
    public void visitSite() {
        LocalLog.debug("Visiting the site");
        Navigation.visitSite("http://www.qa13codemacys.fds.com");

        LocalLog.info("succesfully visited "+Navigation.getPageUrl());
    }

    @When("^I navigate to create profile page$")
    public void i_navigate_to_create_profile_page() {
        WebDriver driver = Navigation.getDriver();
        driver.findElement(By.id("globalMastheadSignIn")).click();
        driver.findElement(By.id("createProfileContainer")).click();
    }

    @Then("^I should be able to see create profile page$")
    public void i_should_be_able_to_see_create_profile_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @When("^I create profile$")
    public void i_create_profile() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Then("^I should be able to create profile successfully$")
    public void i_should_be_able_to_create_profile_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

}
