package main;

import java.util.List;

public class SegregatedBowls {

 
    public final List<FruitBowl> fruitBowl;
    public final int bowlSize;

    public SegregatedBowls( List<FruitBowl> fruitBowl, int bowlSize) {
        this.fruitBowl = fruitBowl;
        this.bowlSize = bowlSize;
    }

    public List<FruitBowl>  getFruitBowl() {
        return fruitBowl;
    }

    public int getBowlSize() {
        return bowlSize;
    }
}