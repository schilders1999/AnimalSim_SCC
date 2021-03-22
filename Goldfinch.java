/**
 * The Goldfinch class is used to instantiate Goldfinch objects. This class extends the Animal class 
 * and implements the Flyable and Walkable interfaces.
 * 
 * @Author  Spencer Childers
*/
public class Goldfinch extends Animal implements Flyable, Walkable
{
	private double wingSpan;
	
	
	
	/**
	 * This is an empty constructor for creating Goldfinch objects which initializes
	 * calls upon the empty constructor in the Animal class and sets the wingSpan to 9.0.
	 */
	public Goldfinch()
	{
		super();
		wingSpan = 9.0;
	}
	
	
	
	/**
	 * This is the desired constructor for making Goldfinch objects.
	 * @param simID  The goldfinch's ID.
	 * @param location  The object which contains the coordinate of the goldfinch.
	 * @param wingSpan  The wingspan of the goldfinch in centimeters.
	 */
	public Goldfinch(int simID , Location location , double wingSpan)
	{
		super(simID , location);
		
		InvalidWingspanException wingProblem = new InvalidWingspanException("Wingspan must be between 5.0 and 11.0 centimeters.");
		
		//Testing to ensure that the wingSpan is between 5.0 and 11.0. If not, the InvalidWingspanException is thrown.
		if (wingSpan >= 5.0 && wingSpan <=11.0)
		{
			this.wingSpan = wingSpan;
		}
		else
		{
			throw wingProblem;
		}
		full = false;
		rested = true;
	}

	
	
	/**
	 * This is a method that is used if the user wishes the goldfinch to walk. In this case, 
	 * the bird will walk 1 unit when the method is enacted. 
	 * @param w  A String that determines the direction that the bird walks.
	 */
	public void walk(String w) 
	{
		//Moves the location of the goldfinch up 1 when called (yCoord + 1).
		if (w.equalsIgnoreCase("N"))
		{
			int y = location.getCoordinates()[1]+1;
			int x = location.getCoordinates()[0];		
			location.update(x,y);
		}
		//Moves the location of the goldfinch to the right 1 when called (xCoord + 1).
		else if (w.equalsIgnoreCase("E"))
		{
			int y = location.getCoordinates()[1];
			int x = location.getCoordinates()[0]+1;		
			location.update(x,y);
		}
		//Moves the location of the goldfinch down 1 when called (yCoord - 1).
		else if (w.equalsIgnoreCase("S"))
		{
			int y = location.getCoordinates()[1]-1;
			int x = location.getCoordinates()[0];
			location.update(x,y);
		}
		//Moves the location of the goldfinch to the left 1 when called (xCoord - 1).
		else if (w.equalsIgnoreCase("W"))
		{
			int y = location.getCoordinates()[1];
			int x = location.getCoordinates()[0]-1;		
			location.update(x,y);
		}
	}
	
	
	
	/**
	 * This method is used if the user wants the bird to fly. In the case of flight, the bird is given a 
	 * new location.
	 * @param l  This is the new location object assigned to the bird.
	 */
	public void fly(Location l) 
	{
		location=l;
	}
	
	
	
	/**
	 * This method is used to get the wingspan of the goldfinch object.
	 * @return  Returns the double value for the birds wingspan.
	 */
	public double getWingSpan() 
	{
		return wingSpan;
	}

	
	
	/**
	 * This method is used to set the wingspan of the bird to a new value.
	 * @param wingSpan  The birds new wingspan.
	 */
	public void setWingSpan(double wingSpan)
	{
		this.wingSpan = wingSpan;
	}	
	
}
