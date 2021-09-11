package com.helloworldtechs.designPattern.behavioral.strategy;

import com.helloworldtechs.designPattern.behavioral.strategy.interfaces.JumpBehavior;
import com.helloworldtechs.designPattern.behavioral.strategy.interfaces.KickBehavior;

public class Ryu extends Fighter{

    public Ryu(KickBehavior kickBehavior,
               JumpBehavior jumpBehavior)
    {
        super(kickBehavior,jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("Ryu");

    }
}
