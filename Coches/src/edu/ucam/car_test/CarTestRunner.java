package edu.ucam.car_test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CarTestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(CarTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("El resultado de TestRunner es: " + result.wasSuccessful());

	}

}
