package com.halima.pos.salespoint.repository;

import com.halima.pos.salespoint.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Integer> {
}
