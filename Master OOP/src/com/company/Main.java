package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger miHamburger = new Hamburger(1,2);
        System.out.println(miHamburger.getMeat()+" "+miHamburger.getBreadType());
        System.out.println("Precio base: "+miHamburger.getBasePrice()+" | Precio Adicional: "+miHamburger.getAdditionalPrice());

        HealthyBurger myHelthyBurger = new HealthyBurger(1,1);
        myHelthyBurger.addApetizer(2,2);
        System.out.println(myHelthyBurger.getMeat()+" "+myHelthyBurger.getBreadType());
        System.out.println("Precio base: "+myHelthyBurger.getBasePrice()+" | Precio Adicional: "+myHelthyBurger.getAdditionalPrice());

        DeluxeBurger myDeluxeBurger = new DeluxeBurger(1,1,1,1,1);
        System.out.println(myDeluxeBurger.getMeat()+" "+myDeluxeBurger.getBreadType());
        System.out.println("Precio base: "+myDeluxeBurger.getBasePrice()+" | Precio Adicional: "+myDeluxeBurger.getAdditionalPrice());
    }
}
