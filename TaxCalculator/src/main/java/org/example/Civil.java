package org.example;

public class Civil extends TaxPayer {
    public Civil(double income) {
        super(income);
        taxFreeIncome = 0;
        soc_security = calculateIncomePercentage(9.76);
        taxDeductibleExpenses  = calculateIncomePercentage(20);
    }
}
