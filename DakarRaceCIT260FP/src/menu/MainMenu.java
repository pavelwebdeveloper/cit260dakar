package menu;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import dakar.Vehicle;
import dakar.Car;
import dakar.Bike;
import dakar.Truck;

import util.Menu;
import util.MenuItem;

public class MainMenu extends Menu {
	
	static int KILOMETERS_400 = 400;
	static int KILOMETERS_300 = 300;
	
	ArrayList<Car> listOfCars = new ArrayList<Car>();
	ArrayList<Bike> listOfBikes = new ArrayList<Bike>();
	ArrayList<Truck> listOfTrucks = new ArrayList<Truck>();

    /**
     * Default constructor. Does nothing.
     */
    public MainMenu() {
        super();
    }
    
    /**
     * Provide the menu title (or null to skip it)
     * @return
     */
    @Override
    protected String getTitle() {
        return "MAIN MENU";
    }
    
    
    /**
     * Provide a menu description, or null to skip it.
     * @return
     */
    @Override
    protected String getDescription() {
        return "This is the main menu of the program.";
    }
    
    /**
     * Provide the list of menu items.
     * @return
     */
    @Override
    protected MenuItem[] getMenuItems() {
        return new MenuItem[] {
                new MenuItem('1', "Create a CAR"),
                new MenuItem('2', "Create a BIKE"),
                new MenuItem('3', "Create a TRUCK"),
                new MenuItem('4', "List all Vehicles"),
                new MenuItem('5', "Create a full race"),
                new MenuItem('6', "Store the race to disk"),
                new MenuItem('7', "Retrieve the race from disk"),
                new MenuItem('H', "Help Menu"),
                new MenuItem('Q', "Quit Program")
        };
    }
    
    
    /**
     * Handle the user's menu selection.
     * @param key
     * @return false if the menu should exit and return to whatever called it.
     */
    @Override
    protected boolean handleMenuSelection(char key) {
        
        
        
        switch (Character.toUpperCase(key)) {
            case '1': 
                System.out.println("Implement Add Prophet here");
                break;
            case '2':
                System.out.println("You typed 2");
                break;
            case '3':
                System.out.println("You typed 3");
                break;
            case '4':
            	listAllVehicles();
                break;                
                
            case 'H':
                Menu helpMenu = new HelpMenu();
                helpMenu.display();
                break;
                
            case 'Q':
                return false;
                
            default:
                System.out.println("Invalid Entry");
            
        }
        
        return true;
    }
    
    
    
    
    /*
     * Option 4 : List all Vehicles
     * 
     * This option uses a for to list all the vehicles
     * every object uses his own polymorphic method to list
     * the vehicle
     * The vehicle can be: Car, Bike or Truck
     * 
     * */
    
    public void listAllVehicles()
    {
    	String emptyList = "The list is empty";
	    for(Car car : listOfCars)
		{
			System.out.println(car.toString());
			emptyList = "";
		}
		for(Bike bike : listOfBikes)
		{
			System.out.println(bike.toString());
			emptyList = "";
		}
		for(Truck truck : listOfTrucks)
		{
			System.out.println(truck.toString());
			emptyList = "";
		}
		if (emptyList != "")
		{
			System.out.println(emptyList);
		}
    }
    
	public static Car bestCar(ArrayList<Car> Cars)
	{
		double bestTime = 9999999;
		Car bestCar = null;
		for(Car car : Cars)
		{
			if (car.getLongTimeTraveled() < bestTime)
			{
				bestTime = car.getLongTimeTraveled();
				bestCar = car;
			}
		}
		return bestCar;
	}
	
	public static Bike bestBike(ArrayList<Bike> Bikes)
	{
		double bestTime = 9999999;
		Bike bestBike = null;
		for(Bike bike : Bikes)
		{
			if (bike.getLongTimeTraveled() < bestTime)
			{
				bestTime = bike.getLongTimeTraveled();
				bestBike = bike;
			}
		}
		return bestBike;
	}
	
	public static Truck bestTruck(ArrayList<Truck> Trucks)
	{
		double bestTime = 9999999;
		Truck bestTruck = null;
		for(Truck truck : Trucks)
		{
			if (truck.getLongTimeTraveled() < bestTime)
			{
				bestTime = truck.getLongTimeTraveled();
				bestTruck = truck;
			}
		}
		return bestTruck;
	}
	
	
	public static void storeRace(String fileName, ArrayList<Car> cars, ArrayList<Bike> bikes, ArrayList<Truck> trucks) throws FileNotFoundException
	{
		PrintWriter file = new PrintWriter(fileName);
		for(Car car : cars)
		{
			file.println(car.toString());
		}
		for(Bike bike : bikes)
		{
			file.println(bike.toString());
		}
		for(Truck truck : trucks)
		{
			file.println(truck.toString());
		}
		file.close();
	}
	
