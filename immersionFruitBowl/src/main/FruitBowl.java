package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FruitBowl {
	
  public List<FruitBowl> fruitBowls = new ArrayList<FruitBowl>();
  public List<FruitBowl> appleBowl = new ArrayList<FruitBowl>();
  public List<FruitBowl> bananaBowl = new ArrayList<FruitBowl>();
  public List<FruitBowl> orangeBowl = new ArrayList<FruitBowl>();
	
  public void addFruit(FruitBowl fruit) {
    fruitBowls.add(fruit);
   }
  public List<FruitBowl> getFruitBowl() {
	    return fruitBowls;
	   }
	  
   

 public SegregatedBowls getAppleBowl()
 {
	  for ( FruitBowl fruitBowl1 : fruitBowls) {
		  if (fruitBowl1  instanceof Apples) {
			  
			  appleBowl.add(fruitBowl1);
				 }
       }
	  return new SegregatedBowls(appleBowl,appleBowl.size());
 }
 
 public SegregatedBowls getBananaBowl()
 {
	  for ( FruitBowl fruitBowl1 : fruitBowls) {
		  if (fruitBowl1  instanceof Bananas) {
			  
			  bananaBowl.add(fruitBowl1);
				 }
       }
	  return new SegregatedBowls(bananaBowl,bananaBowl.size());
 }

 public SegregatedBowls getOrangeBowl()
 {
	  for ( FruitBowl fruitBowl1 : fruitBowls) {
		  if (fruitBowl1  instanceof Oranges) {
			  
			  orangeBowl.add(fruitBowl1);
				 }
       }
	  return new SegregatedBowls(orangeBowl,orangeBowl.size());
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
