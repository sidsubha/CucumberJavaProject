package com.test.aws.automate.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        String temp = System.getenv("CHROME_DRIVER_PATH");
        System.out.println(temp);
        System.getProperty("webdriver.chrome.driver", "CHROME_DRIVER_PATH");
        driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        // driver.quit();

    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();

        }
    }


}
