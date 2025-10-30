package org.example;

public abstract class TaxPayer {
    public double income;

    protected double taxDeductibleExpenses;
    protected double taxFreeIncome;
    protected double soc_security;

    public TaxPayer(double income) {
        this.income = income;
    }

    public double calculateNetIncome() {
        double soc_health_security = calculateIncomePercentage(1.5);
        double soc_health_9 = calculateIncomePercentage(9);

        PrintTax.addTaxDetail("Social security tax: ", soc_security);
        PrintTax.addTaxDetail("Health social security tax: ", soc_health_security);
        PrintTax.addTaxDetail("Health tax 9%: ", soc_health_9);
        PrintTax.addTaxDetail("Tax deductible expenses: ", taxDeductibleExpenses);

        return income - soc_security - soc_health_security - soc_health_9;
    }

    protected double calculateIncomePercentage(double percentage) {
        return calculateIncomePercentage(percentage, this.income);
    }

    protected double calculateIncomePercentage(double percentage, double income) {
        return (income * percentage) / 100;
    }
}
