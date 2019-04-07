/**
 * 
 */

/**
 * @author Pavel and Noldis
 *
 */
public class Car extends Vehicle{

	/**
	 * This a Car class 
	 */
	public Car() {
		this.numberOfWheels = 4;
	}
	
	public String toString()
	{
		return "Car " + this.number + " s:" + getSpeed() + " d:" + getDistanceTraveled() +" t:" + this.getTimeTraveled() + " " + getLongTimeTraveled();
	}
	
	void setSpeed()
	{
		super.setSpeed();
		// Because this is a Car the speed is the same like a vehicle
	}
}
