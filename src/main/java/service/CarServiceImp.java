package service;

import Model.Car;
import dao.CarDAO;
import dao.CarDAOImp;

import java.util.List;

public class CarServiceImp implements CarService {

    CarDAO carDAO = new CarDAOImp();

    @Override
    public List<Car> filterCarsById(int id) {
        return carDAO.filterCarsById(id);
    }
}
