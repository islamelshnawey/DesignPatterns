package com.helloworldtechs.designPattern.behavioral.strategy.example2;

import java.util.List;

public class Cart {

    List<Item> itemList;
    DiscountStrategy discountStrategy;

    double getTotal() {

        double total = 0;
        for (Item item : itemList) {
            total += item.price;
        }
        total *= discountStrategy.getDiscountReate();
        return total;

    }


}
