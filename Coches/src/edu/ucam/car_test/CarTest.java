package edu.ucam.car_test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import edu.ucam.car.Car;
import edu.ucam.car.Genaral;

public class CarTest {
	
	@BeforeClass
	public static void anotacionBeforeClass() {
		System.out.println("Anotacion BeforeClass. Realizaremos diferentes test con JUnit.");
	}

	@Before
	public void anotacionBefore() {
		System.out.println("Anotacion Before. Empieza el test.");
	}

	@After
	public void anotacionAfter() {
		System.out.println("Anotacion After. Fin del test.");
	}

	@AfterClass
	public static void anotacionAfterClass() {
		System.out.println("Anotacion AfterClass. Test acabado.");
	}

	@Ignore
	void anotacionIgnore() {
		System.out.println(
				"Anotacion Ignore. Si est� viendo este mensaje, la anotacion es Test, sino la anotacion es Ignore");
	}


	// 4 NO EXITOSOS
	@Test
	public void carIqualsTest() {
		System.out.println("Test assertEquals.");

		Car car0 = new Car("1234 ASD", "BMW", "330i xDrive", "Negro", 250);
		Car car1 = new Car("5678 FGH", "Smart", "EQ fortwo ", "Gris", 122);

		assertEquals(car0, car1);

	}

	@Test
	public void carAssertFalseTest() {
		System.out.println("Test assertFalse.");
		ArrayList<Car> listadoCoches = new ArrayList<Car>();

		Car car0 = new Car("1234 ASD", "BMW", "330i xDrive", "Negro", 250);
		Car car1 = new Car("5678 FGH", "Smart", "EQ fortwo ", "Gris", 122);

		listadoCoches.add(car0);
		listadoCoches.add(car1);

		boolean existe = false;
		if (Genaral.searchCar(listadoCoches, "1234 ASD") != null) {
			existe = true;
		} else {
			existe = false;
		}

		assertFalse(existe);

	}

	@Test
	public void carSameTest() {
		System.out.println("Test assertSame.");

		Car car0 = new Car("1234 ASD", "BMW", "330i xDrive", "Negro", 250);
		Car car1 = new Car("5678 FGH", "Smart", "EQ fortwo ", "Gris", 122);

		assertSame(car0, car1);

	}

	@Test
	public void carArrayEqualsTest() {
		System.out.println("Test assertArrayEquals.");

		Car car0 = new Car("1234 ASD", "BMW", "330i xDrive", "Negro", 250);
		Car car1 = new Car("5678 FGH", "Smart", "EQ fortwo ", "Gris", 122);

		Car cars0[] = new Car[3];
		Car cars1[] = new Car[3];

		cars0[0] = car0;
		cars1[0] = car1;

		assertArrayEquals(cars0, cars1);
	}

	// 4 EXITOSAS
	@Test
	public void carTrueTest() {
		System.out.println("Test assertTrue.");
		ArrayList<Car> carList = new ArrayList<Car>();

		Car car0 = new Car("1234 ASD", "BMW", "330i xDrive", "Negro", 250);
		Car car1 = new Car("5678 FGH", "Smart", "EQ fortwo ", "Gris", 122);

		carList.add(car0);
		carList.add(car1);

		boolean existe = false;
		if (Genaral.searchCar(carList, "1234 ASD") != null) {
			existe = true;
		} else {
			existe = false;
		}

		assertTrue(existe);

	}

	@Test
	public void carNotNullTest() {
		System.out.println("Test assertNotNull.");
		ArrayList<Car> carList = new ArrayList<Car>();

		Car car0 = new Car("1234 ASD", "BMW", "330i xDrive", "Negro", 250);
		Car car1 = new Car("5678 FGH", "Smart", "EQ fortwo ", "Gris", 122);

		carList.add(car0);
		carList.add(car1);

		assertNotNull(Genaral.searchCar(carList, "1234 ASD"));
	}

	@Test
	public void carNullTest() {
		System.out.println("Test assertNull.");
		ArrayList<Car> carList = new ArrayList<Car>();

		Car car0 = new Car("1234 ASD", "BMW", "330i xDrive", "Negro", 250);
		Car car1 = new Car("5678 FGH", "Smart", "EQ fortwo ", "Gris", 122);

		carList.add(car0);
		carList.add(car1);

		assertNull(Genaral.searchCar(carList, "1234 AS"));

	}

	@Test
	public void carNotSameTest() {
		System.out.println("Test assertNotSame.");

		Car car0 = new Car("1234 ASD", "BMW", "330i xDrive", "Negro", 250);
		Car car1 = new Car("5678 FGH", "Smart", "EQ fortwo ", "Gris", 122);

		assertNotSame(car0, car1);
	}
}
