package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeawayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(!isExtraCheeseAdded) {
            price += 80;
            isExtraCheeseAdded = true;
        }
        return;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded) {
            if(isVeg) {
                price += 70;
            } else {
                price += 120;
            }
            isExtraToppingsAdded = true;
        }
        return;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeawayAdded) {
            price += 20;
            isTakeawayAdded = true;
        }
        return;
    }

    public String getBill(){
        // your code goes here
        bill = "";
        bill += "Base Price Of The Pizza: " + (isVeg ? "300" : "400") + "\n";

        if(isExtraCheeseAdded) {
            bill += "Extra Cheese Added: 80" + "\n";
        }
        if(isExtraToppingsAdded) {
            bill += "Extra Toppings Added: " + (isVeg ? "70" : "120") + "\n";
        }
        if(isTakeawayAdded) {
            bill += "Paperbag Added: 20" + "\n";
        }
        bill += "Total Price: " + price + "\n";
        return this.bill;
    }
}
