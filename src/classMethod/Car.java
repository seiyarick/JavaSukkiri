package classMethod;

public class Car {
	private double fuelCost;
	private double fuelAmount;
	
	public Car(double c, double a) {
		this.fuelCost = c;
		this.fuelAmount = a;
	}
	
	public void move(int km) {
		System.out.println(km + "km走ります");
		this.fuelAmount -= (km / fuelCost); 
	}
	
	public double getFuelAmount() {
		return this.fuelAmount;
		
	}

}
