package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl {

    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", 11, "Silver"));
        cars.add(new Car("Honda", 6, "Red"));
        cars.add(new Car("Lexus", 555, "Black"));
        cars.add(new Car("Ford", 1, "Gold"));
        cars.add(new Car("BMW", 88, "White"));

    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());

    }
}