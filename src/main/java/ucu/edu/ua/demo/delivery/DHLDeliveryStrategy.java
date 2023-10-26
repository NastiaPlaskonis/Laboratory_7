package ucu.edu.ua.demo.delivery;
import ucu.edu.ua.demo.flowers.Item;

import java.util.List;


public class DHLDeliveryStrategy implements Delivery {
    @Override
    public List<Item> deliver(List<Item> items) {
        System.out.println("item has been delivered by DHL");
        return items;
    }
}