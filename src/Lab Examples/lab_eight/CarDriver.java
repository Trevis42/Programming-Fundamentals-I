package lab_eight;
import static java.lang.System.out;
public class CarDriver {

	public static void main(String[] args)
	{

		Car car = new Car(2003, "Corolla");
		
		out.println("Car: " + car.getYearModel() +" "+ car.getMake());
		
		car.setSpeed(100);
		out.println("\nCar's initial speed: " +car.getSpeed());
		out.println("Accelarating!!");
		for(int i = 1; i < 6; i++)
		{
			car.accelerate();
			out.println("Car's speed: " +car.getSpeed());
		}
		out.println("\nCar's speed before braking: " +car.getSpeed());
		out.println("Braking!!!");		
		for(int i = 1; i < 6; i++)
		{
			car.brake();
			out.println("Car's speed: " +car.getSpeed());
		}	
	}//end main
}//end class
