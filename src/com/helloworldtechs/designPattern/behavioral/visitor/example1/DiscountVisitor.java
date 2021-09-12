package com.helloworldtechs.designPattern.behavioral.visitor.example1;

public class DiscountVisitor implements Visitor {

    private double totalDiscount;

    @Override
    public void visit(FoodItem item) {

        // apply 30 % off for food items
        double discount = item.getPrice() * 0.3;
        totalDiscount += discount;
        item.setPrice(item.getPrice() - discount);
    }

    @Override
    public void visit(LiquorItem item) {

        // apply 10 % off for food items
        double discount = item.getPrice() * 0.1;
        totalDiscount += discount;
        item.setPrice(item.getPrice() - discount);
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }
}
