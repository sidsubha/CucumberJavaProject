package com.test.aws.automate.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.test.aws.automate.stepdefinitions.Hooks.driver;

public class GoogleSearchStepsDef {


//    @Given("browser is open")
//    public void browserIsOpen() {
//        System.out.println("Inside Step - browser is open");
//        String projectPath = System.getProperty("user.dir");
//        System.out.println("Project path is: " + projectPath);
//
//    }
//
//    @And("user is on google search page")
//    public void userIsOnGoogleSearchPage() {
//        System.out.println("Inside Step - user is on google search page");
//        driver.navigate().to("https://www.google.com");
//
//    }
//
//    @When("user enters a text in search box")
//    public void userEntersATextInSearchBox() throws InterruptedException {
//        System.out.println("Inside Step - user enters a text in search box");
//        driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//        Thread.sleep(2000);
//    }
//
//    @And("hits enter")
//    public void hitsEnter() {
//        System.out.println("Inside Step - hits enter");
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//    }

//    @Then("user is navigated to search results")
//    public void userIsNavigatedToSearchResults() {
//        System.out.println("Inside Step - user is navigated to search results");
//        boolean onlineCoursesExists = driver.getPageSource().contains("Online Courses");
//        Assert.assertTrue(onlineCoursesExists);
//        driver.close();
//        // driver.quit();
//    }
}
