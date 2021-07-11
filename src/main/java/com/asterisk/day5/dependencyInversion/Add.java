package com.asterisk.day5.dependencyInversion;

public class Add implements Calculation{
    @Override
    public int calculation(int i, int j) {
        return i+j;
    }
}
