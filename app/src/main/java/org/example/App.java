package org.example;

public class App {

    public static double calculate(double[] prices, int[] qty, String customerType, String discountCode) {

        double subtotal = 0;

        for (int i = 0; i < prices.length; i++) {
            subtotal += prices[i] * qty[i];
        }

        DiscountService discountService = new DiscountService();
        subtotal = discountService.apply(subtotal, customerType, discountCode);

        TaxService taxService = new TaxService();
        double tax = taxService.apply(subtotal);

        return subtotal + tax;
    }
}