package edu.ucam.car_test;

import java.util.ArrayList;

import org.junit.Test;

import edu.ucam.car.Car;

public class TestCount {
	@Test
	public void testCountCar() {
		System.out.println("Test contar coches.");
		ArrayList<Car> carList = new ArrayList<Car>(); 
		
		Car car = new Car("1234 ASD", "BMW", "330i xDrive", "Negro", 250);
		
		carList.add(car);
		
		carList.size();
	}
}
