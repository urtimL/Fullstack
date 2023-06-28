package Homework.Ait.HW28.Car.Dao;

import Homework.Ait.HW28.Car.Model.Car;

public class Garagelmpl implements Garage{
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
        if(model == null || model.equals("")){
            return null;
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if(model.equals(cars[i].getModel())){
                count++;
            }
        }

        if(count == 0){
            return null;
        }

        Car[] res = new Car[count];
        for (int i = 0, j = 0; i < size; i++) {
            if(model.equals(cars[i].getModel())){
                res[j++] = cars[i];
            }
        }

        return res;
    }

    @Override
    public Car[] findCarsByCompany(String comany) {
        if(comany == null || comany.equals("")){
            return null;
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if(comany.equals(cars[i].getCompany())){
                count++;
            }
        }

        if(count == 0){
            return null;
        }

        Car[] res = new Car[count];
        for (int i = 0, j = 0; i < size; i++) {
            if(comany.equals(cars[i].getCompany())){
                res[j++] = cars[i];
            }
        }

        return res;
    }

    @Override
    public Car[] findCarsByEngine(double engine) {
        if(engine == 0){
            return null;
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if(engine == cars[i].getEngine()){
                count++;
            }
        }

        if(count == 0){
            return null;
        }

        Car[] res = new Car[count];
        for (int i = 0, j = 0; i < size; i++) {
            if(engine == cars[i].getEngine()){
                res[j++] = cars[i];
            }
        }

        return res;
    }

    @Override
    public Car[] findCarsByColor(String color) {
        if(color == null || color.equals("")){
            return null;
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if(color.equals(cars[i].getColor())){
                count++;
            }
        }

        if(count == 0){
            return null;
        }

        Car[] res = new Car[count];
        for (int i = 0, j = 0; i < size; i++) {
            if(color.equals(cars[i].getColor())){
                res[j++] = cars[i];
            }
        }

        return res;
    }
}
