package com.helloworldtechs.designPattern.behavioral.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List cart = new ArrayList();
    List payments = new ArrayList();

    private Topic addItemTopic;
    private Topic addPaymentTopic;
    private Topic completeOrderTopic;

    public Order() {
        // create observers (devices)
        Observer cashierDisplay = new CashierDisplay();
        Observer customerDisplay = new CustomerDisplay();

        // create subjects (events)
        addItemTopic = new AddItemTopic();
        addPaymentTopic = new AddPaymentTopic();
        completeOrderTopic = new CompleteOrderTopic();

        // Cashier display subscribed to all topics
        addItemTopic.register(cashierDisplay);
        addPaymentTopic.register(cashierDisplay);
        completeOrderTopic.register(cashierDisplay);

        // Customer display subscribed to all topics
        addItemTopic.register(customerDisplay);
        addPaymentTopic.register(customerDisplay);
        completeOrderTopic.register(customerDisplay);


    }

    public void addItem(Item item) {
        cart.add(item);
        String line = item.name + " $" + item.price;
        addItemTopic.notifyObservers(line);
    }

    public void makePayment(Payment payment) {
        payments.add(payment);
        String line = payment.type + " $" + payment.amount;
        addPaymentTopic.notifyObservers(line);

    }

    public void completeOrder() {
        String line = "Order completed";
        completeOrderTopic.notifyObservers(line);
    }

}
