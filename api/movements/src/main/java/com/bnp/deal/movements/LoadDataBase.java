package com.bnp.deal.movements;

import com.bnp.deal.movements.factory.ProductCosifFactory;
import com.bnp.deal.movements.factory.ProductFactory;
import com.bnp.deal.movements.model.Product;
import com.bnp.deal.movements.model.ProductCosif;
import com.bnp.deal.movements.model.enums.Classification;
import com.bnp.deal.movements.model.enums.Status;
import com.bnp.deal.movements.service.ProductCosifService;
import com.bnp.deal.movements.service.ProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class LoadDataBase {
    private static final Logger logger = LogManager.getLogger(LoadDataBase.class);

    @Bean
    CommandLineRunner initDatabase(ProductService productService, ProductCosifService productCosifService) {
        try {
            return args -> {
                List<Product> productList = new ArrayList<>();
                List<ProductCosif> productCosifList = new ArrayList<>();
                logger.info("\n");
                logger.info(" *** Inserindo Produtos para Movimentações *** ");
                for (int i = 0; i < 10; i++) {
                    Product p = productService.save(ProductFactory.initializeConstructor("000" + i, "Produto Nº " + i, Status.ATIVO));
                    print(p.toString());
                    productList.add(p);
                }
                logger.info("---------------------------------");

                logger.info(" *** Inserindo Produtos_Cosif para Movimentações *** ");
                for (int i = 0; i < 10; i++) {
                    ProductCosif p = productCosifService.save(ProductCosifFactory.initializeConstructor("9999" + i, productList.get(i), Classification.MTM, Status.ATIVO));
                    print(p.toString());
                    productCosifList.add(p);
                }
                logger.info("---------------------------------");
            };
        } catch (Exception e) {
            logger.error(" *** Ops, ocorreu um erro ao popular o banco! *** ", e);
            System.exit(0);
            return null;
        }
    }

    private void print(String msg) {
        logger.info("Registered => " + msg);
    }
}
