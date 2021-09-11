package com.helloworldtechs.designPattern.behavioral.strategy;

import com.helloworldtechs.designPattern.behavioral.strategy.interfaces.KickBehavior;

public class LightningKick implements KickBehavior {
    @Override
    public void kick() {
        System.out.println("Lightning Kick");

    }
}