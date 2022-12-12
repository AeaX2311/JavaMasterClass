package com.company;

public class Hamburger {
    private int breadType; private int meat;   //pan y carne 50 (1) - precio base - (2) 60 Aperitivos 10 - EXTRA -

    public Hamburger(int breadType, int meat) {
        this.breadType = breadType;
        this.meat = meat;
    }

    public int getBasePrice(){
        int price=0;
        if(breadType==1)
            price+=25;
        else
            price+=30;
        if(meat==1)
            price+=25;
        else
            price+=30;
        return price;
    }

    public int getAdditionalPrice(){
        return 0;
    }

    public String getBreadType() {
        if(breadType==1)
            return "Normal";
        return "Special";
    }

    public String getMeat() {
        if(meat==1)
            return "Normal";
        return "Special";
    }
}
