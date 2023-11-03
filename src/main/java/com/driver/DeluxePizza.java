package com.driver;

public class DeluxePizza extends Pizza {

    //private boolean takeaway;

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes her
            addExtraCheese();
            addExtraToppings();
    }
}
