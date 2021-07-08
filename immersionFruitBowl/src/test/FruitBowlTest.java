 package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import main.*;
import java.util.*;

public class FruitBowlTest {
	FruitBowl fruitBowl;
	SegregatedBowls segregatedBowls;
	 
  
    @Test
    public void addFruits(){
	  fruitBowl= new FruitBowl();
	  fruitBowl.addFruit( new Apples());
	  fruitBowl.addFruit( new Apples());
	  fruitBowl.addFruit( new Apples());
	  fruitBowl.addFruit( new Bananas());
	  fruitBowl.addFruit( new Bananas());
	  fruitBowl.addFruit( new Oranges());
	  fruitBowl.addFruit( new Oranges());
	  fruitBowl.addFruit( new Oranges());
	  fruitBowl.addFruit( new Oranges());
	 }
  

      @Test
      public void verifyFruitBowl() {
  		 
  	  List<Fruit> fruitBowl1 = fruitBowl.getFruitBowl();
  	  for ( Fruit fruitBowl : fruitBowl1) {
  		  Assert.assertTrue(fruitBowl  instanceof Apples || fruitBowl instanceof Bananas || fruitBowl instanceof Oranges);
  	   }
      }
	  @Test
	     public void verifyCountofApples() {
		 segregatedBowls =   fruitBowl.getAppleBowl();
	     Assert.assertEquals(segregatedBowls.getBowlSize(),3);
         List<Fruit> appleBowl = segregatedBowls.getFruitBowl();
	    	  for ( Fruit fruitBowl : appleBowl) {
	    		  Assert.assertTrue(fruitBowl  instanceof Apples);
	    	   }
	    }
	  @Test
	     public void verifyCountofBananas() {
		 segregatedBowls =   fruitBowl.getBananaBowl();
	     Assert.assertEquals(segregatedBowls.getBowlSize(),2);
         List<Fruit> bananaBowl = segregatedBowls.getFruitBowl();
	    	  for ( Fruit fruitBowl : bananaBowl) {
	    		  Assert.assertTrue(fruitBowl  instanceof Bananas);
	    	   }
	    }
	   @Test
	     public void verifyCountofOranges() {
		 segregatedBowls  =   fruitBowl.getOrangeBowl();
	     Assert.assertEquals(segregatedBowls.getBowlSize(),4);
	    	  List<Fruit> orangeBowl = segregatedBowls.getFruitBowl();
	    	  for ( Fruit fruitBowl : orangeBowl) {
	    		  Assert.assertTrue(fruitBowl  instanceof Oranges);
	    	   }
	    }
	   
	   
 
}