package com.asterisk.day5.dependencyInversion;

public class DITester {
    public static void main(String[] args) {
        testAdd(new Add());
    }
    public static void testAdd(Calculation add){
        System.out.println(add.calculate(2,3));
    }
}
