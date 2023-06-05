package com.designpat.decorator;

public class DarkRoast extends Beverage{
    private static double COST = .99;

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return COST;
    }
}
