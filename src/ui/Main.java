package ui;
import java.util.Scanner;
import model.Company;
public class Main{
    public static Scanner lector=new Scanner(System.in);
    public static int[][] matrixD;
    
    private Company company;

    public Main(String name){
        company=new Company(name);
    }

    public static void main(String[] args){
        System.out.println("Starting program");
        Main principal=new Main("MercadoLibre");
        matrixD=new int[4][4];

        int option=1;
        do{
            System.out.println("Please select an option");
            System.out.println("0. Exit from the program");
            System.out.println("1.Register a new vehicle");
            System.out.println("2. Calculate the sell price");
            System.out.println("3. Show all the info from the vehicle");
            System.out.println("4. Show the information from the documents");
            System.out.println("5. Show a map of the parking for old cars");
            System.out.println("6 Show information from the parking");
            option=lector.nextInt();
            lector.nextLine();

            switch(option){
            	case 0:
            		System.out.println("Exiting from the program, see you next time");
    			break;
            	
                case 1:
                    System.out.println(principal.addVehicle());
                break;

                case 2:
                    System.out.println(principal.calculatePrice());
                break;

                case 3:
                    System.out.println(principal.infoVehicle());
                break;
                
                case 4:
                	System.out.println(principal.infoDocument());
                break;
                
                case 5:
                	System.out.println(principal.parkingMap());
                break;
                default:System.out.println("Invalid option");
            }
        }while(option!=0);
       
        
    }
    
