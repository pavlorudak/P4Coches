package edu.ucam.car;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Genaral {
	
	static Scanner textIn = new Scanner(System.in); 
	
	static ArrayList<Car> carList = new ArrayList<Car>();

	public static void main(String[] args) {
		
		Car car0 = new Car("1234 ASD", "BMW", "330i xDrive", "Negro", 250);
		Car car1 = new Car("5678 FGH", "Mini", "Clubman ", "Gris", 122);
		Car car2 = new Car("9876 QWE", "Audi", "Q5", "Blanco ", 180);
		
		carList.add(car0);
		carList.add(car1);
		carList.add(car2);
		
		
		Integer opcion = 0;
		do {
			System.out.println("** MENU COCHES **");
			System.out.println(" 1 - Listar coches.");
			System.out.println(" 2 - Agregar coche.");
			System.out.println(" 3 - Eliminar coche.");
			System.out.println(" 4 - SALIR.");
			opcion = textIn.nextInt();
			textIn.nextLine();

			switch (opcion) {
			case 1:
				
				System.out.println("El listado de coches es:");
				for (Car car : carList) {
					System.out.println(" - " + car.toString());
				}
				break;
			case 2:
				
				addCar();
				break;
			case 3:
				
				removeCar();
				break;
			case 4:
				break;
			default:
				System.out.println("Opcion no v�lida.");
				break;
			}
		} while (opcion != 4);
		
		
		System.out.println("Fin del programa.");
		System.exit(0);
	}
		
	public static void addCar() {
		boolean comtrol = false;
		String licensePlate = null;
		do {
			System.out.println("Introduce la matr�cula:");
			licensePlate = textIn.nextLine();
			Car car = searchCar(carList, licensePlate);
			if (!Objects.isNull(car)) {
				System.out.println("Ya existe un coche con esa matr�cula.");
				comtrol = true;
			}
		} while (comtrol);

		System.out.println("Introduce la marca:");
		String brand = textIn.nextLine();

		System.out.println("Introduce el modelo:");
		String model = textIn.nextLine();

		System.out.println("Introduce el color:");
		String color = textIn.nextLine();

		System.out.println("Introduce la potencia:");
		Integer power = textIn.nextInt();

		Car newCar = new Car();
		newCar.setLicensePlate(licensePlate);
		newCar.setBrand(brand);
		newCar.setModel(model);
		newCar.setColor(color);
		newCar.setPower(power);

		carList.add(newCar);
	}



	public static Car searchCar(ArrayList<Car> carList, String licensePlate) {
		for (Car car : carList) {
			if (car.getLicensePlate().equals(licensePlate)){
				return car;
			}
		}
		return null;
	}

	

	public static void removeCar() {
		System.out.println("Buscador de coches - Introduce la matrícula:");
		String licensePlate = textIn.nextLine();
		Car car = searchCar(carList, licensePlate);
		if (Objects.isNull(car)) {
			System.out.println("No se ha encontrado el coche.");
		} else {
			for (int i = 0; i < carList.size(); i++) {
				if (carList.get(i).getLicensePlate().equals(licensePlate)) {
					carList.remove(i);
					break;
				}
			}
			System.out.println("Coche eliminado.");
		}	
		
	}
	

}
