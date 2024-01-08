package edu.ucam.car;

public class Car {

	private String licensePlate;
	private String brand;
	private String model;
	private String color;
	private Integer power;
	
	
	
	public Car() {
		super();
	}

	
	public Car(String licensePlate) {
		super();
		this.licensePlate = licensePlate;
	}


	public Car(String licensePlate, String brand, String model, String color, Integer power) {
		super();
		this.licensePlate = licensePlate;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.power = power;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}


	@Override
	public String toString() {
		return "Car [licensePlate=" + licensePlate + ", brand=" + brand + ", model=" + model + ", color=" + color
				+ ", power=" + power + "]";
	}
	
	

	

	
	

}
