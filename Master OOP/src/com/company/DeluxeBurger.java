package com.company;

public class DeluxeBurger extends Hamburger {
    private int cheese; private int meatExtra; private int tomato;
    private int carrot; private int lettuce;

    public DeluxeBurger(int cheese, int meatExtra, int tomato, int carrot, int lettuce) {
        super(2, 2);
        this.cheese = cheese;
        this.meatExtra = meatExtra;
        this.tomato = tomato;
        this.carrot = carrot;
        this.lettuce = lettuce;
    }

    @Override
    public int getBasePrice() {
        return super.getBasePrice()+40;
    }

    @Override
    public int getAdditionalPrice() {
        return (cheese+meatExtra*2+tomato+carrot+lettuce)*10;
    }
}
