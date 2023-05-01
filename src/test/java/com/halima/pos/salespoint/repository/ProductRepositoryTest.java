package com.halima.pos.salespoint.repository;


import com.halima.pos.salespoint.model.entity.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.Column;
import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class ProductRepositoryTest {
    @Autowired
    private ProductRepo productRepo;
    //    public Product addProduct(Product product){
    //        return productRepo.save(product);
    //    }
    //addProduct
    @Test
    public void ProductsRepository_addProduct_ReturnSavedProduct(){
        //Arragment
        Product product1 = Product.builder()
                .productName("oranges")
                .productPrice(30.0)
                .barcode("548Gthf")
                .build();
        //act
        Product savedProduct = productRepo.save(product1);
        //assert
        Assertions.assertThat(savedProduct).isNotNull();
    }
    //test get all products
    @Test
    public void ProductsRepository_getAllProducts_ReturnSavedProducts(){
        //Arragment
        Product product1 = Product.builder()
                .productName("oranges")
                .productPrice(30.0)
                .barcode("548Gthf")
                .build();

        Product product2 = Product.builder()
                .productName("juice")
                .productPrice(12.34)
                .barcode("ldem8732")
                .build();

        productRepo.save(product1);
        productRepo.save(product2);
        //act

        List<Product> productList = productRepo.findAll();
        //assert

        Assertions.assertThat(productList).isNotNull();
        Assertions.assertThat(productList.size()).isEqualTo(2);


    }

    //findProductById
    @Test
    public void ProductRepository_FindById_ReturnProduct() {
        //Arragment
        Product product1 = Product.builder()
                .productName("oranges")
                .productPrice(30.0)
                .barcode("548Gthf")
                .build();

        productRepo.save(product1);
        //act
        Product product = productRepo.findById(product1.getProductId()).get();
        Assertions.assertThat(product).isNotNull();
    }

}
