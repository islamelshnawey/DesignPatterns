package com.helloworldtechs.designPattern.behavioral.strategy;

import com.helloworldtechs.designPattern.behavioral.strategy.interfaces.JumpBehavior;

public class ShortJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("Short Jump");

    }
}
