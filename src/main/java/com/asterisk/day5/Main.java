package com.asterisk.day5;

import com.asterisk.day5.login.GithubLogin;
import com.asterisk.day5.login.GmailLogin;
import com.asterisk.day5.login.Login;
import com.asterisk.day5.playable.Playable;

public class Main {
    public static void main(String[] args) {
    Login login=new GmailLogin();
    login.process();

        //        justPlay(new Football());

//        Ball ball=new BasketballV2();
//        ball.play();
//        Football football=new Football();
//        football.play();
//        Basketball basketball=new Basketball();
//        basketball.play();

//        Father father=new Father();
//        Father father1=new Son();
//    }

//        SamsungV1 samsungv1 = new SamsungV2();
//        samsungv1.call();
    Pet pet=new Cat();
    pet.run();
    }
    public static void justPlay(Playable playable){
        playable.play();
    }
}
