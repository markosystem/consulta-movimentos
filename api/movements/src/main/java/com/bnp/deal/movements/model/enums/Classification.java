package com.bnp.deal.movements.model.enums;

public enum Classification {
    NORMAL("Normal"), MTM("MTM");

    private String code;

    private Classification(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
