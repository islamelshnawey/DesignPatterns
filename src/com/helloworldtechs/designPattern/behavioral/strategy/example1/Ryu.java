package com.helloworldtechs.designPattern.behavioral.strategy.example1;

import com.helloworldtechs.designPattern.behavioral.strategy.example1.interfaces.JumpBehavior;
import com.helloworldtechs.designPattern.behavioral.strategy.example1.interfaces.KickBehavior;

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
