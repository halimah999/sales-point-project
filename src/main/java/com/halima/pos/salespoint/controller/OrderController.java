package com.halima.pos.salespoint.controller;

import com.halima.pos.salespoint.dao.OrderDao;
import com.halima.pos.salespoint.dao.SaleDao;
import com.halima.pos.salespoint.model.dto.OrderDto;
import com.halima.pos.salespoint.model.entity.Order;
import com.halima.pos.salespoint.model.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(path="/orders")
public class OrderController {
    @Autowired
    private SaleDao saleDao;
    @Autowired
    private OrderDao orderDao;

    @PostMapping("/save-order")
    public Order saveOrder(@RequestBody List<OrderDto> orderDtoList){

        return saleDao.saveSales(orderDtoList);
    }
    @GetMapping("/get-all-orders")
    public List<Order> getAllOrders(){
        return orderDao.getAllOrders();
    }
}
