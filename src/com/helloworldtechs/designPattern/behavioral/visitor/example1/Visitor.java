package com.helloworldtechs.designPattern.behavioral.visitor.example1;

public interface Visitor {

    void visit(FoodItem foodItem);
    void visit(LiquorItem liquorItem);
}
