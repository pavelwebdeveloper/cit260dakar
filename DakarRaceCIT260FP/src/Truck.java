/**
 * 
 */

/**
 * @author Pavel and Noldis
 *
 */
public class Truck extends Vehicle {

	/**
	 * 
	 */
	public Truck() {
		this.numberOfWheels = 6;
	}
	
	public String toString()
	{
		return "Truck " + this.number;
	}
	
	void setSpeed()
	{
		super.setSpeed();
		// Because this is a Truck is 0.3 slow
		this.speed = (int)(this.speed*0.7);
	}
}
