package lab_eight;
import static java.lang.System.out;
public class InventoryMain {

	public static void main(String[] args)
	{

		InventoryItem stuff = new InventoryItem("Purple Ball","Stuff Co.");
		
		InventoryItem stuff2 = new InventoryItem("Blue Ball","Stuff Co.", 1.99, 2.49);
		
		stuff.setCostPrice(2.99);
		stuff.setSellingPrice(3.49);
		
		out.println("===First product info===\n" + stuff.toString());
		out.println("===Second product info===\n" + stuff2.toString());
		
	}

}
