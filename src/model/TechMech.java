package model;

public class TechMech extends PropertyCard{
	private double gasEmitted;
	public TechMech(double price, int year, String image, double gasEmitted) {
		super(price, year, image);
		this.gasEmitted=gasEmitted;
	}
	
	public double getGasEmitted() {
		return gasEmitted;
	}
	
	public String toString() {
		String message="";
		message=super.toString()+"The amount of gas that the vehicle emitted was: " +gasEmitted;
		return message;
	}

}
