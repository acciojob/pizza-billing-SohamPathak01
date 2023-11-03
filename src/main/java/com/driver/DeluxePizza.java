package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes her
            addExtraCheese();
            addExtraToppings();
            //addTakeaway();
            int price=getPrice();
    }
}
