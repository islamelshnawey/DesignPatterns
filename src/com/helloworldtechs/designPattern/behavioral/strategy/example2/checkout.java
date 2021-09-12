package com.helloworldtechs.designPattern.behavioral.strategy.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * In Strategy pattern, a class behavior or its algorithm can be changed at run time.
 * This type of design pattern comes under behavior pattern.
 *
 * In Strategy pattern, we create objects which represent various strategies
 * and a context object whose behavior varies as per its strategy object.
 * The strategy object changes the executing algorithm of the context object.
 */
public class checkout {

    public static void main(String[] args) {
        Item phone = new Item("Oppo", 1000);
        Item headPhone = new Item("Samsung", 1000);
        Cart cart = createCart(false, true, phone, headPhone);
        System.out.println(cart.getTotal());
    }

    static Cart createCart(boolean isMember, boolean isEmployee, Item... items) {

        Cart cart = new Cart();
        List<Item> itemList = new ArrayList<>();
        for (Item item : items) {
            itemList.add(item);
        }
        cart.itemList = itemList;
        if (isEmployee) {
            cart.discountStrategy = new EmployeeDiscount();
        } else if (isMember) {
            cart.discountStrategy = new MemberDiscount();
        } else {
            cart.discountStrategy = new GuestDiscount();
        }
        return cart;
    }
}
