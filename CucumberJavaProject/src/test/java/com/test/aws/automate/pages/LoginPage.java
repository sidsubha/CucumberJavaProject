package com.test.aws.automate.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.test.aws.automate.stepdefinitions.Hooks.driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="txtUserID")
    private WebElement txtUserID;

    @FindBy(id = "txtPWD")
    private WebElement txtPWD;

    @FindBy(id = "btnSignIn")
    private WebElement signMeIn;

    @FindBy(id = "lblPersonName")
    private WebElement lblPersonName;

    public void enterUsername(String username) {
        txtUserID.sendKeys(username);
    }

    public void enterPassword(String password) {
        txtPWD.sendKeys(password);
    }

    public void clickSign() {
        signMeIn.click();
    }

    public void checkSignOutIsDisplayed(){
        Assert.assertTrue( lblPersonName.isDisplayed());
    }

    public void loginValidUser(String username, String password) {
        txtUserID.sendKeys(username);
        txtPWD.sendKeys(password);
        signMeIn.click();
    }


}
