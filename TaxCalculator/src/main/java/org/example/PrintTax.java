package org.example;

import java.util.HashMap;

public class PrintTax {
    private static HashMap<String, Double> taxDetails = new HashMap<>();

    public static void addTaxDetail(String key, Double value) {
        taxDetails.put(key, value);
    }

    public static void printTaxDetails() {
        taxDetails.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}
