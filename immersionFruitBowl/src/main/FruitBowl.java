package main;

import java.util.ArrayList;

import java.util.List;

public class FruitBowl {
	
  public List<Fruit> fruitBowl;
  

	
  public FruitBowl() {
	  fruitBowl = new ArrayList<Fruit>();
  }
  public void addFruit(Fruit fruit) {
    fruitBowl.add(fruit);
   }
  public List<Fruit> getFruitBowl() {
	    return fruitBowl;
	   }
	  
   

 public SegregatedBowls getAppleBowl()
 {    List<Fruit> appleBowl = new ArrayList<Fruit>();
	  for ( Fruit fruitBowl1 : fruitBowl) {
		  if (fruitBowl1  instanceof Apples) {
			  
			  appleBowl.add(fruitBowl1);
				 }
       }
	  return new SegregatedBowls(appleBowl);
 }
 
 public SegregatedBowls getBananaBowl()
 {    List<Fruit> bananaBowl = new ArrayList<Fruit>();
	  for ( Fruit fruitBowl1 : fruitBowl) {
		  if (fruitBowl1  instanceof Bananas) {
			  
			  bananaBowl.add(fruitBowl1);
				 }
       }
	  return new SegregatedBowls(bananaBowl);
 }

 public SegregatedBowls getOrangeBowl()
 {    List<Fruit> orangeBowl = new ArrayList<Fruit>();
	  for ( Fruit fruitBowl1 : fruitBowl) {
		  if (fruitBowl1  instanceof Oranges) {
			  
			  orangeBowl.add(fruitBowl1);
				 }
       }
	  return new SegregatedBowls(orangeBowl);
 }

//public List<FruitBowl> getAppleBowl()
//{
//	  for ( FruitBowl fruitBowl1 : fruitBowls) {
//		  if (fruitBowl1  instanceof Apples) {
//			  
//			  appleBowl.add(fruitBowl1);
//				 }
//     }
//	  return appleBowl;
//}
//public List<FruitBowl> getBananaBowl()
//{
//	  for ( FruitBowl fruitBowl1 : fruitBowls) {
//		  if (fruitBowl1  instanceof Bananas) {
//			  
//			  bananaBowl.add(fruitBowl1);
//				 }
//     }
//	  return bananaBowl;
//}
//public List<FruitBowl> getOrangeBowl()
//{
//	  for ( FruitBowl fruitBowl1 : fruitBowls) {
//		  if (fruitBowl1  instanceof Oranges) {
//			  
//			  orangeBowl.add(fruitBowl1);
//				 }
//     }
//	  return orangeBowl;
//}
//
//public int getAppleSize()
//{
//   return appleBowl.size();
//}
//public int getBananaSize()
//{
//  return appleBowl.size();
//}
//public int getOrangeSize()
//{
//  return orangeBowl.size();
//}	     
}
