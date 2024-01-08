package edu.ucam.car_test;

import java.util.ArrayList;

import org.junit.Test;

import edu.ucam.car.Car;

public class TestAdd {
	
	@Test
	public void testAddCar() {
		System.out.println("Test crear coche.");
		ArrayList<Car> carList = new ArrayList<Car>(); 
		Car car = new Car("1234 ASD", "BMW", "330i xDrive", "Negro", 250);
		carList.add(car);
	}

}
