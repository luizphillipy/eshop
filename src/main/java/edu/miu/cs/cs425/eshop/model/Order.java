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
    private Integer orderStatus;
    @ManyToOne()
    @JoinColumn(name = "clientId")
    private User client;


    public Order() {
    }

    public Order(Long orderId, Instant moment,OrderStatus orderStatus, User client) {
        this.orderId = orderId;
        this.moment = moment;
        this.client = client;
        setOrderStatus(orderStatus);
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

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if(orderStatus!=null) {
            this.orderStatus = orderStatus.getCode();
        }

    }

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