    public String addVehicle() {
    	String message="";
    	System.out.println("Enter the base price of the vehicle");
    	double bPrice=lector.nextDouble();
    	lector.nextLine();
    	System.out.println("Enter the sell price");
    	double sPrice=lector.nextDouble();
    	lector.nextLine();
    	System.out.println("Is the vehicle used?");
    	String usedA=lector.nextLine();
    	System.out.println("Enter the brand of the vehicle");
    	String brand=lector.nextLine();
    	System.out.println("Enter the model of the vehicle");
    	int model=lector.nextInt();
    	lector.nextLine();
    	System.out.println("Enter the cylinder capacity");
    	double cylinder=lector.nextDouble();
    	lector.nextLine();
    	double mileage=0;
    	if(usedA.equalsIgnoreCase("no")) {
    		mileage=0;
    	}
    	else {
    		System.out.println("Please write the mileage of the car");
    		mileage=lector.nextDouble();
    		lector.nextLine();
    	}
    	String license="";
    	if(usedA.equalsIgnoreCase("no")) {
    		license="";
    	}
    	else {
    		System.out.println("Enter the licensePlate");
    		license=lector.nextLine();
    	}
    	System.out.println("Enter the price of the documents");
    	double priceD=lector.nextDouble();
    	lector.nextLine();
    	System.out.println("Enter the expiration year of the documents");
    	int yearE=lector.nextInt();
    	lector.nextLine();
    	System.out.println("Enter how much the soat covers from damage");
    	String damageC=lector.nextLine();
    	System.out.println("Enter the amount of gas the car emitted on the mechanical technician");
    	double gasE=lector.nextDouble();
    	lector.nextLine();
    	for(int i=0; i<matrixD.length; i++) {
    		for(int j=0; j<matrixD[0].length; j++) {
    			matrixD[i][j]=(int)(Math.random()*100);
    		}
    	}
    	System.out.println("Enter wich tipe of vehicle are you going to register (1 for a motorcycle, 2 for a car");
    	int optionC=lector.nextInt();
    	lector.nextLine();
    	switch(optionC) {
	    	case 1:
	    		System.out.println("Enter the gasoline capacity of the motorcycle");
	    		double gas=lector.nextDouble();
	    		lector.nextLine();
	    		System.out.println("Enter the type of the moto (1 for standard, 2 for sport, 3 for scooter, 4 for cross)");
	    		int motoT=lector.nextInt();
	    		lector.nextLine();
	    		message=company.addVehicle(bPrice, sPrice, usedA, brand, model, cylinder, mileage, license, priceD, yearE, damageC, gasE, matrixD, gas, motoT);
	    	break;
    	
	    	case 2:
	    		System.out.println("Enter the number of doors the car has");
	    		int numD=lector.nextInt();
	    		lector.nextLine();
	    		System.out.println("The car is polarized?");
	    		String polarized=lector.nextLine();
	    		System.out.println("Write which bodywork has the car (1 for a sedan, 2 for a pickup truck)");
	    		int carT=lector.nextInt();
	    		lector.nextLine();
	    		System.out.println("Write which type the car is it (1 for a gas car, 2 for an electric, 3 for an hybrid)");
	    		int carOp=lector.nextInt();
	    		lector.nextLine();
	    		switch(carOp) {
	    			case 1:
	    				System.out.println("Write the gassoline capacity of the car");
	    				double gasC=lector.nextDouble();
	    				lector.nextLine();
	    				System.out.println("Write which type of gassoline use the car (1 for normal, 2 for extra, 3 for diesel)");
	    				int gasTG=lector.nextInt();
	    				lector.nextLine();
	    				message=company.addVehicle(1,bPrice, sPrice, usedA, brand, model, cylinder, mileage, license, priceD, yearE, damageC, gasE, matrixD, numD, polarized, carT, gasC, gasTG);
	    			break;
	    			
	    			case 2: 
	    				System.out.println("Write the battery capacity of the car");
	    				double batteryE=lector.nextInt();
	    				lector.nextLine();
	    				System.out.println("Enter the type of the charger (1 for a normal charger, 2 for a fast)");
	    				int chargeTE=lector.nextInt();
	    				lector.nextLine();
	    				message=company.addVehicle(2,bPrice, sPrice, usedA, brand, model, cylinder, mileage, license, priceD, yearE, damageC, gasE, matrixD, numD, polarized, carT, batteryE, chargeTE);
	    			break;
	    			
	    			case 3: 
	    				System.out.println("Write the gassoline capacity of the car");
	    				double gasH=lector.nextDouble();
	    				lector.nextLine();
	    				System.out.println("Write which type of gassoline use the car (1 for normal, 2 for extra, 3 for diesel)");
	    				int gasTH=lector.nextInt();
	    				lector.nextLine();
	    				System.out.println("Write the battery capacity of the car");
	    				int batteryH=lector.nextInt();
	    				lector.nextLine();
	    				System.out.println("Enter the type of the charger (1 for a normal charger, 2 for a fast)");
	    				int chargeTH=lector.nextInt();
	    				lector.nextLine();
	    				message=company.addVehicle(bPrice, sPrice, usedA, brand, model, cylinder, mileage, license, priceD, yearE, damageC, gasE, matrixD, numD, polarized, carT, gasH, gasTH, batteryH, chargeTH);
	    			break;
	    		}
	    	break;
    	}
    		
    	return message;
    }
    public String calculatePrice() {
    	System.out.println("Please write the license plate");
    	String licenseP=lector.nextLine();
    	String message=company.calculatePrice(licenseP);
    	return message;
    }
    
    public String infoVehicle() {
    	System.out.println("Please write the license plate");
    	String licenseP=lector.nextLine();
    	String message=company.infoVehicle(licenseP);
    	return message;
    }
    
    public String infoDocument() {
    	System.out.println("Write the license plate");
    	String licenseP=lector.nextLine();
    	String message=company.infoDocument(licenseP);
    	return message;
    }
    
    public String parkingMap() {
    	System.out.println("The * represents an occupied lot and the _ represents a empty one");
    	String message=company.mapParking();
    	return message;
    }
    
    public String infoParking() {
    	String message="";
    	System.out.println("Enter the range of the years for search a car on the parking");
    	int year1=lector.nextInt();
    	int year2=lector.nextInt();
    	message=company.infoPark(year1, year2);
    	return message;
    }
}