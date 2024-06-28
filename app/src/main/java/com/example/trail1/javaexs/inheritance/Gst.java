package com.example.trail1.javaexs.inheritance;

public class Gst extends IncomeTax{
    @Override
    int calculateTax(int income) {
        int oldTax = super.calculateTax(income);
        int newTax = 1000;
        return  oldTax + newTax;
    }
}
