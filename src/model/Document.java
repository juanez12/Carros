package model;

public class Document {
	private double price;
	private int year;
	private String image;
	
	public Document(double price, int year, String image) {
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
}
