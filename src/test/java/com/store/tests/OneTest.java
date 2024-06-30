package com.store.tests;

import com.store.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OneTest extends BaseTest {

    @Test(description = "verificar logo")
    public void verifyLogo(){
        WebElement imgLogo = driver.findElement(By.className("logo"));
        Assert.assertTrue(imgLogo.isDisplayed());
    }

    @Test (description = "verifica el titulo de la página")
    public void verifyTitle() {
        Assert.assertEquals(driver.getTitle(), expect_title);
    }
}
