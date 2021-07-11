package com.asterisk.day5.dependencyInversion;

public class Add implements Calculation{
    @Override
    public int calculate(int i, int j) {
        return i+j;
    }
}
