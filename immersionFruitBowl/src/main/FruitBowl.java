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
	  
  
  public List<Fruit> getAppleBowl(){
	  List<Fruit> appleBowl = new ArrayList<Fruit>();
	  for ( Fruit fruitBowl1 : fruitBowl) {
		  if (fruitBowl1  instanceof Apples) {
			   appleBowl.add(fruitBowl1);
				 }
       }
	  return appleBowl;
  }
  
  public List<Fruit> getBananaBowl(){
	  List<Fruit> bananaBowl = new ArrayList<Fruit>();
	  for ( Fruit fruitBowl1 : fruitBowl) {
		  if (fruitBowl1  instanceof Bananas) {
			  bananaBowl.add(fruitBowl1);
				 }
       }
	  return bananaBowl;
 }

  public List<Fruit> getOrangeBowl(){
	   List<Fruit> orangeBowl = new ArrayList<Fruit>();
	   for ( Fruit fruitBowl1 : fruitBowl) {
		  if (fruitBowl1  instanceof Oranges) {
			  orangeBowl.add(fruitBowl1);
				 }
       }
	  return orangeBowl;
 }


}
