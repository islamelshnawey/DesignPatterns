package com.helloworldtechs.designPattern.behavioral.observer.example2;
/*
* When to use
*
* When there is one to many relationship between objects such as if one object is modified,
* its dependent objects are to be notified automatically and corresponding changes are done to all dependent objects.
*
* Intent
* Define a one-to-many dependency between objects so that when one object changes state,
* all its dependents are notified and updated automatically.
*
* Structure
*
* Implementation
*
* Consider a simple Point Of Sale (POS) system which has many peripherals attached to it.
* Each peripheral(observer) registers itself to the interested topics(subjects)
* so that it can update its status when that topic/event occurs.
* For e.g., when an item or payment is added to the order, the cashier display and customer display need to be updated with the new details.
* Similarly when the order is completed, the receipt printer will act on it by printing the receipt.
*
* */
public class ObserverClient {

    public static void main(String[] args) {

        /* Create an order and add items */
        Order order = new Order();
        order.addItem(new Item("Pizza", 6.99));
        order.addItem(new Item("Wine", 9.99));
        order.addItem(new Item("Beer", 5.99));
        order.addItem(new Item("Apple", 1.49));

        System.out.println("---------------------------------");

        /* Create payments and make payments */
        order.makePayment(new Payment("CASH", 20.00));
        order.makePayment(new Payment("CREDIT", 10.00));
        order.makePayment(new Payment("DEBIT", 10.00));
        System.out.println("---------------------------------");

        /* Complete the order */
        order.completeOrder();
    }
}
