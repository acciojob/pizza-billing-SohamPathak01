package com.driver;

public class DeluxePizza extends Pizza {

    private boolean takeaway;
    int price;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes her
            addExtraCheese();
            addExtraToppings();
            //addTakeaway();
            this.price=getPrice();
    }
    public void setTakeaway(){
        if(takeaway){
            return;
        }
        else{
            takeaway=true;
        }
        price+=20;
    }
}
