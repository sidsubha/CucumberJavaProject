package com.test.aws.automate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By txt_username = By.id("txtUserID");
    By txt_password = By.id("txtPWD");
    By txt_btn_SignIn = By.id("Sign me in");

    public void enterUsername(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickSign() {
        driver.findElement(txt_btn_SignIn).click();
    }

    public void loginValidUser(String username, String password) {
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(txt_btn_SignIn).click();
    }


}
