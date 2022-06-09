package com.accesshq.test;

import com.accesshq.models.ModernForm;
import com.accesshq.models.PlanetsPage;
import com.accesshq.models.Toolbar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaygroundTestSuite {
    WebDriver driver;
    Toolbar nav;
    PlanetsPage planet;

    @BeforeEach
    public void beforeEachTest() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/");
    }

    @Test
    public void submitFormTest() throws InterruptedException {
        //Arrange
        var form = new ModernForm(driver);
        nav = new Toolbar(driver);
        planet = new PlanetsPage(driver);
        //Act
//        nav.goToForms();
//        form.setName("Rey");
//        form.setEmail("rey@gmail.com");
//        form.setCheckAgree();
//        form.submit();

//        var getModal = driver.findElement(By.className("v-snack__wrapper"));
//        new WebDriverWait(driver, Duration.ofSeconds(10)).
//            until(ExpectedConditions.visibilityOf(getModal));

        //Assert
//        driver.getCurrentUrl().equals("https://d18u5zoaatmpxx.cloudfront.net/forms");
//        Assertions.assertEquals(driver.findElement(By.id("name")), form.getName());
//        Assertions.assertEquals(driver.findElement(By.id("email")), form.getEmail());
//        form.getCheckAgree().isEnabled();
//        Assertions.
//        assertEquals(driver.findElement(By.className("snackbar")).getText(), "Thanks for your feedback Rey");
    }

    @AfterEach
    public void tearDown(){
//        driver.quit();
    }


}
