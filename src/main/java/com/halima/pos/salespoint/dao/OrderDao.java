package com.halima.pos.salespoint.dao;

import com.halima.pos.salespoint.model.dto.OrderDto;
import com.halima.pos.salespoint.model.entity.Order;
import com.halima.pos.salespoint.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class OrderDao {

    @Autowired
    private OrderRepo orderRepo;

    public Order saveOrder( List<OrderDto> orderDtoList){

        Double total = 0.0;
        for(OrderDto orderDto :orderDtoList){
            total+=orderDto.getProductPrice();
        }

        Order order = new Order();
        order.setTotal(total);
       return  orderRepo.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }

}
