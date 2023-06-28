package Homework.Ait.HW29.Car.Dao;

import Homework.Ait.HW29.Car.Model.Car;

import java.util.function.Predicate;

public class Garagelmpl implements Garage {
    private Car[] cars;
    private int size;

    public Garagelmpl(int capacity) {
        this.cars = new Car[capacity];
        this.size = 0;
    }

    @Override
    public boolean addCar(Car car) {
        if(car == null){
            return false;
        }

        Car car1 = findCarByRegNumber(car.getRegNumber());

        if(car1 == null && cars.length > size) {
            cars[size++] = car;
            return true;
        }

        return false;
    }

    @Override
    public Car removeCar(String regNumber) {
        Car car = findCarByRegNumber(regNumber);
        boolean needToMove = false;

        if(car != null){
            for (int i = 0; i < size; i++) {
                if(needToMove){
                    cars[i] = cars[i+1];
                }
                if(regNumber.equals(cars[i].getRegNumber())){
                    cars[i] = cars[i+1];
                    needToMove = true;
                    size--;
                }
            }

        }

        return car;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        if(regNumber == null || regNumber.equals("")){
            return null;
        }

        for (int i = 0; i < size; i++) {
            if(regNumber.equals(cars[i].getRegNumber())){
                return cars[i];
            }
        }

        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        return findCarByPredicate(c -> model.equals(c.getModel()));
    }

    @Override
    public Car[] findCarsByCompany(String comany) {
        return findCarByPredicate(c -> comany.equals(c.getCompany()));
    }

    @Override
    public Car[] findCarsByEngine(double engine) {
        return findCarByPredicate(c -> c.getEngine() == engine);
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return findCarByPredicate(c -> color.equals(c.getColor()));
    }

    public Car[] findCarByPredicate(Predicate<Car> predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])) {
                count++;
            }
        }

        if(count == 0){
            return null;
        }

        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (predicate.test(cars[i])) {
                res[j++] = cars[i];
            }
        }

        return res;
    }
}
