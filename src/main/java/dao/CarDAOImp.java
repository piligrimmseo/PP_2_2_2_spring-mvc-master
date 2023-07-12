package dao;

import Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDAOImp implements CarDAO {


    List<Car> car;


    {
        car = new ArrayList<>();
        car.add(new Car(1, "Audi", "a6"));
        car.add(new Car(2, "BMW", "538"));
        car.add(new Car(3, "Opel", "Vectra"));
        car.add(new Car(4, "VW", "Tiguan"));
        car.add(new Car(5, "Ford", "Mondeo"));
    }


    public List<Car> filterCarsById(int id) {
        return car.stream()
                .filter(c -> c.getId() <= id)
                .collect(Collectors.toList());
    }

}
