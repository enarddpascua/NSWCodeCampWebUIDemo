package com.accesshq.models;

import com.accesshq.strategies.MatchByName;
import com.accesshq.strategies.MatchingStrategy;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlanetsPage {
    private final WebDriver driver;
    private ArrayList<PlanetCard> allPlanets;

    public PlanetsPage(WebDriver driver) {
        this.driver = driver;
        allPlanets = getAllPlanets();
    }

    public ArrayList<PlanetCard> getAllPlanets(){
        var result = new ArrayList<PlanetCard>();
        for(WebElement p : driver.findElements(By.className("planet"))){
            result.add(new PlanetCard(p));
        }
        return result;
    }

    public PlanetCard getPlanet(MatchingStrategy strategy) throws NotFoundException {
        for(PlanetCard p: allPlanets){
          if(strategy.match(p)){
              return p;
          }
        }
        throw new NotFoundException("Planet not found");
    }

}
