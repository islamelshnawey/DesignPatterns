package com.helloworldtechs.designPattern.behavioral.visitor.example1;

public class LiquorItem implements Visitable{

    private int id ;
    private String name ;
    private double price ;

    @Override
    public void apply(Visitor visitor) {
        visitor.visit(this);

    }

    public LiquorItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
