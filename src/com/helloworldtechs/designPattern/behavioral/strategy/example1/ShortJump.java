package com.helloworldtechs.designPattern.behavioral.strategy.example1;

import com.helloworldtechs.designPattern.behavioral.strategy.example1.interfaces.JumpBehavior;

public class ShortJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("Short Jump");

    }
}
