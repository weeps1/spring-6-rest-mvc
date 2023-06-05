package com.designpat.decorator;

public class HouseBlend extends Beverage {
    private static double COST = .89;

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return COST;
    }
}
