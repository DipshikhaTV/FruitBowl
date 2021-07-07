package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FruitBowl {
public ArrayList<FruitBowl> fruitBowls = new ArrayList<FruitBowl>();
 
	
  public void addFruit(FruitBowl fruit) {
    fruitBowls.add(fruit);
   }
  public void addFruits(List<FruitBowl> fruit)  {
      fruitBowls.addAll(fruit);
  }
  public List<FruitBowl> getApples()
  {
      return fruitBowls.stream().filter(fruit -> fruit instanceof Apples).collect(Collectors.toList());
  }  
  public List<FruitBowl> getOranges()
  {
      return fruitBowls.stream().filter(fruit -> fruit instanceof Oranges).collect(Collectors.toList());
  }
  public List<FruitBowl> getBananas()
  {
      return fruitBowls.stream().filter(fruit -> fruit instanceof Bananas).collect(Collectors.toList());
  }
public int getSizeOfBowl()
  {
      return fruitBowls.size();
  }

	     
}
