package aplication;

import java.util.Date;
import entidades.Order;
import entities.enums.OrderStatus;




public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
    }

    OrderStatus os01 = OrderStatus.DELIVERED;

    OrderStatus OS02 = OrderStatus.valueOf("DELIVERED");



}
