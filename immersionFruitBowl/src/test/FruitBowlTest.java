 package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import main.*;
import java.util.*;

public class FruitBowlTest {
	FruitBowl fruitBowl;
	//FruitBowl apples;
	//FruitBowl bananas;
	//FruitBowl oranges;
	SegregatedBowls segregatedBowls;
	 
  
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
      public void verifyFruitBowl() {
  		 
  	  List<FruitBowl> appleBowl = fruitBowl.getFruitBowl();
  	  for ( FruitBowl fruitBowl : appleBowl) {
  		  Assert.assertTrue(fruitBowl  instanceof Apples || fruitBowl instanceof Bananas || fruitBowl instanceof Oranges);
  	   }
      }
	  @Test
	     public void verifyCountofApples() {
		  segregatedBowls =   fruitBowl.getAppleBowl();
	    	  Assert.assertEquals(segregatedBowls.getBowlSize(),3);
              List<FruitBowl> appleBowl = segregatedBowls.getFruitBowl();
	    	  
	    	  for ( FruitBowl fruitBowl : appleBowl) {
	    		  Assert.assertTrue(fruitBowl  instanceof Apples);
	    	   }
	    }
	  @Test
	     public void verifyCountofBananas() {
		  segregatedBowls =   fruitBowl.getBananaBowl();
	    	  Assert.assertEquals(segregatedBowls.getBowlSize(),2);
             List<FruitBowl> bananaBowl = segregatedBowls.getFruitBowl();
	    	  
	    	  for ( FruitBowl fruitBowl : bananaBowl) {
	    		  Assert.assertTrue(fruitBowl  instanceof Bananas);
	    	   }
	    }
	   @Test
	     public void verifyCountofOranges() {
		   segregatedBowls  =   fruitBowl.getOrangeBowl();
	    	  Assert.assertEquals(segregatedBowls.getBowlSize(),4);
	    	  List<FruitBowl> orangeBowl = segregatedBowls.getFruitBowl();
	    	  
	    	  for ( FruitBowl fruitBowl : orangeBowl) {
	    		  Assert.assertTrue(fruitBowl  instanceof Oranges);
	    	   }
	    }
	   
//	   @Test
//     public void verifyAppleBowl() {
////		segregatedBowls  = new SegregatedBowls(null, 0);
//	  List<FruitBowl> appleBowl = segregatedBowls.getFruitBowl();
//	  System.out.println("apple size" + appleBowl.size());
//	  for ( FruitBowl fruitBowl : appleBowl) {
//		  Assert.assertTrue(fruitBowl  instanceof Apples);
//	   }
//    }
	//  @Test
//	  public void verifyBananaBowl() {
//		 
//		  List<FruitBowl> bananaBowl = bananas.getBananaBowl();
//		  for ( FruitBowl fruitBowl : bananaBowl) {
//			  Assert.assertTrue(fruitBowl  instanceof Bananas);
//		  }
//	  }
//		  
//	  @Test
//	  public void verifyOrangeBowl() {
//		 
//		  List<FruitBowl> orangeBowl = oranges.getOrangeBowl();
//		  for ( FruitBowl fruitBowl : orangeBowl) {
//			  Assert.assertTrue(fruitBowl  instanceof Oranges);
//		  }		
//	  }
	   
	   //Set 2
//	    @Test
//	    public void segregateApples() {
//		  apples=new FruitBowl();
//		  apples.getAppleBowl();
//		}
	//  
//	    @Test
//	    public void segregateBananas() {
//		    bananas=new FruitBowl();
//		    bananas.getBananaBowl();
//	    }
	//    
//	    @Test
//	    public void segregateOranges() {
//		  oranges=new FruitBowl();
//		  oranges.getOrangeBowl();
//	    }
	//  
//		  
//	    @Test
//	    public void verifyCountofApples() {
//		  Assert.assertEquals(apples.getAppleSize(),3);
//	    }
	//  
//	     @Test
//	     public void verifyCountofBananas() {
//	    	  Assert.assertEquals(bananas.getBananaSize(),2);
//	     }
//		 
	//  
//	     @Test
//	     public void verifyCountofOranges() {
//	    	  Assert.assertEquals(oranges.getOrangeSize(),4);
//	    }
}