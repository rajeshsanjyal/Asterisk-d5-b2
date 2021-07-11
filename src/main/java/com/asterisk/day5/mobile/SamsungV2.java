package com.asterisk.day5.mobile;

import com.asterisk.day5.mobile.SamsungV1;

public class SamsungV2 extends SamsungV1 {
    @Override
    public void call() {
        super.call();
        System.out.println("Refining Sound quality");
    }
}
