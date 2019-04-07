import java.util.ArrayList;

/**
 * This is a simple program to simulate a Dakar Race
 * For mor information about the Darkar you con enter to www.dakar.com
 */

/**
 * @author Pavel Shvets
 *         Noldis Chumacero
 *
 */
public class DakarRace {
	
	static int KILOMETERS_400 = 400;

	public static void main(String[] args) {
		System.out.println("Welcome to Darkar Race");
		
       	//Call a _for_ creating all the cars		
		System.out.println("Creating cars");
		ArrayList<Car> listOfCars = new ArrayList<Car>();
		listOfCars.add(new Car());
		listOfCars.add(new Car());
		listOfCars.add(new Car());
		listOfCars.add(new Car());
		listOfCars.add(new Car());
		
		// Call a _for_ creating all the bikes
		System.out.println("Creating bikes");
		ArrayList<Bike> listOfBikes = new ArrayList<Bike>();
		listOfBikes.add(new Bike());
		listOfBikes.add(new Bike());
		listOfBikes.add(new Bike());
		listOfBikes.add(new Bike());
		listOfBikes.add(new Bike());
		
		// Call a _for_ creating all the trucks
		System.out.println("Creating trucks");
		ArrayList<Truck> listOfTrucks = new ArrayList<Truck>();
		listOfTrucks.add(new Truck());
		listOfTrucks.add(new Truck());
		listOfTrucks.add(new Truck());
		listOfTrucks.add(new Truck());
		listOfTrucks.add(new Truck());		
		
		System.out.println("Show the vehicles");
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
		/*
		for(Bike bike : listOfBikes)
		{
			System.out.println(bike.toString());
		}
		
		for(Truck truck : listOfTrucks)
		{
			System.out.println(truck.toString());
		}
		*/
		
		
		//Call the run in every object
		System.out.println("Show the first places");
		//Call for the three vehicles in every category
	}
}
