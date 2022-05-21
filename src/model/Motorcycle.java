package model;
public class Motorcycle extends Vehicle implements GasConsumible{

    private double gassolineCapacity;
    private double consumeGas;
    private MotorcycleType type;
   
    public Motorcycle(double basePrice, double sellPrice, boolean used, String brand, int model, double cylinderCapacity, double mileage, String licensePlate, double gassolineCapacity, int motoTypeI){
        super(basePrice, sellPrice, used, brand, model, cylinderCapacity, mileage, licensePlate);
        this.gassolineCapacity=gassolineCapacity;
        switch(motoTypeI){
            case 1:
                this.type=MotorcycleType.STANDARD;
            break;
            case 2:
                this.type=MotorcycleType.SPORT;
            break;
            case 3:
                this.type=MotorcycleType.SCOOTER;
            break;
            case 4:
                this.type=MotorcycleType.CROSS;
            break;
        }
        this.consumeGas=consumeGasoline(cylinderCapacity);
    }

    public double consumeGasoline(double cylinder){
        double consume;
        consume=gassolineCapacity*(cylinder/180.0);
        return consume;
    }

    public double getGassolineCapacyty(){
        return gassolineCapacity;
    }

    public void setGassolineCapacity(double gassolineCapacity){
        this.gassolineCapacity=gassolineCapacity;
    }

    public double getConsumeGas(){
        return consumeGas;
    }

    public MotorcycleType getType(){
        return type;
    }
    
    public String toString() {
    	String message="";
    	message=super.toString()+" the vehicle is a motorcycle, it has " +gassolineCapacity+ " galons of gassoline capacity \n the consume of gassoline of the moto is: " +consumeGas+ " galons/km \n the moto is a " +type+ " moto";
    	return message;
    }
}