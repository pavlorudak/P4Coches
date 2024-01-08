package edu.ucam.car_test;

import java.util.ArrayList;

import org.junit.Test;

import edu.ucam.car.Car;
import edu.ucam.car.Genaral;

public class TestSearch {
	
	@Test
	public void testSearchCar() {
		System.out.println("Test encuentra coche.");
		ArrayList<Car> carList = new ArrayList<Car>(); 
		Car car = new Car("1234 ASD", "BMW", "330i xDrive", "Negro", 250);
		carList.add(car);

		Car carAux = Genaral.searchCar(carList, car.getLicensePlate());
	}
}
