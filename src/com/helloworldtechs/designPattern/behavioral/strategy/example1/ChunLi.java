package com.helloworldtechs.designPattern.behavioral.strategy.example1;

import com.helloworldtechs.designPattern.behavioral.strategy.example1.interfaces.JumpBehavior;
import com.helloworldtechs.designPattern.behavioral.strategy.example1.interfaces.KickBehavior;

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
