package edu.miu.cs.cs425.eshop.service;

import edu.miu.cs.cs425.eshop.model.Order;
import edu.miu.cs.cs425.eshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }
    public Order findOrderById(Long orderId){
        return orderRepository.findById(orderId).orElse(null);
    }

}
