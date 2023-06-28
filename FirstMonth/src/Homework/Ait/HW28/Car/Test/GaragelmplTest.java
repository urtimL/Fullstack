package Homework.Ait.HW28.Car.Test;

import Homework.Ait.Employee.Model.Employee;
import Homework.Ait.Employee.Model.SalesManager;
import Homework.Ait.HW28.Car.Dao.Garage;
import Homework.Ait.HW28.Car.Dao.Garagelmpl;
import Homework.Ait.HW28.Car.Model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GaragelmplTest {

    Garage garage;
    Car[] cars;


    @BeforeEach
    void setUp() {
        garage = new Garagelmpl(6);

        cars = new Car[5];
        cars[0] = new Car("888bmw88", "i8", "BMW", 1.5, "black");
        cars[1] = new Car("888bmw77", "i8", "BMW", 1.3, "white");
        cars[2] = new Car("777mb777", "CLA", "Mercedes-Benz", 1.3, "white");
        cars[3] = new Car("111tt111", "TT", "Audi", 2.5, "red");
        cars[4] = new Car("555toy55", "Camry", "Toyota", 2.0, "white");

        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
        }
    }

    @Test
    void addCar() {
        assertFalse(garage.addCar(null));
        assertFalse(garage.addCar(cars[1]));
        Car car = new Car("666shk66", "Superb", "Skoda", 1.8, "yellow");
        assertTrue(garage.addCar(car));
        car = new Car("333shk33", "Octavia", "Skoda", 1.8, "blue");
        assertFalse(garage.addCar(car));
    }

    @Test
    void removeCar() {
        assertEquals(cars[2], garage.removeCar("777mb777"));
        assertNull(garage.removeCar("444toy44"));
    }

    @Test
    void findCarByRegNumber() {
        assertEquals(cars[3], garage.findCarByRegNumber("111tt111"));
        assertNull(garage.findCarByRegNumber("444toy44"));
    }

    @Test
    void findCarsByModel() {
        Car[] actual = garage.findCarsByModel("i8");
        Car[] expected = {cars[0], cars[1]};
        assertArrayEquals(expected, actual);
        assertNull(garage.findCarsByModel("i9"));
    }

    @Test
    void findCarsByCompany() {
        Car[] actual = garage.findCarsByCompany("BMW");
        Car[] expected = {cars[0], cars[1]};
        assertArrayEquals(expected, actual);
        assertNull(garage.findCarsByCompany("WWW"));
    }

    @Test
    void findCarsByEngine() {
        Car[] actual = garage.findCarsByEngine(1.3);
        Car[] expected = {cars[1], cars[2]};
        assertArrayEquals(expected, actual);
        assertNull(garage.findCarsByEngine(1.1));
    }

    @Test
    void findCarsByColor() {
        Car[] actual = garage.findCarsByColor("white");
        Car[] expected = {cars[1], cars[2], cars[4]};
        assertArrayEquals(expected, actual);
        assertNull(garage.findCarsByColor("blue"));
    }
}