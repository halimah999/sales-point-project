package com.halima.pos.salespoint.repository;

import com.halima.pos.salespoint.model.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface SaleRepo extends JpaRepository<Sale,Integer> {
    List<Sale>findSaleByOrderId(Integer odrderId);
}
