package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true,true);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    DeluxePizza ndp = new DeluxePizza(false,false);
    ndp.addTakeaway();
    System.out.println(ndp.getBill());

    Pizza p = new Pizza(false);
    //p.addExtraCheese();
    //p.addExtraToppings();
    //p.addTakeaway();
    System.out.println(p.getBill());
  }
}