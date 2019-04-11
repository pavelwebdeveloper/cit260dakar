package dakar;
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
	
	// This is the number of sequence
	// Every vehicle need to have a number it begins with 1
	// After any creation the sequence add 1
	static int sequenceNumber = 0;
	
	// Every vehicle in the race have a number assigned and need to be show in the sides of the vehicle
	int number;
	
	// The vehicles distinguish according of the number of wheels. Cars = 4, Bikes = 2, Trucks = 6, 8, 12
	int numberOfWheels;
	
	// Every vehicle have a speed
	// the speed is Kilometers / Hour
	double speed;
	
	double distanceTraveled;
	

	double getDistanceTraveled()
	{
		return distanceTraveled; 
	}

	
	public double getLongTimeTraveled()
	{
		return distanceTraveled / speed;
	}
	
	
	String getTimeTraveled()
	{
		double timeNumber = getLongTimeTraveled();
		int hour = (int)(timeNumber);
		int minutes = (int)((timeNumber - hour) * 60);
		int seconds = (int)((((timeNumber - hour) * 60) - minutes) * 60);
		return hour + ":" + minutes + ":" + seconds;
	}
	
	public Vehicle() {
		this.number = getSequeceNumber(); // This will use global/protected number
	}
	
	// Setters
	public void setNumber(int number)
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
	
	protected Integer getSequeceNumber()
	{
		sequenceNumber = sequenceNumber + 10;
		return sequenceNumber; 
	}
	
	void setSpeed()
	{
		this.speed = (Math.random()*100);
		this.speed = Math.round(this.speed * 100) / 100.0;
	}
	
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	
	public void setDistance(double distance)
	{
		this.distanceTraveled = distance;
	}
	
	String getSpeed()
	{
		return (Math.round(this.speed * 100)) / 100.0 + "Km/h";
	}
	
	public void run(int kilometers)
	{
		// Use random speed to move the vehicle
		this.distanceTraveled = kilometers;
		this.setSpeed();
	}
}
