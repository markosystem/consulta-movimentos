package com.bnp.deal.movements.model;

import com.bnp.deal.movements.model.enums.Classification;
import com.bnp.deal.movements.model.enums.Status;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUTO_COSIF")
@Getter
@Setter
@IdClass(ProductCosifId.class)
public class ProductCosif implements Serializable {
    private static final long serialVersionUID = 4515183698763916439L;

    public ProductCosif() {
    }

    public ProductCosif(String codCosif, Product product, Classification codClassification, Status staProduct) {
        this.codCosif = codCosif;
        this.product = product;
        this.codClassification = codClassification;
        this.staProduct = staProduct;
    }

    @Id
    @Column(name = "COD_COSIF", length = 11)
    private String codCosif;

    @Id
    @ManyToOne
    @JoinColumn(name = "COD_PRODUTO")
    private Product product;

    @Column(name = "COD_CLASSIFICACAO", length = 6)
    private Classification codClassification;

    @Column(name = "STA_STATUS", length = 1)
    private Status staProduct;

    @Override
    public String toString() {
        return "ProductCosif{" +
                "codCosif='" + codCosif + '\'' +
                ", product=" + product +
                ", codClassification=" + (codClassification == null ? "null": codClassification.getCode()) +
                ", staProduct=" + (staProduct == null ? "null": staProduct.getCode()) +
                '}';
    }
}