	public static void retrieveRace(String fileName, ArrayList<Car> cars, ArrayList<Bike> bikes, ArrayList<Truck> trucks) throws IOException
	{
		System.out.println("ToDo: retrieveRace");
		java.io.File file = new java.io.File(fileName);
		Scanner input = new Scanner(file);
		String number = null;
		String speed = null;
		String distance = null;
		String stringDistance;
		String doubleDistance;
		while(input.hasNext())
		{
			String line = input.next();
			if (("CarBikeTruck").contains(line))
			{
				//System.out.println("Procesar...");
            	number = input.next();
            	
            	speed = input.next();
            	speed = speed.substring(2, speed.indexOf("K"));
            	
            	distance = input.next();
            	distance = distance.substring(2);
            	
            	stringDistance = input.next();
            	
            	doubleDistance = input.next();
            	
            	System.out.println("Car");
            	System.out.println("number " + number);
            	System.out.println("speed " + speed);
            	System.out.println("distance " + distance);
            	System.out.println("stringDistance " + stringDistance);
            	System.out.println("doubleDistance " + doubleDistance);
            	
			}
			System.out.println(line);
			switch(line) 
	        { 
	            case "Car":
	            	Car car = new Car();
	            	car.setNumber(Integer.parseInt(number));
	            	car.setSpeed(Double.parseDouble(speed));
	            	car.setDistance(Double.parseDouble(distance));
	            	cars.add(car);
	                break; 
	            case "Bike": 
	            	Bike bike = new Bike();
	            	bike.setNumber(Integer.parseInt(number));
	            	bike.setSpeed(Double.parseDouble(speed));
	            	bike.setDistance(Double.parseDouble(distance));
	            	bikes.add(bike); 
	                break; 
	            case "Truck": 
	            	Truck truck = new Truck();
	            	truck.setNumber(Integer.parseInt(number));
	            	truck.setSpeed(Double.parseDouble(speed));
	            	truck.setDistance(Double.parseDouble(distance));
	            	trucks.add(truck); 
	                break; 
	            default: 
	                //System.out.println("no match"); 
	        } 
		}
		input.close();
	}
    
    
    void holaMundo() throws IOException
    {
		System.out.println("Creating cars");
		System.out.println("Creating bikes");
		System.out.println("Creating trucks");		

		listOfCars.add(new Car());
		listOfCars.add(new Car());
		listOfTrucks.add(new Truck());
		listOfCars.add(new Car());
		listOfBikes.add(new Bike());
		listOfBikes.add(new Bike());
		listOfCars.add(new Car());
		listOfTrucks.add(new Truck());		
		listOfCars.add(new Car());
		listOfBikes.add(new Bike());
		listOfBikes.add(new Bike());
		listOfCars.add(new Car());
		listOfCars.add(new Car());
		listOfTrucks.add(new Truck());
		listOfTrucks.add(new Truck());
		listOfTrucks.add(new Truck());
		
		System.out.println("Show the vehicles");
		System.out.println("There's no order because the number is assign in order of register.");
		// Call a _for_ showing all the cars, trucks and bikes
		// this call uses Polymorphism to show toString() in the objects
		// Show the cars
		
		System.out.println("Run!!!!");
		for(Car car : listOfCars)
		{
			car.setSpeed();
			car.run(KILOMETERS_400);
			System.out.println(car.toString());
		}
		for(Bike bike : listOfBikes)
		{
			bike.setSpeed();
			bike.run(KILOMETERS_300);
			System.out.println(bike.toString());
		}
		for(Truck truck : listOfTrucks)
		{
			truck.setSpeed();
			truck.run(KILOMETERS_400);
			System.out.println(truck.toString());
		}
		//Call the run in every object
		System.out.println("Show the first places");
		//Call for the three vehicles in every category
		Car bestCar = bestCar(listOfCars);
		Bike bestBike = bestBike(listOfBikes);
		System.out.println("Best Car: " + bestCar);
		System.out.println("Best Bike: " + bestBike);
		System.out.println("Best Truck: " + bestTruck(listOfTrucks));
		
		
		
		
		System.out.println("Store the race on disk");
		storeRace("race01.txt", listOfCars, listOfBikes, listOfTrucks);
		
		// Clean all the lists
		listOfCars.clear();
		listOfBikes.clear();
		listOfTrucks.clear();
		
		System.out.println("Restore the race from disk");
		retrieveRace("race01.txt", listOfCars, listOfBikes, listOfTrucks);
		
		
		for(Car car : listOfCars)
		{
			System.out.println(car.toString());
		}
		for(Bike bike : listOfBikes)
		{
			System.out.println(bike.toString());
		}
		for(Truck truck : listOfTrucks)
		{
			System.out.println(truck.toString());
		}
    }

}