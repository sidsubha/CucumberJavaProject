package com.test.aws.automate.stepdefinitions;

import com.test.aws.automate.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.test.aws.automate.stepdefinitions.Hooks.driver;

public class LoginDemoStepsDef_POM {

    LoginPage login;


    @Given("browser is open")
    public void browserIsOpen() {
       // System.out.println("Inside Steps - browser is open");
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is: " + projectPath);
    }

    @And("user is on login page")
    public void user_is_on_login_page() {
      //  System.out.println("Inside Steps - user is on login page");
        driver.navigate().to("https://online.myschoolerp.com/Login.aspx");
    }

    // ([^\"]*)
    @When("^user enters ([^\"]*) and ([^\"]*)$")
    public void userEntersUsernameAndPassword(String username, String password) {
        //System.out.println("Inside Steps - user enters username and password");

        login = new LoginPage();
        login.enterUsername(username);
        login.enterPassword(password);


        //  driver.findElement(By.id("txtUserID")).sendKeys(username);
        //  driver.findElement(By.id("txtPWD")).sendKeys(password);
    }

    @And("user clicks on login")
    public void userClicksOnLogin() {
       // System.out.println("Inside Steps - user click on login");
        login.clickSign();
        // driver.findElement(By.id("btnSignIn")).click();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
      //  System.out.println("Inside Steps - user is navigated to the home page");
        driver.findElement(By.id("lblPersonName")).click();
        WebElement element = driver.findElement(By.cssSelector(".dropdown.user.user-menu.open, .user-footer, .pull-right"));
        Assert.assertTrue(element.isDisplayed());
        driver.close();
    }
}
