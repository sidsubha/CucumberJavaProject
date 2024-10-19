package com.test.aws.automate.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchStepsDef {

    private WebDriver driver = null;

    @Given("browser is open")
    public void browserIsOpen() {
        System.out.println("Inside Step - browser is open");
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is: " + projectPath);

        String temp = System.getenv("CHROME_DRIVER_PATH");
        System.out.println(temp);
        System.getProperty("webdriver.chrome.driver", "CHROME_DRIVER_PATH");
        driver = new ChromeDriver();
      //  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       // driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        // driver.quit();
    }

    @And("user is on google search page")
    public void userIsOnGoogleSearchPage() {
        System.out.println("Inside Step - user is on google search page");
        driver.navigate().to("https://www.google.com");

    }

    @When("user enters a text in search box")
    public void userEntersATextInSearchBox() {
        System.out.println("Inside Step - user enters a text in search box");
        driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
    }

    @And("hits enter")
    public void hitsEnter() {
        System.out.println("Inside Step - hits enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search results")
    public void userIsNavigatedToSearchResults() {
        System.out.println("Inside Step - user is navigated to search results");
        driver.getPageSource().contains("Online Courses");
        driver.close();
       // driver.quit();
    }
}
