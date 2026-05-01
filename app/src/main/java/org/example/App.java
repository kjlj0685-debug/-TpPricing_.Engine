package org.example;

public class App {

    public static double calculate(double[] prices, int[] qty, String customerType, String discountCode) {

        double subtotal = 0;

        for (int i = 0; i < prices.length; i++) {
            subtotal += prices[i] * qty[i];
        }

        // discount by customer type
        if (customerType.equals("VIP")) {
            subtotal = subtotal * 0.8;
        }

        // discount code
        if (discountCode.equals("SAVE10")) {
            subtotal = subtotal * 0.9;
        }

        // tax 15%
        double tax = subtotal * 0.15;

        return subtotal + tax;
    }
}