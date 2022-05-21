package model;
public class HybridCar extends Car implements Electricable, GasConsumible{

    private double gassolineCapacity;
    private double consumeGas;
    private GasType gasoline;
    private double battery;
    private double batteryConsume;
    private ChargerType chargeT;

    public HybridCar(double basePrice, double sellPrice, boolean used, String brand, int model, double cylinderCapacity, double mileage, String licensePlate, int numDoors, boolean polarized, int carTypeI, double gassolineCapacity, int gasTypeI, double battery, int chargeTi){
        super(basePrice, sellPrice, used, brand, model, cylinderCapacity, mileage, licensePlate, numDoors, polarized, carTypeI);
        this.gassolineCapacity=gassolineCapacity;
        this.battery=battery;
        this.consumeGas=consumeGasoline(cylinderCapacity);
        this.batteryConsume=consume(cylinderCapacity);
        
        switch(gasTypeI){
            case 1: 
                this.gasoline=GasType.NORMAL;
            break;
            
            case 2:
                this.gasoline=GasType.EXTRA;
            break;

            case 3:
                this.gasoline=GasType.DIESEL;
            break;
        }

        switch(carTypeI){
            case 1:
                this.chargeT=ChargerType.NORMAL;
            break;
            case 2:
                this.chargeT=ChargerType.FAST;
            break;
        }
    }
    
    public double consumeGasoline(double cylinder){
        double consume=gassolineCapacity*(cylinder/180.0);
        return consume;
    }

    public double consume(double cylinder){
        double consume=0;
        if(chargeT==ChargerType.NORMAL){
            consume=battery*(cylinder/100.0);
        }
        if(chargeT==ChargerType.FAST){
            consume=(battery+7.0)*(cylinder/100.0);
        }
        return consume;
    }
    
    public double getConsumeGas(){
        return consumeGas;
    }

    public double getBatteryConsume(){
        return batteryConsume;
    }

    public GasType getGasoline(){
        return gasoline;
    }

	public double getGassolineCapacity() {
		return gassolineCapacity;
	}

	public void setGassolineCapacity(double gassolineCapacity) {
		this.gassolineCapacity = gassolineCapacity;
	}
	
	public String toString() {
		String message="";
		message=super.toString()+ " The car it's a hybrid one, its battery has a capacity of " +battery+ " amperes \n the capacity of the fuel tank is " +gassolineCapacity+ " galons and has a consume of fuel of " +consumeGas+ " galons/km \n  the car has a consume of the battery of " +batteryConsume+ " amperes/km and the car has a " +chargeT+ "charger";
    	return message;
	}
}