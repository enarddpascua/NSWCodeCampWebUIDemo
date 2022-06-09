package com.accesshq.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Toolbar {

    private final WebDriver driver;

    public Toolbar(WebDriver driver){
        this.driver = driver;
    }

    public void goToPlanets(){
        driver.findElement(By.cssSelector("[aria-label=planets]")).click();

        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOf(driver.findElement(By.className("v-main__wrap"))));
    }

    public void goToForms(){
        driver.findElement(By.cssSelector("[aria-label=forms]")).click();
    }


}
