package edu.ucam.car_test;

import java.util.ArrayList;
import java.util.Objects;

import org.junit.Test;

import edu.ucam.car.Car;
import edu.ucam.car.Genaral;

public class TestRemove {
	
	@Test
	public void restRemoveCar() {
		System.out.println("Test eliminar coche.");
		ArrayList<Car> carList = new ArrayList<Car>(); 
	
		Car car = new Car("1234 ASD", "BMW", "330i xDrive", "Negro", 250);
	
		carList.add(car);
		
		Car carAux = Genaral.searchCar(carList, car.getLicensePlate());
		if (Objects.isNull(carAux)) {
			System.out.println("No se ha encontrado el coche.");
		} else {
			for (int i = 0; i < carList.size(); i++) {
				if (carList.get(i).getLicensePlate().equals(car.getLicensePlate())) {
					carList.remove(i);
					break;
				}
			}
			System.out.println("Coche eliminado.");
		}
	}

}
