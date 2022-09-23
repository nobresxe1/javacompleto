package entidades;

import entities.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Interger id;
    private Date moment;
    private OrderStatusus status;

    public Order(){
    }

    public Order(int id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Interger getId() {
        return id;
    }

    public void setId(Interger id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusus getStatus() {
        return status;
    }

    public void setStatus(OrderStatusus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
