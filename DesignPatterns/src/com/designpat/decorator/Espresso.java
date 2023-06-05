package com.designpat.decorator;

public class Espresso extends Beverage {
    private static double COST = 1.99;

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return COST;
    }
}
