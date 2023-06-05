package com.designpat.decorator;

public class SmallDrink extends SizeDecorator {
    Beverage beverage;

    public SmallDrink(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + " Small ";
    }

    @Override
    public double cost() {
        return beverage.cost() + .5;
    }

    @Override
    public String getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(String size) {
        super.setSize(size);
    }
}
