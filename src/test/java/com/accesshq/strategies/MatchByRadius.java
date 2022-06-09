package com.accesshq.strategies;

import com.accesshq.models.PlanetCard;

public class MatchByRadius implements MatchingStrategy{
    int radius;

    public MatchByRadius(int radius){
        this.radius = radius;
    }

    @Override
    public boolean match(PlanetCard planet) {
        return planet.getRadius() == radius;
    }
}
