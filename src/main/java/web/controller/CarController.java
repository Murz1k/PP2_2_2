package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller // спец компонент
public class CarController {

    @GetMapping("/cars")  // адрес, который приведет в метод контроллера
    public String printCar(@RequestParam(value = "count", required = false) int count, Model model) {
        CarServiceImpl carService = new CarServiceImpl();
        List<Car> carList = carService.getCars(count);

        model.addAttribute("cars", carList);
        return "cars";

    }

}
