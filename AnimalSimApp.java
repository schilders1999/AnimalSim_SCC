/**
 * This is an application used to display the different classes in the AnimalSim file. This includes the Location,
 * Animal, Goldfinch, and BrownBear classes.
 * 
 * @author  Spencer Childers
 * @since  2021-03-22
 * @version 1.0
 *
 */
public class AnimalSimApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("************************************************************************");
		System.out.println("     Location Tests");
		System.out.println("************************************************************************");

		//Creating an empty location object at [0,0].
		Location location0 = new Location();
		System.out.println("\nPosition of empty constructor object: [" + location0.getCoordinates()[0] + "," + location0.getCoordinates()[1] + "]");
		
		//Creating a desired location object.
		Location location1 = new Location(50 , 75);
		System.out.println("Position of desired constructor object: [" + location1.getCoordinates()[0] + "," + location1.getCoordinates()[1] + "]");
		
		//Updating the location1 objects location.
		location1.update(20 , 35);
		System.out.println("New position of desired constructor object: [" + location1.getCoordinates()[0] + "," + location1.getCoordinates()[1] + "]");
		
		/*Showing how an InvalidCoordinateException would occur.
		Location location2 = new Location(-1 , -5);
		System.out.println("Displaying InvalidCoordinateException: ");
		System.out.println("[" + location2.getCoordinates()[0] + "," + location2.getCoordinates()[1] + "]");
		 */
	
		
		
		System.out.println("\n\n\n************************************************************************");
		System.out.println("     Animal Tests");
		System.out.println("************************************************************************");
		
		//Animal animal = new Animal(); and all Animal methods when used for animal object do not work due to Animal class being abstract.

		
		
		
		System.out.println("\n\n\n************************************************************************");
		System.out.println("     Goldfinch Tests");
		System.out.println("************************************************************************");

		
		//Creating empty goldfinch object.
		Goldfinch goldfinch0 = new Goldfinch();
		System.out.println("\nShowing values for empty goldfinch object:");
		System.out.println("Empty goldfinch ID: " + goldfinch0.getSimID());
		System.out.println("Empty goldfinch location: [" + goldfinch0.getLocation().getCoordinates()[0] + "," + goldfinch0.getLocation().getCoordinates()[1] + "]");
		System.out.println("Empty goldfinch wingspan (cm): " + goldfinch0.getWingSpan());
		System.out.println("Empty goldfinch is full: " + goldfinch0.isFull());
		System.out.println("Empty goldfinch is rested: " + goldfinch0.isRested());
		
		
		//Creating desired goldfinch object.
		Goldfinch goldfinch1 = new Goldfinch(243 , new Location(85 , 103) , 7.2);
		System.out.println("\nShowing values for desired goldfinch object:");
		System.out.println("Desired goldfinch ID: " + goldfinch1.getSimID());
		System.out.println("Desired goldfinch location: [" + goldfinch1.getLocation().getCoordinates()[0] + "," + goldfinch1.getLocation().getCoordinates()[1] + "]");
		System.out.println("Desired goldfinch wingspan (cm): " + goldfinch1.getWingSpan());
		System.out.println("Desired goldfinch is full: " + goldfinch1.isFull());
		System.out.println("Desired goldfinch is rested: " + goldfinch1.isRested());
		
		
		//Testing setters for goldfinch.
		goldfinch1.setSimID(375);
		goldfinch1.setLocation(new Location(68,43));
		goldfinch1.setWingSpan(6.7);
		goldfinch1.setFull(true);
		goldfinch1.setRested(true);
		System.out.println("\nShowing new goldfinch values:");
		System.out.println("Desired goldfinch ID: " + goldfinch1.getSimID());
		System.out.println("Desired goldfinch location: [" + goldfinch1.getLocation().getCoordinates()[0] + "," + goldfinch1.getLocation().getCoordinates()[1] + "]");
		System.out.println("Desired goldfinch wingspan (cm): " + goldfinch1.getWingSpan());
		System.out.println("Desired goldfinch is full: " + goldfinch1.isFull());
		System.out.println("Desired goldfinch is rested: " + goldfinch1.isRested());
		
		
		//Testing walk and fly methods for goldfinch.
		goldfinch1.walk("N");
		System.out.println("\nDesired goldfinch location after walking North: [" + goldfinch1.getLocation().getCoordinates()[0] + "," + goldfinch1.getLocation().getCoordinates()[1] + "]");
		goldfinch1.walk("E");
		System.out.println("Desired goldfinch location after walking East: [" + goldfinch1.getLocation().getCoordinates()[0] + "," + goldfinch1.getLocation().getCoordinates()[1] + "]");
		goldfinch1.walk("S");
		System.out.println("Desired goldfinch location after walking North: [" + goldfinch1.getLocation().getCoordinates()[0] + "," + goldfinch1.getLocation().getCoordinates()[1] + "]");
		goldfinch1.walk("W");
		System.out.println("Desired goldfinch location after walking North: [" + goldfinch1.getLocation().getCoordinates()[0] + "," + goldfinch1.getLocation().getCoordinates()[1] + "]");
		
		
		goldfinch1.fly(new Location(750,1000));
		System.out.println("\nDesired goldfinch location after flying to new location: [" + goldfinch1.getLocation().getCoordinates()[0] + "," + goldfinch1.getLocation().getCoordinates()[1] + "]");

		
		/*Showing how an InvalidSimIDException would occur.
		 * 
		 * Goldfinch goldfinch2 = new Goldfinch(-3 , new Location(780 , 123) , 7.4);
		 * System.out.println("Displaying InvalidIDException: ");
		 * System.out.println(goldfinch2.getSimID());
		 */
		
		/*Showing how a InvalidWingspanException would occur.
		 * 
		 * Goldfinch goldfinch2 = new Goldfinch(420 , new Location(123, 534) , 22);
		 * System.out.println("Displaying InvalidWingspanException: ");
		 * System.out.println(goldfinch2.getWingSpan());
		 */
		
		
		
		System.out.println("\n\n\n************************************************************************");
		System.out.println("     BrownBear Tests");
		System.out.println("************************************************************************");

		
		//Creating empty brownbear object.
		BrownBear bear0 = new BrownBear();
		System.out.println("\nShowing empty bear object values:");
		System.out.println("Empty brownbear ID: " + bear0.getSimID());
		System.out.println("Empty brownbear location: [" + bear0.getLocation().getCoordinates()[0] + "," + bear0.getLocation().getCoordinates()[1] + "]");
		System.out.println("Empty brownbear subspecies: " + bear0.getSubSpecies());
		System.out.println("Empty brownbear is full: " + bear0.isFull());
		System.out.println("Empty brownbear is rested: " + bear0.isRested());
		
		
		//Creating desired brownbear object.
		BrownBear bear1 = new BrownBear(465 , new Location(276 , 824) , "Kodiak");
		System.out.println("\nShowing desired bear object values:");
		System.out.println("Desired brownbear ID: " + bear1.getSimID());
		System.out.println("Desired brownbear location: [" + bear1.getLocation().getCoordinates()[0] + "," + bear1.getLocation().getCoordinates()[1] + "]");
		System.out.println("Desired brownbear subspecies: " + bear1.getSubSpecies());
		System.out.println("Desired brownbear is full: " + bear1.isFull());
		System.out.println("Desired brownbear is rested: " + bear1.isRested());
		
		
		//Testing setters for brownbear.
		bear1.setSimID(750);
		bear1.setLocation(new Location(200,301));
		bear1.setSubSpecies("Grizzly");
		bear1.setFull(true);
		bear1.setRested(true);
		System.out.println("\nShowing new bear values:");
		System.out.println("Desired brownbear ID: " + bear1.getSimID());
		System.out.println("Desired brownbear location: [" + bear1.getLocation().getCoordinates()[0] + "," + bear1.getLocation().getCoordinates()[1] + "]");
		System.out.println("Desired brownbear subspecies: " + bear1.getSubSpecies());
		System.out.println("Desired brownbear is full: " + bear1.isFull());
		System.out.println("Desired brownbear is rested: " + bear1.isRested());
		
		
		//Testing walk and swim methods for brownbear.
		bear1.walk("N");
		System.out.println("\nDesired brownbear location after walking North: [" + bear1.getLocation().getCoordinates()[0] + "," + bear1.getLocation().getCoordinates()[1] + "]");
		bear1.walk("E");
		System.out.println("Desired brownbear location after walking East: [" + bear1.getLocation().getCoordinates()[0] + "," + bear1.getLocation().getCoordinates()[1] + "]");
		bear1.walk("S");
		System.out.println("Desired brownbear location after walking North: [" + bear1.getLocation().getCoordinates()[0] + "," + bear1.getLocation().getCoordinates()[1] + "]");
		bear1.walk("W");
		System.out.println("Desired brownbear location after walking North: [" + bear1.getLocation().getCoordinates()[0] + "," + bear1.getLocation().getCoordinates()[1] + "]");

		bear1.swim("N");
		System.out.println("\nDesired brownbear location after swimming North: [" + bear1.getLocation().getCoordinates()[0] + "," + bear1.getLocation().getCoordinates()[1] + "]");
		bear1.swim("E");
		System.out.println("Desired brownbear location after swimming East: [" + bear1.getLocation().getCoordinates()[0] + "," + bear1.getLocation().getCoordinates()[1] + "]");
		bear1.swim("S");
		System.out.println("Desired brownbear location after swimming South: [" + bear1.getLocation().getCoordinates()[0] + "," + bear1.getLocation().getCoordinates()[1] + "]");
		bear1.swim("W");
		System.out.println("Desired brownbear location after swimming West: [" + bear1.getLocation().getCoordinates()[0] + "," + bear1.getLocation().getCoordinates()[1] + "]");

		
		/*Showing how InvalidSubspeciesException would occur.
		 * BrownBear bear2 = new BrownBear(832 , new Location(790 , 742) , "Teddy");
		 * System.out.println("Displaying InvalidSubspeciesException: ");
		 * System.out.println(bear2.getSubSpecies());
		 */
	}

}
