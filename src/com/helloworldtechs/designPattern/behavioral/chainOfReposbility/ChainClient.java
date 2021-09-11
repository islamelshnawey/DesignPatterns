package com.helloworldtechs.designPattern.behavioral.chainOfReposbility;

import java.util.Scanner;

public class ChainClient {

    public static void main (String[] args){

        // create chain of dispensers
        CashDispenser dispenser = new CashDispenser(100);
        dispenser.setNextDispenser(new CashDispenser(50));
        dispenser.setNextDispenser(new CashDispenser(20));
        dispenser.setNextDispenser(new CashDispenser(10));
        dispenser.setNextDispenser(new CashDispenser(5));
        dispenser.setNextDispenser(new CashDispenser(2));
        dispenser.setNextDispenser(new CashDispenser(1));

        // get the amount
        int amount = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Amount to withdraw : ");
        amount = in.nextInt();

        dispenser.dispense(amount);

        in.close();

    }
}
