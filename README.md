## 1. `TaxCalculator` (Main Class)

This is the entry point of the program.

**Responsibilities:**
- Reads input from the user (income + contract type).
- Creates the appropriate `TaxPayer` object (`Employment` or `Civil`).
- Calculates net income.
- Prints a summary of tax details.

---

## 2. `PrintTax`

A utility class used for collecting and printing tax-related details.

- Maintains a `HashMap<String, Double>` for all calculated details.
- Stores each tax detail using `addTaxDetail()`.
- Prints all details with `printTaxDetails()`.

---

## 3. `TaxPayer` (Abstract Base Class)

This represents a general taxpayer.

- Both contract types inherit behavior from this class.

---

## 4. `Employment` (Subclass of `TaxPayer`)

Represents an **Employment Contract** taxpayer.

**Constructor sets:**
```java
taxFreeIncome = 46.33;
soc_security = 0;
taxDeductibleExpenses = 111.25;
```


This means employment has:
- Fixed tax-deductible expenses
- Some tax-free income
- No social security calculated here (could be improved later)

## 5. Civil (Subclass of TaxPayer)

Represents a Civil Contract taxpayer.

Constructor sets:
```java
taxFreeIncome = 0;
soc_security = calculateIncomePercentage(9.76);
taxDeductibleExpenses = calculateIncomePercentage(20);
```

Meaning:
- No tax-free income
- 9.76% social security deducted
- 20% of income is tax-deductible
