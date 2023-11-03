package ucu.edu.ua.demo.flowers;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {
    List<Flower> findAll();
}