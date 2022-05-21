package model;
import java.util.ArrayList;
import java.time.LocalDate;
public class Company{
    private String name;
    private ArrayList <Vehicle> vehicles;
    private Vehicle[][] parking; 

    public Company(String name){
        this.name=name;
        vehicles=new ArrayList <Vehicle>();
        parking=new Vehicle[10][5];
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    
    public boolean searchVehicle(String licenseP) {
    	boolean found=false;
    	for(int i=0; i<vehicles.size() && !found; i++) {
    		Vehicle obj=vehicles.get(i);
    		if(obj.getLicensePlate().equals(licenseP)) {
    			found=true;
    		}
    	}
    	return found;
    }
    
    public String addVehicle(double baseP, double sellP, String usedAnswer, String brand, int model, double cylinderC, double mileage, String licenseP, double priceD, int yearE, String damageC, double gasE, int[][]mD,  double gasM, int motoT) {
    	String message="The moto was added was succesfully";
    	boolean used=false;
    	if(usedAnswer.equalsIgnoreCase("yes")) {
    		used=true;
    	}
    	else {
    		used=false;
    	}
    	if(!searchVehicle(licenseP)) {
    		vehicles.add(new Motorcycle(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, gasM, motoT));
    	}
    	else {
    		message="Already exists a vehicle with the license plate: " +licenseP;
    	}
    	boolean contine=true;
		for(int i=0; i<vehicles.size() && contine; i++) {
			if(searchVehicle(licenseP)) {
				message+=vehicles.get(i).addDocuments(priceD, yearE, damageC, gasE, mD);
				contine=false;
			}
		}
    	return message;
    }
    
    public String addVehicle(int indexC, double baseP, double sellP, String usedAnswer, String brand, int model, double cylinderC, double mileage, String licenseP, double priceD, int yearE, String damageC, double gasE, int[][]mD, int numDoors, String polarized, int carT, double capacity, int combustibleType) {
    	String message="";
    	boolean used=false;
    	boolean pol=false;
    	if(usedAnswer.equalsIgnoreCase("yes")) {
    		used=true;
    	}
    	else {
    		used=false;
    	}
    	if(polarized.equalsIgnoreCase("yes")) {
    		pol=true;
    	}
    	else {
    		pol=false;
    	}
    	switch(indexC) {
    		case 1:
    			if(!searchVehicle(licenseP)) {
    				vehicles.add(new GasCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, capacity, combustibleType));
    				message="The car was addded succesfully";
    				boolean contine=true;
    				for(int i=0; i<vehicles.size() && contine; i++) {
    					if(searchVehicle(licenseP)) {
    						message+=vehicles.get(i).addDocuments(priceD, yearE, damageC, gasE, mD);
    						contine=false;
    					}
    				}
    				boolean stop=false;
    				if(model==2014) {
    					for(int i=0; i<parking.length && !stop; i++) {
    						if(parking[i][0]==null) {
    							parking[i][0]=new GasCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, capacity, combustibleType);
        						stop=false;
        						message+="The car was added to the parking";
    						}
    					}
    					if(!stop) {
    						message+="There's no more space on the parking, it must be increased";
    					}
    				}
    				if(model==2013) {
    					for(int i=0; i<parking.length && !stop; i++) {
    						if(parking[i][1]==null) {
    							parking[i][1]=new GasCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, capacity, combustibleType);
        						stop=false;
        						message+="The car was added to the parking";
    						}
    					}
    					if(!stop) {
    						message+="There's no more space on the parking, it must be increased";
    					}
    				}
    				if(model==2012) {
    					for(int i=0; i<parking.length && !stop; i++) {
    						if(parking[i][2]==null) {
    							parking[i][2]=new GasCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, capacity, combustibleType);
        						stop=false;
        						message+="The car was added to the parking";
    						}
    					}
    					if(!stop) {
    						message+="There's no more space on the parking, it must be increased";
    					}
    				}
    				if(model==2011) {
    					for(int i=0; i<parking.length && !stop; i++) {
    						if(parking[i][3]==null) {
    							parking[i][3]=new GasCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, capacity, combustibleType);
        						stop=false;
        						message+="The car was added to the parking";
    						}
    					}
    					if(!stop) {
    						message+="There's no more space on the parking, it must be increased";
    					}
    				}
    				if(model<2011) {
    					for(int i=0; i<parking.length && !stop; i++) {
    						if(parking[i][4]==null) {
    							parking[i][4]=new GasCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, capacity, combustibleType);
        						stop=false;
        						message+="The car was added to the parking";
    						}
    					}
    					if(!stop) {
    						message+="There's no more space on the parking, it must be increased";
    					}
    				}
    			}
    			else {
    				message="Already exists a vehicle with the licenesePlate: " +licenseP;
    			}
    		break;
    		case 2:
    			if(!searchVehicle(licenseP)) {
    				vehicles.add(new ElectricCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, capacity, combustibleType));
    				message="The car was addded succesfully";
    				boolean contine=true;
    				for(int i=0; i<vehicles.size() && contine; i++) {
    					if(searchVehicle(licenseP)) {
    						message+=vehicles.get(i).addDocuments(priceD, yearE, damageC, gasE, mD);
    						contine=false;
    					}
    				}
    				boolean stop=false;
    				if(model==2014) {
    					for(int i=0; i<parking.length && !stop; i++) {
    						if(parking[i][0]==null) {
    							parking[i][0]=new ElectricCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, capacity, combustibleType);
        						stop=false;
        						message+="The car was added to the parking";
    						}
    					}
    					if(!stop) {
    						message+="There's no more space on the parking, it must be increased";
    					}
    				}
    				if(model==2013) {
    					for(int i=0; i<parking.length && !stop; i++) {
    						if(parking[i][1]==null) {
    							parking[i][1]=new ElectricCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, capacity, combustibleType);
        						stop=false;
        						message+="The car was added to the parking";
    						}
    					}
    					if(!stop) {
    						message+="There's no more space on the parking, it must be increased";
    					}
    				}
    				if(model==2012) {
    					for(int i=0; i<parking.length && !stop; i++) {
    						if(parking[i][2]==null) {
    							parking[i][2]=new ElectricCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, capacity, combustibleType);
        						stop=false;
        						message+="The car was added to the parking";
    						}
    					}
    					if(!stop) {
    						message+="There's no more space on the parking, it must be increased";
    					}
    				}
    				if(model==2011) {
    					for(int i=0; i<parking.length && !stop; i++) {
    						if(parking[i][3]==null) {
    							parking[i][3]=new ElectricCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, capacity, combustibleType);
        						stop=false;
        						message+="The car was added to the parking";
    						}
    					}
    					if(!stop) {
    						message+="There's no more space on the parking, it must be increased";
    					}
    				}
    				if(model<2011) {
    					for(int i=0; i<parking.length && !stop; i++) {
    						if(parking[i][4]==null) {
    							parking[i][4]=new ElectricCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, capacity, combustibleType);
        						stop=false;
        						message+="The car was added to the parking";
    						}
    					}
    					if(!stop) {
    						message+="There's no more space on the parking, it must be increased";
    					}
    				}
    			}
    			else {
    				message="Already exists a vehicle with the licenesePlate: " +licenseP;
    			}
    		break;		
    	}
    	return message;
    }
    	
    public String addVehicle(double baseP, double sellP, String usedAnswer, String brand, int model, double cylinderC, double mileage, String licenseP, double priceD, int yearE, String damageC, double gasE, int[][]mD, int numDoors, String polarized, int carT, double gassoline, int gasT, double battery, int chargerT) {
    	String message="";
    	boolean used=false;
    	boolean pol=false;
    	if(usedAnswer.equalsIgnoreCase("yes")) {
    		used=true;
    	}
    	else {
    		used=false;
    	}
    	if(polarized.equalsIgnoreCase("yes")) {
    		pol=true;
    	}
    	else {
    		pol=false;
    	}
    	if(!searchVehicle(licenseP)) {
    		vehicles.add(new HybridCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, gassoline, gasT, battery, chargerT));
    		message="The car was addded succesfully";
    		boolean contine=true;
			for(int i=0; i<vehicles.size() && contine; i++) {
				if(searchVehicle(licenseP)) {
					message+=vehicles.get(i).addDocuments(priceD, yearE, damageC, gasE, mD);
					contine=false;
				}
			}
    		boolean stop=false;
			if(model==2014) {
				for(int i=0; i<parking.length && !stop; i++) {
					if(parking[i][0]==null) {
						parking[i][0]=new HybridCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, gassoline, gasT, battery, chargerT);
						stop=false;
						message+="The car was added to the parking";
					}
				}
				if(!stop) {
					message+="There's no more space on the parking, it must be increased";
				}
			}
			if(model==2013) {
				for(int i=0; i<parking.length && !stop; i++) {
					if(parking[i][1]==null) {
						parking[i][1]=new HybridCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, gassoline, gasT, battery, chargerT);
						stop=false;
						message+="The car was added to the parking";
					}
				}
				if(!stop) {
					message+="There's no more space on the parking, it must be increased";
				}
			}
			if(model==2012) {
				for(int i=0; i<parking.length && !stop; i++) {
					if(parking[i][2]==null) {
						parking[i][2]=new HybridCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, gassoline, gasT, battery, chargerT);
						stop=false;
						message+="The car was added to the parking";
					}
				}
				if(!stop) {
					message+="There's no more space on the parking, it must be increased";
				}
			}
			if(model==2011) {
				for(int i=0; i<parking.length && !stop; i++) {
					if(parking[i][3]==null) {
						parking[i][3]=new HybridCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, gassoline, gasT, battery, chargerT);
						stop=false;
						message+="The car was added to the parking";
					}
				}
				if(!stop) {
					message+="There's no more space on the parking, it must be increased";
				}
			}
			if(model<2011) {
				for(int i=0; i<parking.length && !stop; i++) {
					if(parking[i][4]==null) {
						parking[i][4]=new HybridCar(baseP, sellP, used, brand, model, cylinderC, mileage, licenseP, numDoors, pol, carT, gassoline, gasT, battery, chargerT);
						stop=false;
						message+="The car was added to the parking";
					}
				}
				if(!stop) {
					message+="There's no more space on the parking, it must be increased";
				}
			}
    	}
    	else {
    		message="Already exists a vehicle with the licenesePlate: " +licenseP;
    	}
    	return message;
    }
    	
    public String calculatePrice(String licenseP) {
    	String message="The total sell price of the vehicle with the license " +licenseP+ " is: ";
    	double totalPrice=0;
    	LocalDate actualDate=LocalDate.now();
    	int actualYear=actualDate.getYear();
    	boolean stop=false;
    	for(int i=0; i<vehicles.size() && !stop; i++) {
    		if(vehicles.get(i) instanceof Motorcycle && vehicles.get(i).getLicensePlate().equals(licenseP)) {
    			Motorcycle obj=(Motorcycle)vehicles.get(i);
    			totalPrice=obj.getsellPrice()*1.04;
    			if(obj.getUsed()) {
    				totalPrice*=0.98;
    			}
    			if(obj.getYearDocument()<actualYear) {
    				totalPrice*=1.2;
    			}
    			message+=totalPrice;
    			stop=true;
    		}
    		if(vehicles.get(i) instanceof GasCar && vehicles.get(i).getLicensePlate().equals(licenseP)) {
    			GasCar obj=(GasCar)vehicles.get(i);
    			if(obj.getUsed()) {
    				totalPrice=obj.getsellPrice()*0.9;
    			}
    			else {
    				totalPrice=obj.getsellPrice();
    			}
    			if(obj.getYearDocument()<actualYear) {
    				totalPrice*=1.2;
    			}
    			message+=totalPrice;
    			stop=true;
    		}
    		if(vehicles.get(i) instanceof ElectricCar && vehicles.get(i).getLicensePlate().equals(licenseP)) {
    			ElectricCar obj=(ElectricCar)vehicles.get(i);
    			if(obj.getUsed()) {
    				totalPrice=obj.getsellPrice()*1.2;
    				totalPrice*=0.9;
    			}
    			else {
    				totalPrice=obj.getsellPrice()*1.2;
    			}
    			if(obj.getYearDocument()<actualYear) {
    				totalPrice*=1.2;
    			}
    			message+=totalPrice;
    			stop=true;
    		}
    		if(vehicles.get(i) instanceof HybridCar && vehicles.get(i).getLicensePlate().equals(licenseP)) {
    			HybridCar obj=(HybridCar)vehicles.get(i);
    			if(obj.getUsed()) {
    				totalPrice=obj.getsellPrice()*1.15;
    				totalPrice*=0.9;
    			}
    			else {
    				totalPrice=obj.getsellPrice()*1.15;
    			}
    			if(obj.getYearDocument()<actualYear) {
    				totalPrice*=1.2;
    			}
    			message+=totalPrice;
    			stop=true;
    		}
    	}
    	return message;
    }
    
    public String infoVehicle(String licenseP) {
    	String message="";
    	boolean stop=false;
    	for(int i=0; i<vehicles.size() && !stop; i++) {
    		if(vehicles.get(i) instanceof Motorcycle && vehicles.get(i).getLicensePlate().equals(licenseP)) {
    			Motorcycle obj=(Motorcycle)vehicles.get(i);
    			message=obj.toString();
    		}
    		if(vehicles.get(i) instanceof GasCar && vehicles.get(i).getLicensePlate().equals(licenseP)) {
    			GasCar obj=(GasCar)vehicles.get(i);
    			message=obj.toString();
    		}
    		if(vehicles.get(i) instanceof ElectricCar && vehicles.get(i).getLicensePlate().equals(licenseP)) {
    			ElectricCar obj=(ElectricCar)vehicles.get(i);
    			message=obj.toString();
    		}
    		if(vehicles.get(i) instanceof HybridCar && vehicles.get(i).getLicensePlate().equals(licenseP)) {
    			HybridCar obj=(HybridCar)vehicles.get(i);
    			message=obj.toString();
    		}
    	}
    	
    	return message;
    }
    
    public String infoDocument(String license) {
    	String message="";
    	boolean stop=false;
    	for(int i=0; i<vehicles.size() && !stop;i++) {
    		if(searchVehicle(license)) {
    			Vehicle obj= vehicles.get(i);
    			message=obj.infoDocuments();
    		}
    		else {
    			message="It couldn't be found a car with the license plate: " +license;
    		}
    	}
    	return message;
    }
    
    public String mapParking() {
    	String message="";
    	for(int i=0; i<parking.length; i++) {
    		for(int j=0; j<parking[0].length; j++) {
    			if(j+1<parking[0].length) {
    				if(parking[i][j]!=null) {
    					message+="|*|";
    				}
    				else {
    					message+="|_|";
    				}
    			}
    			else {
    				if(parking[i][j]!=null) {
    					message+="|*|\n";
    				}
    				else {
    					message+="|_|\n";
    				}
    			}
    		}
    	}
    	return message;
    }
    
    public String infoPark(int fYear, int sYear) {
    	String message="The cars that its model is between " +fYear+ " and " +sYear+ " are:";
    	int yearO=0;
    	int yearM=0;
    	int totalPL=parking.length*parking[0].length;
    	int occupiedPL=0;
    	double percentageOL=0;
    	for(int i=0; i<parking.length; i++) {
    		for(int j=0; j<parking[0].length; j++) {
    			if(parking[i][j]!=null) {
    				if(parking[i][j].getModel()>=fYear || parking[i][j].getModel()<=sYear) {
    					message+=parking[i][j]+ " \n";    					
    				}
    				if(yearO==0) {
    					yearO=parking[i][j].getModel();
    					message+="The oldest car on the parking is the one with the license plate: "+parking[i][j].getLicensePlate()+" and " +parking[i][j].toString()+ " \n"; 
    				}
    				else if(yearO>parking[i][j].getModel()) {
    					yearO=parking[i][j].getModel();
    					message+="The oldest car on the parking is the one with the license plate: "+parking[i][j].getLicensePlate()+" and "+parking[i][j].toString() +" \n"; 
    				}
    				if(yearM<parking[i][j].getModel()) {
    					yearM=parking[i][j].getModel();
    					message+="The newest car on the parking is the one with the license plate: "+parking[i][j].getLicensePlate()+" and "+parking[i][j].toString() +" \n"; 
    				}
    				occupiedPL++;
    			}
    		}
    	}
    	percentageOL=(occupiedPL/totalPL)*100.0;
    	message+="The percentage of occupied parking lots is: " +percentageOL+ "%";
    	return message;
    }
}