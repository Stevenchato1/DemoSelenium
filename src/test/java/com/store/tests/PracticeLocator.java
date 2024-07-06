package com.store.tests;

import com.store.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.List;


public class PracticeLocator extends BaseTest {
    protected WebDriverWait wait;
    @Test
    public void testFacebookLogin(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Frames']")).click();
        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
    }


    @Test
    public  void testDropDownSelect()  {
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        //select.selectByValue("2");
        select.selectByVisibleText("Option 1");
        select.selectByIndex(2);
    }

    @Test
    public void practiceScraping(){

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Floating Menu']")).click();
        List<WebElement> lista = driver.findElements(By.xpath("//div[@id='menu']/ul/li"));
        for (WebElement ls : lista ){
            System.out.println(ls.getText());
        }
        WebElement elementContainer = driver.findElement(By.id("menu"));
        List<WebElement> lista2 = elementContainer.findElements(By.tagName("li"));
        for (WebElement ls: lista2){
            System.out.println(ls.getText());
        }
    }



    /*li[@id='macrocategoria_1_desktop']/ul/li
    @Test
    public void practiceScraping2(){

        driver.get("https://coppel.com/");
        driver.findElement(By.id("allDepartmentsButton")).click();
        List<WebElement> lista = driver.findElements(By.xpath("//li[@id='macrocategoria_1_desktop']/ul/li"));
        for (WebElement ls : lista ){
            System.out.println(ls.getText());
        }*/

}
