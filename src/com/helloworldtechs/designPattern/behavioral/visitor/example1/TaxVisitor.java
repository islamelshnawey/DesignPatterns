package com.helloworldtechs.designPattern.behavioral.visitor.example1;

public class TaxVisitor implements Visitor {

    private double totalTax;

    @Override
    public void visit(FoodItem item) {

        // apply 2 % tax on food items
        double tax = item.getPrice() * 0.02;
        totalTax += tax;
        item.setPrice(item.getPrice() - tax);
    }

    @Override
    public void visit(LiquorItem item) {

        // apply 10 % tax on food items
        double tax = item.getPrice() * 0.1;
        totalTax += tax;
        item.setPrice(item.getPrice() - tax);
    }

    public double getTotalTax() {
        return totalTax;
    }
}
