package com.helloworldtechs.designPattern.behavioral.strategy;

import com.helloworldtechs.designPattern.behavioral.strategy.interfaces.JumpBehavior;
import com.helloworldtechs.designPattern.behavioral.strategy.interfaces.KickBehavior;

public class ChunLi extends Fighter{

    public ChunLi(KickBehavior kickBehavior,
                  JumpBehavior jumpBehavior)
    {
        super(kickBehavior,jumpBehavior);
    }
    public void display()
    {
        System.out.println("ChunLi");
    }
}
