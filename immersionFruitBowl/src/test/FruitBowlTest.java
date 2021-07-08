 package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import main.*;
import java.util.*;

public class FruitBowlTest {
	FruitBowl fruitBowl;
	Fruit fruit;
  

      @Test
      public void verifyFruitBowl() {
    	  fruitBowl= new FruitBowl();
    	  fruitBowl.addFruit( new Apples());
    	  fruitBowl.addFruit( new Apples());
    	  fruitBowl.addFruit( new Apples());
    	  fruitBowl.addFruit( new Bananas());
    	  fruitBowl.addFruit( new Bananas());
    	  fruitBowl.addFruit( new Oranges());   
  	      List<Fruit> fruitBowl1 = fruitBowl.getFruitBowl();
  	      for ( Fruit fruitBowl : fruitBowl1) {
  		       Assert.assertTrue(fruitBowl  instanceof Apples || fruitBowl instanceof Bananas || fruitBowl instanceof Oranges);
  	      }
      }
	  @Test
	  public void verifyCountofApples() {
	    	
	      fruitBowl= new FruitBowl();
	  	  fruitBowl.addFruit( new Apples());
	  	  fruitBowl.addFruit( new Apples());
	  	  fruitBowl.addFruit( new Apples());
	  	  fruitBowl.addFruit( new Bananas());
	  	  fruitBowl.addFruit( new Bananas());
	  	  fruitBowl.addFruit( new Oranges());
	    	 
	      Assert.assertEquals(fruitBowl.getAppleBowl().size(),3);
	      
	    }
	  @Test
	  public void verifyCountofBananas() {
		  
		  fruitBowl= new FruitBowl();
		  fruitBowl.addFruit( new Apples());
		  fruitBowl.addFruit( new Apples());
		  fruitBowl.addFruit( new Apples());
		  fruitBowl.addFruit( new Bananas());
		  fruitBowl.addFruit( new Bananas());
		  fruitBowl.addFruit( new Oranges());
		
	      Assert.assertEquals(fruitBowl.getBananaBowl().size(),2);
          
	    }
	   @Test
	   public void verifyCountofOranges() {
		   
		      fruitBowl= new FruitBowl();
			  fruitBowl.addFruit( new Apples());
			  fruitBowl.addFruit( new Apples());
			  fruitBowl.addFruit( new Apples());
			  fruitBowl.addFruit( new Bananas());
			  fruitBowl.addFruit( new Bananas());
			  fruitBowl.addFruit( new Oranges());
		     
	    	  Assert.assertEquals(fruitBowl.getOrangeBowl().size(),1);
	    	  
	   }
 
	   @Test
	   public void verifyAppleBowl(){
		   
		      fruitBowl= new FruitBowl();
			  fruitBowl.addFruit( new Apples());
			  fruitBowl.addFruit( new Apples());
			  fruitBowl.addFruit( new Apples());
			  fruitBowl.addFruit( new Bananas());
			  fruitBowl.addFruit( new Bananas());
			  fruitBowl.addFruit( new Oranges());
		    
	         List<Fruit> appleBowl = fruitBowl.getAppleBowl();
	    	  for ( Fruit fruitBowl : appleBowl) {
	    		  Assert.assertTrue(fruitBowl  instanceof Apples);
	    	   }
	    }
	   
	   @Test
	   public void verifyBananaBowl(){
		   
		      fruitBowl= new FruitBowl();
			  fruitBowl.addFruit( new Apples());
			  fruitBowl.addFruit( new Apples());
			  fruitBowl.addFruit( new Apples());
			  fruitBowl.addFruit( new Bananas());
			  fruitBowl.addFruit( new Bananas());
			  fruitBowl.addFruit( new Oranges());
	          List<Fruit> bananaBowl = fruitBowl.getBananaBowl();
	    	  for ( Fruit fruitBowl : bananaBowl) {
	    		  Assert.assertTrue(fruitBowl  instanceof Bananas);
	    	   }
	    }
	   
	   @Test
	   public void verifyOrangeBowl(){
		   
		      fruitBowl= new FruitBowl();
			  fruitBowl.addFruit( new Apples());
			  fruitBowl.addFruit( new Apples());
			  fruitBowl.addFruit( new Apples());
			  fruitBowl.addFruit( new Bananas());
			  fruitBowl.addFruit( new Bananas());
			  fruitBowl.addFruit( new Oranges());
	          List<Fruit> orangeBowl = fruitBowl.getOrangeBowl();
	    	  for ( Fruit fruitBowl : orangeBowl) {
	    		  Assert.assertTrue(fruitBowl  instanceof Oranges);
	    	   }
	    }
	   
	   
 
}