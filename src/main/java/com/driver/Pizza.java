package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean extrachess;

    private Boolean extratoppings;

    private Boolean takeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg){
            this.bill="Base Price Of The Pizza: 300 ";
            price=300;
        }
        else{
            this.bill="Base Price Of The Pizza: 400 ";
            price=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extrachess){
            return;
        }
        extrachess=true;
        //this.bill+="Extra Cheese Added: 80 ";
        price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(extratoppings){
            return;
        }
        extratoppings=true;
        //this.bill+="Extra Toppings Added: 70 ";
        if(isVeg)
            price+=70;

        else price+=120;
    }

    public void addTakeaway(){
        // your code goes here
        if(takeaway){
            return;
        }
        takeaway=true;
        //this.bill+="Paperbag Added: 20 ";
        price+=20;
    }

    public String getBill(){
        // your code goes here
        if(extrachess){
            this.bill+="\nExtra Cheese Added: 80 ";
        }
        if(extratoppings){
            if(isVeg)
                this.bill+="\nExtra Toppings Added: 70 ";

            else this.bill+="\nExtra Toppings Added: 120 ";
        }
        if(takeaway){
            this.bill+="\nPaperbag Added: 20 ";
        }
        this.bill+="\nTotal price: "+ price;
        return this.bill;
    }
}
