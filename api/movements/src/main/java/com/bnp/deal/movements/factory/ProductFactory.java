package com.bnp.deal.movements.factory;

import com.bnp.deal.movements.model.Product;
import com.bnp.deal.movements.model.enums.Status;

public class ProductFactory {

    public static Product initialize(){
        return new Product();
    }

    public static Product initializeConstructor(String codProduct, String desProduct, Status staProduct){
        Product model = new Product();
        model.setCodProduct(codProduct);
        model.setDesProduct(desProduct);
        model.setStaProduct(staProduct);
        return model;
    }
}
