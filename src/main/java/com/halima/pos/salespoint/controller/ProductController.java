package com.halima.pos.salespoint.controller;


import com.halima.pos.salespoint.dao.ProductDao;
import com.halima.pos.salespoint.model.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin
@RequestMapping(path="/products")
public class ProductController {
    @Autowired
    private ProductDao productDao;
    
    @GetMapping("/get-product-by-id")
    public Product getProductById(@RequestParam Integer productId){
        return productDao.getProductById(productId);
    }
    @GetMapping("/get-product-by-barcode")
    public Product getProductByBarcode(@RequestParam String barcode){
        return productDao.getProductByBarcode(barcode);
    }
    @GetMapping("/get-all-products")
    public List<Product> getAllProducts(){
        return productDao.getAllProducts();
    }

    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product){
        return productDao.addProduct(product);
    }
    @PostMapping("/update-product")
    public Product updateroduct(@RequestBody Product product){
        return productDao.updateProduct(product);
    }
    @GetMapping ("/delete-product")
    public void deleteProduct(@RequestParam Integer productId){
         productDao.deleteProduct(productId);
    }
}
