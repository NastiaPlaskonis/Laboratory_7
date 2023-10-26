package ucu.edu.ua.demo.flowers;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter@AllArgsConstructor@NoArgsConstructor

public class Flower extends Item {

    private double price;
    private double sepalLength;
    private FlowerColor color;

    @Override
    public double price() {
        return price;
    }

    public String getColor() {
        return color.toString();
    }
}