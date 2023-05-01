package com.halima.pos.salespoint.controller;


import com.halima.pos.salespoint.dao.SaleDao;
import com.halima.pos.salespoint.model.entity.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(path="/sales")
public class SaleController {
    @Autowired
    private SaleDao saleDao;
    @GetMapping("/get-all-sales")
    public List<Sale> getAllSales(){
        return saleDao.getAllSales();
    }
    @GetMapping("/get-sales-by-order-id")
    public List<Sale> getSalesByOrderId(@RequestParam Integer orderId){
        return saleDao.getSaleByOrderId(orderId);
    }
}
