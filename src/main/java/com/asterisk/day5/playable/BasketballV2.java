package com.asterisk.day5.playable;

import com.asterisk.day5.playable.Basketball;

public class BasketballV2 extends Basketball {
    @Override
    public void play() {
        super.play();
        System.out.println("Playing "+color+" BasketballV2");
    }
//    public void flysback(){
//        System.out.println("This flies back");
//    }

}
