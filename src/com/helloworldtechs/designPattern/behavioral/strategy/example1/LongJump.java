package com.helloworldtechs.designPattern.behavioral.strategy.example1;


import com.helloworldtechs.designPattern.behavioral.strategy.example1.interfaces.JumpBehavior;

public class LongJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("Long Jump");

    }
}
