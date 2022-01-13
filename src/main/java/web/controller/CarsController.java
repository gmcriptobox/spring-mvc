package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.Arrays;
import java.util.List;


@Controller
public class CarsController {

    @Autowired
    private ApplicationContext applicationContext;


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model){
        if(count > 5){
            count = 5;
        }
        model.addAttribute("carsList", applicationContext.getBean(CarService.class).getCars(count));
        return "cars";
    }



}



