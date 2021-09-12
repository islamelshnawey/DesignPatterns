package com.helloworldtechs.designPattern.behavioral.strategy.example1;

import com.helloworldtechs.designPattern.behavioral.strategy.example1.interfaces.KickBehavior;

public class LightningKick implements KickBehavior {
    @Override
    public void kick() {
        System.out.println("Lightning Kick");

    }
}
