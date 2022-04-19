package edu.miu.cs.cs425.eshop.resources;

import edu.miu.cs.cs425.eshop.model.Order;
import edu.miu.cs.cs425.eshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/orders"})
public class OrderResource {
    @Autowired
    private OrderService orderService;

    @GetMapping(value = {"/list"})
    public ResponseEntity<List<Order>> findAll(){
        List<Order> list = orderService.findAllOrders();

        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{orderId}")
    public ResponseEntity<Order> findOrderById(@PathVariable Long orderId){
        return ResponseEntity.ok().body(orderService.findOrderById(orderId));
    }
}

