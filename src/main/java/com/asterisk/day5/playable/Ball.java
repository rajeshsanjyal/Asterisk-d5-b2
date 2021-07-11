package com.asterisk.day5.playable;

public abstract class Ball implements Playable {
    protected  Double radius;
    protected Double weight;
    protected String color;

    //read
    public Double getRadius() {
        return radius;
    }
    //write
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public abstract void play();
}
