package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected final String URL = "https://magento.softwaretestingboard.com/";
    protected int TIME_OUT = 10;

    @BeforeMethod
    public void setUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
        driver.get(URL);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
