package com.halima.pos.salespoint.dao;


import com.halima.pos.salespoint.model.entity.Product;
import com.halima.pos.salespoint.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDao {
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts(){

        return productRepo.findAll();
    }



    public Product getProductById(Integer productId){
         Optional<Product> productOptional = productRepo.findById(productId);
         return productOptional.isPresent()?productOptional.get():null;

    }

    public Product getProductByBarcode(String barcode){
        Optional<Product> productOptional = this.productRepo.findByBarcode(barcode);
        return productOptional.isPresent()?productOptional.get():null;

    }

    public Product addProduct(Product product){
        return productRepo.save(product);
    }
    public Product updateProduct(Product product){

             return productRepo.save(product);}

    public void deleteProduct(Integer productId){
        if(getProductById(productId)!=null){
            productRepo.deleteById(productId);
        }}

}
