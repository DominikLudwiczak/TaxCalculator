package org.example;

public class Employment extends TaxPayer {
    public Employment(double income) {
        super(income);
        taxFreeIncome = 46.33;
        soc_security = 0;
        taxDeductibleExpenses  = 111.25;
    }
}
