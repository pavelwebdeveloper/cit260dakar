/**
 * This is the Supper Class Vehicle.
 * All the vehicles in the Darkar Race derive from this one.
 */

/**
 * @author Pavel and Noldis
 *
 */
public class Vehicle {

	/**
	 * 
	 */
	
	// Every vehicle in the race have a number assigned and need to be show in the sides of the vehicle
	int number;
	
	// The vehicles distinguish according of the number of wheels. Cars = 4, Bikes = 2, Trucks = 6, 8, 12
	int numberOfWheels;
	
	public Vehicle() {
		this.number = 1; // This will use global/protected number
	}
	
	// Setters
	void setNumber(int number)
	{
		this.number = number;
	}
	
	void setNumberOfWheels(int numberOfWheels)
	{
		this.numberOfWheels = numberOfWheels;
	}
	
	//Getters
	
	int getNumber()
	{
		return this.number;
	}
	
	int getNumberOfWheels()
	{
		return this.numberOfWheels;
	}
}
