package com.halima.pos.salespoint.dao;

import com.halima.pos.salespoint.model.dto.OrderDto;
import com.halima.pos.salespoint.model.entity.Order;
import com.halima.pos.salespoint.model.entity.Product;
import com.halima.pos.salespoint.model.entity.Sale;
import com.halima.pos.salespoint.repository.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleDao {
    @Autowired
    private SaleRepo saleRepo;

    private OrderDao orderDao;

    public SaleDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public Order saveSales(List<OrderDto> orderDtoList)
    { Order order = this.orderDao.saveOrder(orderDtoList);
        if(orderDtoList.size()==0){
            return null;
        }
        orderDtoList.forEach(o->{
            Sale sale = new Sale();
            sale.setOrderId(order.getOrderId());
            sale.setProductId(o.getProductId());
            this.saleRepo.save(sale);
        });

        return order;


    }

    public List<Sale> getAllSales(){
        return saleRepo.findAll();
    }
    public List<Sale> getSaleByOrderId(Integer orderId){
        return saleRepo.findSaleByOrderId(orderId);
    }



}
