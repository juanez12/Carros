package model;
public class Car extends Vehicle{

    private int numDoors;
    private boolean polarized;
    private CarType type;

    public Car(double basePrice, double sellPrice, boolean used, String brand, int model, double cylinderCapacity, double mileage, String licensePlate, int numDoors, boolean polarized, int carTypeI){
        super(basePrice, sellPrice, used, brand, model, cylinderCapacity, mileage, licensePlate);
        this.numDoors=numDoors;
        this.polarized=polarized;
        switch(carTypeI){
            case 1:
                this.type=CarType.SEDAN;
            break;

            case 2:
                this.type=CarType.PICKUP_TRUCK;
            break;
        }
    }

    public int getNumDoors(){
        return numDoors;
    }

    public boolean getPolarized(){
        return polarized;
    }

    public CarType getType(){
        return type;
    }
    
    public String toString() {
    	String message="";
    	message=super.toString()+" the vehicle is a car, it has " +numDoors+ "\n the car is polarized?" +polarized+ "\n the car is a " +type;
    	return message;
    }
}