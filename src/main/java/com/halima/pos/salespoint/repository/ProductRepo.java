package com.halima.pos.salespoint.repository;

import com.halima.pos.salespoint.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    Optional<Product> findByBarcode(String barcode);
}
