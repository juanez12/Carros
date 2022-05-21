package model;
public class ElectricCar extends Car implements Electricable{
    
    private double battery;
    private double batteryConsume;
    private ChargerType chargeT;

    public ElectricCar(double basePrice, double sellPrice, boolean used, String brand, int model, double cylinderCapacity, double mileage, String licensePlate, int numDoors, boolean polarized, int carTypeI, double battery, int chargeTi){
        super(basePrice, sellPrice, used, brand, model, cylinderCapacity, mileage, licensePlate, numDoors, polarized, carTypeI);
        this.battery=battery;
        this.batteryConsume=consume(cylinderCapacity);
        switch(carTypeI){
            case 1:
                this.chargeT=ChargerType.NORMAL;
            break;
            case 2:
                this.chargeT=ChargerType.FAST;
            break;
        }
    }

    public double consume(double cylinder){
        double consume=0;
        if(chargeT==ChargerType.NORMAL){
            consume=(battery+18.0)*(cylinder/100.0);
        }
        if(chargeT==ChargerType.FAST){
            consume=(battery+13.0)*(cylinder/100.0);
        }
        return consume;
    }

    public double getBatteryConsume(){
        return batteryConsume;
    }
    
    public String toString() {
    	String message="";
    	message=super.toString()+ " The car works with electricity it has a capacity of " +battery+ " amperes \n  the car has a consume of " +batteryConsume+ " amperes/km and the car has a " +chargeT+ "charger";
    	return message;
    }
}