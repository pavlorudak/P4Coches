package edu.ucam.car_test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class PartitionRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestAdd.class, TestRemove.class, TestSearch.class, TestCount.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("El resultado de TestPartitionRunner es: " + result.wasSuccessful());

	}

}
