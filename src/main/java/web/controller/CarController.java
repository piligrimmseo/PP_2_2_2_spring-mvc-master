package web.controller;

import dao.CarDAOImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImp;

@Controller

public class CarController {

    CarService carService = new CarServiceImp();

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {

        model.addAttribute("cars", carService.filterCarsById(count));
        return "cars";
    }

}
