/**
 * The Animal class is an abstract class which is used as a parent class for the Goldfinch and BrownBear classes.
 * The Animal class contains variables and methods pertaining to Animal objects.
 * 
 * @author  Spencer Childers
 * @since  2021-03-22
 *
 */
abstract public class Animal 
{
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	
	
	/**
	 * This is the empty constructor for an Animal object. This constructor sets all values to zero/false/or [0,0].
	 */
	public Animal()
	{
		simID = 0;
		location = new Location(0,0);
		full = false;
		rested = false;
	}

	
	
	/**
	 * This is the desired constructor for an Animal object.
	 * @param simID  The ID of the animal.
	 * @param location  The object which contains the coordinates of the animal.
	 */
	public Animal(int simID , Location location)
	{
		InvalidSimIDException iDProblem = new InvalidSimIDException("Invalid ID data. Please insert an ID value greater than 0.");
		
		//Checking to see if the simID is greater than 0. If below 0, a InvalidSimIDException is thrown.
		if (simID > 0)
		{
			this.simID = simID;
		}
		else
		{
			throw iDProblem;
		}
		
		this.location = location;
		full = false;
		rested = false;
	}
	
	
	
	/**
	 * This method has a random chance of making the animal full or not full.
	 * @return  Returns true (the animal is full) or false (the animal is not full).
	 */
	public boolean eat()
	{
		double food = Math.random();
		
		if (food > 0.5)
		{
			full = true;
		}
		else
		{
			full = false;
		}
		
		return full;
	}
	
	
	
	/**
	 * This method has a random chance of making the animal rested or not rested.
	 * @return  Returns true (the animal is rested) or false (the animal is not rested).
	 */
	public boolean sleep()
	{
		double rest = Math.random();
		
		if (rest > 0.5)
		{
			rested = true;
		}
		else
		{
			rested = false;
		}
		
		return rested;
	}


	
	/**
	 * This method returns the animal's ID.
	 * @return  Returns an integer value representing the animal's ID.
	 */
	public int getSimID() 
	{
		return simID;
	}



	/**
	 * This method allows for the animal's ID to be changed.
	 * @param simID  This is the animal's new ID.
	 */
	public void setSimID(int simID) 
	{
		this.simID = simID;
	}



	/**
	 * This method returns the location of the animal when used in conjunction with the getCoordinates method.
	 * @return  Returns a location object.
	 */
	public Location getLocation() 
	{
		return location;
	}



	/**
	 * This method allows for the location of the animal to be updated to a new location.
	 * @param location  This is the new location of the animal.
	 */
	public void setLocation(Location location) 
	{
		this.location = location;
	}



	/**
	 * This method returns whether the animal is full or not.
	 * @return  Returns true (the animal is full) or false (the animal is not full).
	 */
	public boolean isFull() 
	{
		return full;
	}



	/**
	 * This method allows for the animal to be set to full or not full.
	 * @param full  Full can be set to true (the animal is full) or to false (the animal is not full).
	 */
	public void setFull(boolean full) 
	{
		this.full = full;
	}


	
	/**
	 * This method returns whether the animal is rested or not.
	 * @return  Returns true (the animal is rested) or false (the animal is not rested).
	 */
	public boolean isRested() 
	{
		return rested;
	}



	/**
	 * This method allows for the animal to be set to rested or not rested.
	 * @param rested  Rested can be set to true (the animal is rested) or false (the animal is not rested).
	 */
	public void setRested(boolean rested) 
	{
		this.rested = rested;
	}
}
