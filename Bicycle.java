
abstract public class Bicycle  {
	int cadence;
	int speed;
	int gear;
public Bicycle(int cadence,int speed,int gear)
{
	this.cadence=cadence;
	this.speed=speed;
	this.gear=gear;
}
	public void changeGear(int newValue)
	{
		if(newValue>=1 &&newValue<=4)
		{
			gear=newValue;
			System.out.println(gear);
	}
	else
	{
		System.err.println("invalid");
	}
	}
	//abstract method
	 abstract public void speedDisplay();
		public void changeSpeed(int newValue1)
		{
			if(newValue1>=20 && newValue1<=50)
			{
				speed=newValue1;
				System.out.println("in limit" +speed);
			}
			else
			{
				System.err.println("exceeded limit");
			}
			
			
			}
		}


		

			
		
	
