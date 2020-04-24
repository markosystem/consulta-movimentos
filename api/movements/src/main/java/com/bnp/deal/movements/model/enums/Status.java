package com.bnp.deal.movements.model.enums;

public enum Status {
    ATIVO("A"), INATIVO("I");

    private String code;

    private Status(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
