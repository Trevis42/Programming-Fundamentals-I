package lab_eight;

public class InventoryItem {

	private String productName;
	private String  manufacturer;
	private double priceCost;
	private double priceSelling;
	
	InventoryItem(String pName, String mName)
	{
		setProductName(pName);
		setManufacturer(mName);
	}
	
	InventoryItem(String pName, String mName, double cost, double sell)
	{
		setProductName(pName);
		setManufacturer(mName);
		setCostPrice(cost);
		setSellingPrice(sell);
	}
	//Setters
	public void setProductName(String pName)
	{
		productName = pName;
	}
	
	public void setManufacturer(String mName)
	{
		manufacturer = mName;
	}
	
	public void setCostPrice(double cPrice)
	{
		priceCost = cPrice;
	}
	
	public void setSellingPrice(double sPrice)
	{
		priceSelling = sPrice;
	}
	//Getters
	public String getProductName()
	{
		return productName;
	}
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	public double getCostPrice()
	{
		return priceCost;
	}
	
	public double getSellingPrice()
	{
		return priceSelling;
	}
	
	public double profit()
	{
		return (priceSelling - priceCost );
	}
	
	public String toString()
	{
		String output = String.format( "The item %s, from %s, cost the store: $%.2f"
														 + "%nWe are selling it for: $%.2f"
														 + "%n%nOur profit on this item is: $%.2f", productName, manufacturer, priceCost, priceSelling, profit());
		return output;
	}
}
