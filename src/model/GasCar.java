package model;
public class GasCar extends Car implements GasConsumible{
    private double gassolineCapacity;
    private double consumeGas;
    private GasType gasoline;

    public GasCar(double basePrice, double sellPrice, boolean used, String brand, int model, double cylinderCapacity, double mileage, String licensePlate, int numDoors, boolean polarized, int carTypeI, double gassolineCapacity, int gasTypeI){
        super(basePrice, sellPrice, used, brand, model, cylinderCapacity, mileage, licensePlate, numDoors, polarized, carTypeI);
        this.gassolineCapacity=gassolineCapacity;
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
        this.consumeGas=consumeGasoline(cylinderCapacity);
    }

    public double consumeGasoline(double cylinder){
        double consume=gassolineCapacity*(cylinder/150.0);
        return consume;
    }

    public double getGassolineCapacity(){
        return gassolineCapacity;
    }

    public double getConsumeGas(){
        return consumeGas;
    }

    public GasType getGasoline(){
        return gasoline;
    }
    
    public String toString() {
    	String message="";
    	message=super.toString()+ " The car works with gassoline it has a capacity of " +gassolineCapacity+ " galons \n the car has a consume of " +consumeGas+ " galons/km and the cars needs " +gasoline+ "gasoline"; 
    	return message;
    }
}