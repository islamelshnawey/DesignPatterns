package com.helloworldtechs.designPattern.behavioral.chainOfReposbility;

public class CashDispenser {

    private int denomiator;
    private CashDispenser next = null;

    public CashDispenser(int val) {
        this.denomiator = val;
    }

    //Method to chain the dispenser
    public void setNextDispenser(CashDispenser d) {

        if (next == null) {
            next = d;
        } else {
            next.setNextDispenser(d);
        }

    }

    // Process the request and pass it to the next processor if required
    public void dispense(int amount) {

        if (amount >= denomiator) {
            int num = amount / denomiator;
            int balance = amount % denomiator;
            System.out.println(num + " * " + denomiator + " $ ");
            if (balance != 0) {
                next.dispense(balance);
            } else {
                next.dispense(amount);
            }

        }

    }

}
