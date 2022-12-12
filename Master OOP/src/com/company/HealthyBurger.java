package com.company;

public class HealthyBurger extends Hamburger {
    private int lettuce; private int carrot;

    public HealthyBurger(int lettuce, int carrot) {
        super(1, 1);
        this.lettuce = lettuce;
        this.carrot = carrot;
    }

    public void addApetizer(int lettuce, int carrot) {
        this.lettuce+=lettuce;
        this.carrot+=carrot;
    }

    @Override
    public int getAdditionalPrice() {
        return (lettuce+carrot)*10;
    }
}
