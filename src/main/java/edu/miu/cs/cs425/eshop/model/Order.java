package edu.miu.cs.cs425.eshop.model;

//import javax.persistence.*;
import java.time.LocalDate;

//@Entity
//@Table(name = "orders")
public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private LocalDate moment;
    private OrderStatus oderStatus;
}
