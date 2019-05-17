package lab_eight;

public class Car {

	private int yearModel;
	private String make;
	private int speed;
	
	Car(int y, String m)
	{
		setYearModel(y);
		setMake(m);
	}
	//Setters
	public void setYearModel(int y)
	{
		 yearModel = y;
	}
	
	public void setMake(String m)
	{
		make = m;
	}
	
	public void setSpeed(int s)
	{
		speed = s;
	}
	//Getters
	public int getYearModel()
	{
		return yearModel;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	//Class methods
	public void accelerate()
	{
		speed += 5;
	}
	
	public void brake()
	{
		speed -= 5;
	}
	
}
