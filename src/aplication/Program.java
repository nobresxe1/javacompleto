package aplication;

import entidades.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1010,new Date, OrderStatus.PENDING_PAYMENT);
    }

}
