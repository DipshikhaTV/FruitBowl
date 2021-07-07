package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import main.*;
import java.util.*;

public class FruitBowlTest {
	FruitBowl fruitBowl;
	FruitBowl apples;
	FruitBowl bananas;
	FruitBowl oranges;
	 
  
    @BeforeClass
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
    public void segregateApples() {
	  apples=new FruitBowl();
      apples.addFruits(fruitBowl.getApples());
	}
  
    @Test
    public void segregateBananas() {
	    bananas=new FruitBowl();
	    bananas.addFruits(fruitBowl.getBananas());
    }
    
    @Test
    public void segregateOranges() {
	  oranges=new FruitBowl();
	  oranges.addFruits(fruitBowl.getOranges());
    }
  
	  
    @Test
    public void verifyCountofApples() {
	  Assert.assertEquals(apples.getSizeOfBowl(),3);
    }
  
     @Test
     public void verifyCountofBananas() {
    	  Assert.assertEquals(bananas.getSizeOfBowl(),2);
     }
	 
  
     @Test
     public void verifyCountofOranges() {
    	  Assert.assertEquals(oranges.getSizeOfBowl(),4);
    }
      @Test
      public void verifyAppleBowl() {
	 
	  List<FruitBowl> appleBowl = apples.getApples();
	  for ( FruitBowl fruitBowl : appleBowl) {
		  Assert.assertTrue(fruitBowl  instanceof Apples);
	   }
     }
	  @Test
	  public void verifyBananaBowl() {
		 
		  List<FruitBowl> bananaBowl = bananas.getBananas();
		  for ( FruitBowl fruitBowl : bananaBowl) {
			  Assert.assertTrue(fruitBowl  instanceof Bananas);
		  }
	  }
		  
	  @Test
	  public void verifyOrangeBowl() {
		 
		  List<FruitBowl> orangeBowl = oranges.getOranges();
		  for ( FruitBowl fruitBowl : orangeBowl) {
			  Assert.assertTrue(fruitBowl  instanceof Oranges);
		  }		
	   }

}