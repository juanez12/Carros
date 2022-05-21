package model;

public class Soat extends PropertyCard {
	private String cover;
	
	public Soat(double price, int year, String image, String cover) {
		super(price, year, image);
		this.cover=cover;
	}
	
	public String getCover() {
		return cover;
	}
	
	public String toString() {
		String message="";
		message=super.toString()+ " the cover from damages that the soat cover is: " +cover;
		return message;
	}

}
