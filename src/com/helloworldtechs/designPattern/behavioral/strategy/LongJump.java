package com.helloworldtechs.designPattern.behavioral.strategy;


import com.helloworldtechs.designPattern.behavioral.strategy.interfaces.JumpBehavior;

public class LongJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("Long Jump");

    }
}
