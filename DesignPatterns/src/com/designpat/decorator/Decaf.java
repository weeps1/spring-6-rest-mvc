package com.designpat.decorator;

public class Decaf extends Beverage {
    private static double COST = 1.05;

    public Decaf() {
        description = "DECAF";
    }

    @Override
    public double cost() {
        return COST;
    }
}
