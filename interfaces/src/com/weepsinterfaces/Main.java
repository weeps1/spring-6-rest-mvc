package com.weepsinterfaces;

public class Main {
    public static void main(String[] args) {

        var calculator = new TaxCalculator2018(100000);
        var report = new TaxReport(calculator);
    }
}
