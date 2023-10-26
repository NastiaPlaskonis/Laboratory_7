package ucu.edu.ua.demo.delivery;
import ucu.edu.ua.demo.flowers.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {

    @Override
    public List<Item> deliver(List<Item> items) {
        System.out.println("Item has been delivered by post");
        return items;
    }
}