package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Servises.ServiceCar;

import java.util.ArrayList;
import java.util.List;
@Controller
public class CarsController {
    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 3, "Black"));
        cars.add(new Car("Audi", 123, "White"));
        cars.add(new Car("Toyota", 6, "Red"));
        cars.add(new Car("VAZ", 3, "Blue"));
        cars.add(new Car("Nisan", 234, "Yellow"));
        cars = ServiceCar.getCar(cars, count);
        model.addAttribute("list", cars);
        return "cars";
    }
}
