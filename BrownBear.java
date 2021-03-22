/**
 * The BrownBear class is used to instantiate BrownBear objects. This class extends the Animal class 
 * and implements the Swimmable and Walkable interfaces.
 * 
 * @Author  Spencer Childers
*/
public class BrownBear extends Animal implements Walkable, Swimmable
{
	private String subSpecies;
	
	
	
	/**
	 * This is an empty constructor for creating Goldfinch objects which calls upon the Animal class,
	 * and it also sets the brownbears subspecies to "Alaskan". 
	 */
	public BrownBear()
	{
		super();
		subSpecies = "Alaskan";
	}
	
	
	
	/**
	 * This is the desired constructor for making brownbear objects.
	 * @param simID  The brownbear's ID.
	 * @param location  The object which contains the coordinates of the brownbear.
	 * @param subSpecies  The subSpecies of the brownbear.
	 */
	public BrownBear(int simID , Location location , String subSpecies)
	{
		super(simID , location);
		
		InvalidSubspeciesException speciesProblem = new InvalidSubspeciesException("The bear must be of the following species: Alaskan, Asiatic, European, Grizzly, Kodiak, or Siberian.");

		//Testing to ensure that the String for the subspecies of the brownbear matches the list of valid subspecies. If 
		//if the String does not match, a InvalidSubspeciesException is thrown.
		if (subSpecies.equalsIgnoreCase("Alaskan") || subSpecies.equalsIgnoreCase("Asiatic") || subSpecies.equalsIgnoreCase("European") || subSpecies.equalsIgnoreCase("Grizzly") || subSpecies.equalsIgnoreCase("Kodiak") ||subSpecies.equalsIgnoreCase("Siberian")) 
		{
			this.subSpecies = subSpecies;
		}
		else
		{
			throw speciesProblem;
		}
		this.subSpecies = subSpecies;
		full = false;
		rested = true;
	}

	
	
	/**
	 * This is a method that is used if the user wishes the brownbear to walk. In this case, 
	 * the bear will walk 3 units in a direction when the method is enacted. 
	 * @param w  A String that determines the direction the bear walks.
	 */
	public void walk(String w) 
	{
		//Moves the location of the bear up 3 when called (yCoord + 3).
		if (w.equalsIgnoreCase("N"))
		{
			int y = location.getCoordinates()[1]+3;
			int x = location.getCoordinates()[0];		
			location.update(x,y);
		}
		//Moves the location of the bear to the right 3 when called (xCoord + 3).
		else if (w.equalsIgnoreCase("E"))
		{
			int y = location.getCoordinates()[1];
			int x = location.getCoordinates()[0]+3;		
			location.update(x,y);	
		}
		//Moves the location of the bear down 3 when called (yCoord - 3).
		else if (w.equalsIgnoreCase("S"))
		{
			int y = location.getCoordinates()[1]-3;
			int x = location.getCoordinates()[0];		
			location.update(x,y);
		}
		//Moves the location of the bear to the left 3 when called (xCoord - 3).
		else if (w.equalsIgnoreCase("W"))
		{
			int y = location.getCoordinates()[1];
			int x = location.getCoordinates()[0]-3;		
			location.update(x,y);
		}
	}

	
	
	/**
	 * This is a method that is used if the user wishes the brownbear to swim. In this case, 
	 * the bear will swim 2 units in a direction when the method is enacted. 
	 * @param s  A String that determines the direction that the bear swims.
	 */
	public void swim(String s)
	{
		//Moves the location of the bear up 2 when called (yCoord + 2).
		if (s.equalsIgnoreCase("N"))
		{
			int y = location.getCoordinates()[1]+2;
			int x = location.getCoordinates()[0];		
			location.update(x,y);
		}
		//Moves the location of the bear to the right 2 when called (xCoord + 2).
		else if (s.equalsIgnoreCase("E"))
		{
			int y = location.getCoordinates()[1];
			int x = location.getCoordinates()[0]+2;		
			location.update(x,y);
		}
		//Moves the location of the bear down 2 when called (yCoord - 2).
		else if (s.equalsIgnoreCase("S"))
		{
			int y = location.getCoordinates()[1]-2;
			int x = location.getCoordinates()[0];		
			location.update(x,y);
		}
		//Moves the location of the bear to the left 2 when called (xCoord - 2).
		else if (s.equalsIgnoreCase("W"))
		{
			int y = location.getCoordinates()[1];
			int x = location.getCoordinates()[0]-2;		
			location.update(x,y);
		}
	}

	
	
	/**
	 * A getter that returns a String of what subspecies the brownbear object is.
	 * @return  Returns a String of what subspecies the object is.
	 */
	public String getSubSpecies() 
	{
		return subSpecies;
	}



	/**
	 * A setter which allows for the subspecies of the brownbear object to be changed. 
	 * @param subSpecies  A string containing the brownbear object's subspecies.
	 */
	public void setSubSpecies(String subSpecies)
	{
		InvalidSubspeciesException speciesProblem = new InvalidSubspeciesException("The bear must be of the following species: Alaskan, Asiatic, European, Grizzly, Kodiak, or Siberian.");

		//Testing to ensure that the String for the subspecies of the brownbear matches the list of valid subspecies. If 
		//if the String does not match, a InvalidSubspeciesException is thrown.
		if (subSpecies.equalsIgnoreCase("Alaskan") || subSpecies.equalsIgnoreCase("Asiatic") || subSpecies.equalsIgnoreCase("European") || subSpecies.equalsIgnoreCase("Grizzly") || subSpecies.equalsIgnoreCase("Kodiak") ||subSpecies.equalsIgnoreCase("Siberian")) 
		{
			this.subSpecies = subSpecies;
		}
		else
		{
			throw speciesProblem;
		}
	}
}
