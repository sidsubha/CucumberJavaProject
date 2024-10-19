package com.test.aws.automate.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class LoginSteps {
    WebDriver driver;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "D:/Driver/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        // Locate and interact with login fields
        driver.findElement(By.id("username")).sendKeys("validUser");
        driver.findElement(By.id("password")).sendKeys("validPass");
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        assertTrue(driver.getTitle().contains("Homepage"));
        driver.quit();
    }
}
