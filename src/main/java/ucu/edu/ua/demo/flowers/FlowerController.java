package ucu.edu.ua.demo.flowers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower")

public class FlowerController {

    @GetMapping("/list")
    public List<Flower> getFlower() {
        return List.of(new Flower(45, 0.8, FlowerColor.RED));
    }
}