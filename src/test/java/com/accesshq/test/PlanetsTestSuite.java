package com.accesshq.test;

import com.accesshq.models.PlanetsPage;
import com.accesshq.models.Popup;
import com.accesshq.models.Toolbar;
import com.accesshq.strategies.MatchByDistance;
import com.accesshq.strategies.MatchByName;
import com.accesshq.strategies.MatchByRadius;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlanetsTestSuite {
    WebDriver driver;

    @BeforeEach
    public void beforeEachTest() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/");
    }

    @Test
    public void explorePlanetTest() throws NotFoundException {
        // Arrange
        new Toolbar(driver).goToPlanets();

        // Act
        new PlanetsPage(driver).getPlanet(new MatchByName("venus")).clickExplore();

        // Assert
        Assertions.assertEquals("Exploring Venus", new Popup(driver).getPopupMessage());
    }

    @Test
    public void clickExploreByDistance(){
        // Arrange
        new Toolbar(driver).goToPlanets();

        // Act
        new PlanetsPage(driver).getPlanet(new MatchByDistance(57910000)).clickExplore();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.className("snackbar"))));
        // Assert
        Assertions.assertEquals("Exploring Mercury", new Popup(driver).getPopupMessage());
    }

    @Test
    public void clickExploreByRadius(){
        // Arrange
        new Toolbar(driver).goToPlanets();

        // Act
        new PlanetsPage(driver).getPlanet(new MatchByRadius(58232)).clickExplore();

        // Assert
        Assertions.assertEquals("Exploring Saturn", new Popup(driver).getPopupMessage());
    }


    @AfterEach
    public void tearDown(){
        driver.quit();
    }

}
