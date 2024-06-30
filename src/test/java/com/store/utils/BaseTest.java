package com.store.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class BaseTest {
     protected WebDriver driver; // WebDriver is an interface
    protected String expect_title= "Madison Island";

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo-store.seleniumacademy.com/");
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
