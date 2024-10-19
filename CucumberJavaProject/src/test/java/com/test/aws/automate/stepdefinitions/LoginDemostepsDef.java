package com.test.aws.automate.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.test.aws.automate.stepdefinitions.Hooks.driver;

public class LoginDemostepsDef {


    @Given("browser is open")
    public void browserIsOpen() {
        System.out.println("Inside Steps - browser is open");
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is: " + projectPath);
    }

    @And("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Inside Steps - user is on login page");
        driver.navigate().to("https://online.myschoolerp.com/Login.aspx");

    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("Inside Steps - user enters username and password");
        driver.findElement(By.id("txtUserID")).sendKeys("MY1313_2_ADMIN");
        driver.findElement(By.id("txtPWD")).sendKeys("12345678");

    }

    @And("user clicks on login")
    public void userClicksOnLogin() {
        System.out.println("Inside Steps - user click on login");
        driver.findElement(By.id("btnSignIn")).click();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("Inside Steps - user is navigated to the home page");
        driver.findElement(By.id("lblPersonName")).click();
        WebElement element = driver.findElement(By.xpath("//li[@class='dropdown user user-menu open']/ul/li[@class='user-footer']/div[@class='pull-right']"));
        Assert.assertTrue(element.isDisplayed());

        driver.close();

    }
}
