package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaxCalculator {

    public static double income = 0;
    public static ContractTypeEnum contractType;
    private static TaxPayer taxPayer;


    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter income: ");
            var income = Double.parseDouble(br.readLine());
            TaxCalculator.income = income;
            PrintTax.addTaxDetail("Income", income);

            System.out.print("Contract Type: (E)mployment, (C)ivil: ");
            var contractType = ContractTypeEnum.fromChar(br.readLine().charAt(0));
            TaxCalculator.contractType = contractType;
            switch (contractType) {
                case Civil -> taxPayer = new Civil(income);
                case Employment -> taxPayer = new Employment(income);
                default -> {
                    return;
                }
            }

            var netIncome = taxPayer.calculateNetIncome();
            PrintTax.addTaxDetail("Net Income", netIncome);

            PrintTax.printTaxDetails();
        } catch (Exception ex) {
            System.out.println("Incorrect");
            System.err.println(ex);
        }
    }
}