package dakar;
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
		return "Truck " + this.number + " s:" + getSpeed() + " d:" + getDistanceTraveled() +" t:" + this.getTimeTraveled() + " " + getLongTimeTraveled();
	}
	
	public void setSpeed()
	{
		super.setSpeed();
		// Because this is a Truck is 0.3 slow
		this.speed = (int)(this.speed*0.7);
	}
}
