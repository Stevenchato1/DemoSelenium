package com.pom.tests;

import com.pom.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisterTest extends BaseTest {
    @Test
    public void verifyRegisterSuccess(){
        //Localizar elementos web
        driver.findElement(By.linkText("Create an Account")).click();
        WebElement firstname  = driver.findElement(By.id("firstname"));
        WebElement lastname = driver.findElement(By.id("lastname"));
        WebElement email = driver.findElement(By.id("email_address"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement password_confirm= driver.findElement(By.id("password-confirmation"));

        //Ingresar datos al formulario
        firstname.sendKeys("Steven");
        lastname.sendKeys("Olaya");
        email.sendKeys("prueba02@gmail.com");
        password.sendKeys("prUeb4s1");
        password_confirm.sendKeys("prUeb4s1");

        //Assertion

        driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
        //WebElement logoAccount = driver.findElement(By.xpath("//a[@class='logo']"));
        WebElement logoAccount = new WebDriverWait(driver,Duration.ofSeconds(10)).
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='logo']")));


        Assert.assertTrue(logoAccount.isDisplayed());

    }
}
