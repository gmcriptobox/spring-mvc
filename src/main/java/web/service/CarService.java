package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars;

    CarService(){
        cars = Arrays.asList(
                new Car("1EKX11777","bmw", 200),
                new Car("2EKX22777","audi", 220),
                new Car("3EKX33777","toyota", 180),
                new Car("4EKX44777","honda", 130),
                new Car("5EKX55777","kia", 150));

    }

    public Car[] getCars(int cn){
        return cars.subList(0,cn).toArray(new Car[0]);
    }
}
