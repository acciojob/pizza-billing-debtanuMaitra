package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean isExtraCheeseAdded = false;
    private int total = 0;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isTakeawayAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        total += price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded) {
            total += 80;
            isExtraCheeseAdded = true;
        }
        return;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded) {
            if(isVeg) {
                total += 70;
            } else {
                total += 120;
            }
            isExtraToppingsAdded = true;
        }
        return;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeawayAdded) {
            total += 20;
            isTakeawayAdded = true;
        }
        return;
    }

    public String getBill(){
        // your code goes here
        bill = "Base Price Of The Pizza: " + (isVeg ? "300" : "400") + "\n";

        if(isExtraCheeseAdded) {
            bill += "Extra Cheese Added: 80" + "\n";
        }
        if(isExtraToppingsAdded) {
            bill += "Extra Toppings Added: " + (isVeg ? "70" : "120") + "\n";
        }
        if(isTakeawayAdded) {
            bill += "Paperbag Added: 20" + "\n";
        }
        bill += "Total Price: " + total;
        return this.bill;
    }
}
