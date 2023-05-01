package com.halima.pos.salespoint.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;


@Builder
@AllArgsConstructor
@Data
@Table(name="products2")
@Entity
@NoArgsConstructor

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Integer productId;
    @Column(name="product_name")
    private String productName;
    @Column(name="product_price")
    private Double productPrice;
    @Column(name="barcode")
    private String barcode;


//    @OneToMany(mappedBy = "product")
//    private List<Sale> sale;

    @JsonBackReference
    @OneToMany(mappedBy = "product")
    private List<Sale> sales;
}
