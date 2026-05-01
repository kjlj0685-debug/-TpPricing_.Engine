package org.example;

public class App {

    public static double calculate(double[] prices, int[] qty, String type, String code) {

        double subtotal = 0;

        for (int i = 0; i < prices.length; i++) {
            subtotal += prices[i] * qty[i];
        }

        DiscountStrategy discount;

        if (type.equals("VIP")) {
            discount = new VIPDiscount();
        } else if (code.equals("SAVE10")) {
            discount = new SAVE10Discount();
        } else {
            discount = amount -> amount;
        }

        subtotal = discount.apply(subtotal);

        TaxService taxService = new TaxService();
        double tax = taxService.apply(subtotal);

        return subtotal + tax;
    }
}