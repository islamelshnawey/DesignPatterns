package com.helloworldtechs.designPattern.behavioral.stratgey2;

public interface DiscountStrategy {

    double getDiscountReate();
}

class EmployeeDiscount implements DiscountStrategy {

    @Override
    public double getDiscountReate() {
        return 0.8;
    }
}

class GuestDiscount implements DiscountStrategy {

    @Override
    public double getDiscountReate() {
        return 1;
    }
}

class MemberDiscount implements DiscountStrategy {

    @Override
    public double getDiscountReate() {
        return 0.9;
    }
}