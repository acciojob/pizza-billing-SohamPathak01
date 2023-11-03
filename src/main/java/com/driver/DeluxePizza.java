package com.driver;

public class DeluxePizza extends Pizza {

    //private boolean takeaway;
    int price;
    String bill;
    public DeluxePizza(Boolean isVeg,boolean takeaway) {
        super(isVeg);
        // your code goes her
            addExtraCheese();
            addExtraToppings();
            if(takeaway)
                addTakeaway();

            this.bill=getBill();
            this.price=getPrice();
    }
}
