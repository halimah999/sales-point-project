package com.halima.pos.salespoint.dao;


import com.halima.pos.salespoint.model.entity.Product;
import com.halima.pos.salespoint.repository.ProductRepo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductDaoTest {

    @Mock
    private ProductRepo productRepo;

    @InjectMocks
    private ProductDao productDao;

    @Test
    public void PokemonService_CreatePokemon_ReturnsPokemonDto() {

        //Arragment
        Product product1 = Product.builder()
                .productName("oranges")
                .productPrice(30.0)
                .barcode("548Gthf")
                .build();

        //mock
        when(productRepo.save(Mockito.any(Product.class))).thenReturn(product1);
        //act
        Product savedProduct = productDao.addProduct(product1);
        //Assert
        Assertions.assertThat(savedProduct).isNotNull();}
}



