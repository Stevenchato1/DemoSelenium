package com.pom.tests;

import com.pom.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisterTest extends BaseTest {
    @Test
    public void verifyRegisterSuccess(){

        registerPage.goToRegisterLink();
        registerPage.fillOutFormRegisterWithValidData();
        registerPage.submitRegister();

        //WebElement logoAccount = driver.findElement(By.xpath("//a[@class='logo']"));
        WebElement logoAccount = new WebDriverWait(driver,Duration.ofSeconds(10)).
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='logo']")));
        Assert.assertTrue(logoAccount.isDisplayed());

    }
}
