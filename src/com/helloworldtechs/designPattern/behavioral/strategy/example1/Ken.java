package com.helloworldtechs.designPattern.behavioral.strategy.example1;

import com.helloworldtechs.designPattern.behavioral.strategy.example1.interfaces.JumpBehavior;
import com.helloworldtechs.designPattern.behavioral.strategy.example1.interfaces.KickBehavior;

public class Ken extends Fighter{


    public Ken(KickBehavior kickBehavior,
               JumpBehavior jumpBehavior)
    {
        super(kickBehavior,jumpBehavior);
    }
    public void display()
    {
        System.out.println("Ken");
    }

}
