package org.example;

public enum ContractTypeEnum {
    Employment('E'),
    Civil('C');

    private final char value;

    ContractTypeEnum(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public static ContractTypeEnum fromChar(char c) {
        for (ContractTypeEnum l : ContractTypeEnum.values()) {
            if (l.value == c) {
                return l;
            }
        }
        throw new IllegalArgumentException("No enum constant for char: " + c);
    }
}
