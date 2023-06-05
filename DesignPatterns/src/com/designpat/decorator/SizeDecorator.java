package com.designpat.decorator;

public abstract class SizeDecorator extends Beverage{
    private String size = "TALL";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
