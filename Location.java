/**
 * The Location class is used create a location object which has an xCoord and yCoord to determine position.
 * 
 * @author Administrator
 *
 */

public class Location 
{
	private int xCoord;
	private int yCoord;
	
	
	
	/**
	 * This is an empty Location constructor that initializes the xCoord and yCoord to 0.
	 */
	public Location()
	{
		xCoord=0;
		yCoord=0;
	}
	
	
	
	/**
	 * This is the desired Location constructor.
	 * @param xCoord  Determines the position in the x-plane (West or East).
	 * @param yCoord  Determines the position in the y-plane (North or South).
	 */
	public Location(int xCoord, int yCoord)
	{		
		InvalidCoordinateException coordProblem = new InvalidCoordinateException("Invalid coordinates used. Try positive values.");
		
		//InvalidCoordinateException is thrown if xCoord and yCoord are less than 0.
		if (xCoord > -1 && yCoord > -1) 
		{
			this.xCoord=xCoord;
			this.yCoord=yCoord;
		}
		else if (xCoord < 0 || yCoord < 0)
		{
			throw coordProblem;
		}
	}
	
	
	
	/**
	 * This method is used to update the coordinates of the location.
	 * @param xCoord  Determines the position in the x-plane (West or East).
	 * @param yCoord  Determines the position in the y-plane (North or South).
	 */
	public void update(int xCoord, int yCoord)
	{
		InvalidCoordinateException coordProblem = new InvalidCoordinateException("Invalid coordinates used. Try positive values.");
		
		//InvalidCoordinateException is thrown if xCoord and yCoord are less than 0.
		if (xCoord > -1 && yCoord > -1) 
		{
			this.xCoord=xCoord;
			this.yCoord=yCoord;
		}
		else if (xCoord < 0 || yCoord < 0)
		{
			throw coordProblem;
		}	
	}
	
	
	/**
	 * This method returns an array with the xCoord and yCoord.
	 * @return  Returns coordArray which has xCoord and yCoord as elements.
	 */
	public int[] getCoordinates () 
	{
		int [] coordArray = new int[] {xCoord, yCoord};
		return coordArray;
	}
}
