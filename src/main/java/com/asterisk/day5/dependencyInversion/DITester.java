package com.asterisk.day5.dependencyInversion;

public class DITester {
    public static void main(String[] args) {
        testAdd(new Add());
    }
    public static void testAdd(Add add){
        System.out.println(add.calculation(2,3));
    }
}
