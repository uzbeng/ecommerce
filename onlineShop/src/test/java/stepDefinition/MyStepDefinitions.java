package stepDefinition;


import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageFactory.LandingPage;
import pageFactory.MyAccountPage;
import pageFactory.SignInPage;
import utilities.Base;

@RunWith(Cucumber.class)
public class MyStepDefinitions{

	WebDriver driver;
	Base base;
	LandingPage landingPage;
	SignInPage signInPage;
	MyAccountPage myAccountPage;
	String url;
	
	
    @Given("^Initilize driver from Base class$")
    public void initilize_driver_from_base_class() throws Throwable {
        base = new Base();
        driver = base.initializeDriver();
        url = base.properties.getProperty("baseUrl");
    }

    @Given("^User opens the page and clicks signin$")
    public void user_opens_the_page_and_clicks_signin() throws Throwable {
        driver.get(url);
        landingPage.clickOnSigninBtn();
    }

    @When("^Initilize page objects from pageFactory package$")
    public void initilize_page_objects_from_pagefactory_package() throws Throwable {
    	landingPage = new LandingPage(driver);
        signInPage = new SignInPage(driver);
        myAccountPage = new MyAccountPage(driver);
    }

    @When("^User enters email and password in signin page$")
    public void user_enters_email_and_password_in_signin_page() throws Throwable {
        signInPage.signIntoAccount(base.properties.getProperty("userEmail"), base.properties.getProperty("password"));
    }

    @Then("^Initilize screenshot method from Base class$")
    public void initilize_screenshot_method_from_base_class() throws Throwable {
        //TODO it has to be implemented yet
    }

    @Then("^My account page opens$")
    public void my_account_page_opens() throws Throwable {
        Assert.assertTrue(myAccountPage.orderHistoryBtnIsDisplayed());
    }

}
