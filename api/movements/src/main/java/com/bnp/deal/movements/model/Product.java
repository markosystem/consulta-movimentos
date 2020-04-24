package com.bnp.deal.movements.model;

import com.bnp.deal.movements.model.enums.Status;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUTO")
@Getter
@Setter
public class Product implements Serializable {
    private static final long serialVersionUID = 1114373703573679032L;
    @Id
    @Column(name = "COD_PRODUTO", length = 4)
    private String codProduct;

    @Column(name = "DES_PRODUTO", length = 30)
    private String desProduct;

    @Column(name = "STA_STATUS", length = 1)
    private Status staProduct;

    @Override
    public String toString() {
        return "Product{" +
                "codProduct='" + codProduct + '\'' +
                ", desProduct='" + desProduct + '\'' +
                ", staProduct=" + (staProduct == null ? "null": staProduct.getCode()) +
                '}';
    }
}
