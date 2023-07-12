package dao;

import Model.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> filterCarsById(int id);


}
