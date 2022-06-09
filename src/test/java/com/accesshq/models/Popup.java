package com.accesshq.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popup {
    WebDriver driver;

    public Popup(WebDriver driver){
    this.driver = driver;
    }

    public String getPopupMessage(){
        return driver.findElement(By.className("snackbar")).getText();
    }
}
