package edu.miu.cs.cs425.eshop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;


@Entity
@Table(name = "orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Instant moment;
   // private OrderStatus oderStatus;
    @ManyToOne()
    @JoinColumn(name = "clientId")
    private User client;


    public Order() {
    }

    public Order(Long orderId, Instant moment, User client) {
        this.orderId = orderId;
        this.moment = moment;
        this.client = client;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

//    public OrderStatus getOderStatus() {
//        return oderStatus;
//    }
//
//    public void setOderStatus(OrderStatus oderStatus) {
//        this.oderStatus = oderStatus;
//    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId) && Objects.equals(moment, order.moment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, moment);
    }
}
