package main;

import java.util.List;

public class SegregatedBowls {

 
    public final List<Fruit> fruitBowl;
    public final int bowlSize;

    public SegregatedBowls( List<Fruit> appleBowl) {
        this.fruitBowl = appleBowl;
        this.bowlSize = appleBowl.size();
    }

    public List<Fruit>  getFruitBowl() {
        return fruitBowl;
    }

    public int getBowlSize() {
        return bowlSize;
    }
}//return fruitbowl.size