package model;
public abstract class Vehicle{

    private double basePrice;
    private double sellPrice;
    private boolean used;
    private String brand;
    private int model;
    private double cylinderCapacity;
    private double mileage;
    private String licensePlate;
    private PropertyCard[] documents; 

    public Vehicle(double basePrice, double sellPrice, boolean used, String brand, int model, double cylinderCapacity, double mileage, String licensePlate){
        this.basePrice=basePrice;
        this.sellPrice=sellPrice;
        this.used=used;
        this.brand=brand;
        this.model=model;
        this.cylinderCapacity=cylinderCapacity;
        this.mileage=mileage;
        this.licensePlate=licensePlate;
        documents=new PropertyCard[3];
    }
    
    public String addDocuments(double priceD, int yearExp, String damageC, double gasEm, int[][]matrixD) {
    	String message="The documents were added correctly";
    	for(int i=0; i<documents.length; i++) {
    		if(documents[i]==null) {
    			if(i==0) {
    				String imageS="";
    				int pos=(matrixD[0].length-1);
    				for(int j=0; j<matrixD.length; j++) {
    					imageS+=matrixD[i][0];
    				}
    				for(int j=1; j<matrixD[0].length; j++) {
    					imageS+=matrixD[pos][j];
    				}
    				documents[i]=new Soat(priceD, yearExp, imageS, damageC);
    			}
    			else if(i==1) {
    				String imageS="";
    				for(int j=0; j<matrixD.length; j++) {
    						imageS+=matrixD[i][i];
    				}
    				documents[i]=new TechMech(priceD, yearExp, imageS, gasEm);
    			}
    			else {
    				if(used) {
    					String imageS="";
    					for(int j=(matrixD.length-1); j>=0; j--) {
    						for(int k=(matrixD[0].length-1); k>=0; k--) {
    							if((j+k)%2==0) {
    								imageS+=matrixD[j][k];
    							}
    						}
    					}
    					documents[i]=new PropertyCard(priceD, yearExp, imageS);
    				}
    			}
    		}
    	}
    	return message;
    }
    
    public double getBasePrice() {
    	return basePrice;
    }
    
    public double getsellPrice() {
    	return sellPrice;
    }
    
    public boolean getUsed() {
    	return used;
    }
    
    public String getBrand() {
    	return brand;
    }
    
    public int getModel() {
    	return model;
    }
    
    public double getcylinderCapacity() {
    	return cylinderCapacity;
    }
    
    public double getMileage() {
    	return mileage;
    }
    
    public String getLicensePlate() {
    	return licensePlate;
    }
    
    public int getYearDocument() {
    	int year=documents[0].getYear();
    	return year;
    }
    
    public String toString() {
    	String message="The vehicle has a sell price of: " + sellPrice+ " the vehicle is used? " +used+ " the license plate of the vehicle is: " +licensePlate+ "\n It has a mileage of: " +mileage+ "the cylinder capacity is: " +cylinderCapacity+ " the model of the vehicle is: " +model+ "\n the vehicle is from the brand " +brand+ "\n" ;
    	return message;
    }
    
    public String infoDocuments() {
    	String message="";
    	for(int i=0; i<documents.length; i++) {
    		if(documents[i]!=null) {
    			message+=documents[i].toString()+ " ";
    		}  		
    	}
    	return message;
    }
}