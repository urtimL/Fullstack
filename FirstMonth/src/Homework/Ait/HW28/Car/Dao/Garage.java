package Homework.Ait.HW28.Car.Dao;

import Homework.Ait.HW28.Car.Model.Car;

public interface Garage {
    boolean addCar(Car car);
    Car removeCar(String regNumber);
    Car findCarByRegNumber(String regNumber);
    Car[] findCarsByModel(String model);
    Car[] findCarsByCompany(String comany);
    Car[] findCarsByEngine(double engine);
    Car[] findCarsByColor(String color);

}
