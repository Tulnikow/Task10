package web.Servises;

import web.Model.Car;

import java.util.List;

public class ServiceCar {
    public static List<Car> getCar(List<Car> car, int count) {
        count = count > 5 ? 5 : count;
        return car.subList(0, count);
    }
}
