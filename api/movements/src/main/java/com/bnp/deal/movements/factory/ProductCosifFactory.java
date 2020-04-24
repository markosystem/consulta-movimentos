package com.bnp.deal.movements.factory;

import com.bnp.deal.movements.model.Product;
import com.bnp.deal.movements.model.ProductCosif;
import com.bnp.deal.movements.model.enums.Classification;
import com.bnp.deal.movements.model.enums.Status;

public class ProductCosifFactory {

    public static ProductCosif initialize(){
        //demais factory de entidades
        return new ProductCosif();
    }

    public static ProductCosif initializeConstructor(String codProductCosif, Product product, Classification codClassification, Status staProduct){
        ProductCosif model = new ProductCosif();
        model.setCodCosif(codProductCosif);
        model.setProduct(product);
        model.setCodClassification(codClassification);
        model.setStaProduct(staProduct);
        //demais factory de entidades
        return model;
    }
}
