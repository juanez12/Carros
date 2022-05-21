package model;

public class PropertyCard {
	private double price;
	private int year;
	private String image;
	
	public PropertyCard(double price, int year, String image) {
		this.price=price;
		this.year=year;
		this.image=image;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getImage() {
		return image;
	}
	
	public String toString() {
		String message="The document has a price of: " +price+ " expires on the year: " +year+ " the image of the document is: "+image;
		return message;
	}
}