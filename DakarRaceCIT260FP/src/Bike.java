/**
 * 
 */

/**
 * @author Pavel and Noldis
 *
 */
public class Bike extends Vehicle {

	/**
	 * 
	 */
	public Bike() {
		this.numberOfWheels = 2;
	}
	
	public String toString()
	{
		return "Bike " + this.number + " s:" + getSpeed() + " d:" + getDistanceTraveled() +" t:" + this.getTimeTraveled() + " " + getLongTimeTraveled();
	}
	
	void setSpeed()
	{
		super.setSpeed();
		// Because this is a Bike is 0.2 faster
		this.speed = (int)(this.speed*1.2);
	}
}
