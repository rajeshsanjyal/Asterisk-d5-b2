package com.asterisk.day5.playable;

import com.asterisk.day5.playable.Ball;

public class Basketball extends Ball {

    @Override
    public void play() {
        color="Red";
        System.out.println("Playing "+color+" Basketball");
    }
}
