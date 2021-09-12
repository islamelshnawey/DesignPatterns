package com.helloworldtechs.designPattern.behavioral.visitor.example1;

public class VisitorClient {

    public static void main(String[] args) {

        /* Create List and add items */

        Visitable[] order = new Visitable[]{
         new FoodItem(1, "Italian Pizza", 6.99)
        ,new LiquorItem(1, "Avocado Milk", 10.99)
        ,new LiquorItem(1, "Banana Milk", 8.99)
        ,new FoodItem(1, "Rice", 5.99)
        ,new FoodItem(1, "Shawerma", 18.99)};

        /* Create visitors to be applied */
        DiscountVisitor discountVisitor = new DiscountVisitor();
        TaxVisitor taxVisitor = new TaxVisitor();

        /* apply visitors on items */
        for (Visitable item : order) {
            item.apply(discountVisitor);
            item.apply(taxVisitor);
        }

        System.out.println("Total Discount = " + discountVisitor.getTotalDiscount());
        System.out.println("Total Tax = " + taxVisitor.getTotalTax());

    }

}
