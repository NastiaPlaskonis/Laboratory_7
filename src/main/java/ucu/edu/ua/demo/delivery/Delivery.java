package ucu.edu.ua.demo.delivery;

import java.util.List;

import ucu.edu.ua.demo.flowers.Item;

public interface Delivery {
    List<Item> deliver(List<Item> items);
}
