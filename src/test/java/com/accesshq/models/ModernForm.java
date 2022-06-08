package com.accesshq.models;

import org.openqa.selenium.*;

public class ModernForm {
    private WebDriver driver;

    public ModernForm(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFormLink(){
        return driver.findElement(By.className("v-toolbar__items"));
    }

    public WebElement getName() {
        return driver.findElement(By.id("name"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getCheckAgree(){
        return driver.findElement(By.className("v-input--selection-controls__ripple"));
    }

    public void setName(String name) {
        getName().sendKeys(name);
    }

    public void setEmail(String email) {
        getEmail().sendKeys(email);
    }

    public void setCheckAgree() {
        getCheckAgree().click();
    }

    public void submit() {
        var buttons = driver.findElements(By.tagName("button"));
        for (WebElement b : buttons) {
            if (b.getText().equalsIgnoreCase("submit")) {
                b.click();
                break;
            }
        }

    }
}
