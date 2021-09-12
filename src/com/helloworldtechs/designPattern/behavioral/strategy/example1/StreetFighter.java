package com.helloworldtechs.designPattern.behavioral.strategy.example1;


import com.helloworldtechs.designPattern.behavioral.strategy.example1.interfaces.JumpBehavior;
import com.helloworldtechs.designPattern.behavioral.strategy.example1.interfaces.KickBehavior;

public class StreetFighter {

    public static void main(String args[])
    {
        // let us make some behaviors first
        JumpBehavior shortJump = new ShortJump();
        JumpBehavior LongJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();

        // Make a fighter with desired behaviors
        Fighter ken = new Ken(tornadoKick,shortJump);
        ken.display();

        // Test behaviors
        ken.punch();
        ken.kick();
        ken.jump();

        // Change behavior dynamically (algorithms are
        // interchangeable)
        ken.setJumpBehavior(LongJump);
        ken.jump();
    }

}
