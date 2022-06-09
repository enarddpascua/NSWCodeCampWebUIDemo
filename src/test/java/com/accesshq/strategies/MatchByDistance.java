package com.accesshq.strategies;

import com.accesshq.models.PlanetCard;

public class MatchByDistance implements MatchingStrategy {
    long distance;

    public MatchByDistance(long distance){
        this.distance = distance;
    }
    @Override
    public boolean match(PlanetCard planet) {
        return planet.getDistance() == distance;
    }
}
