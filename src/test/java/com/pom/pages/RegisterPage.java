package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    WebDriver driver;

    //WebElement
    By linkAccount = By.linkText("Create an Account");
    By firstname =  By.id("firstname");
    By lastname  = By.id("lastname");
    By email = By.id("email_address");
    By pass = By.id("password");
    By repass = By.id("password-confirmation");
    By btnRegister = By.xpath("//button[@title='Create an Account']");


    //Crear constructor
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToRegisterLink(){
        driver.findElement(linkAccount).click();
    }

    public void submitRegister(){
        driver.findElement(btnRegister).click();
    }

    //Métodos
    public void fillOutFormRegisterWithValidData(){
        driver.findElement(firstname).sendKeys("Pedro");
        driver.findElement(lastname).sendKeys("huasupoma");
        driver.findElement(email).sendKeys("huasupoma@gmail.com");
        driver.findElement(pass).sendKeys("hola");
        driver.findElement(repass).sendKeys("hola");
    }

}
