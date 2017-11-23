
public class MountainBike extends Bicycle{
 int num;
 int rating;

 MountainBike(int cadence,int speed,int gear,int num,int rating){
  super(cadence,speed,gear);
  this.num=num;
  this.rating=rating;
 }
 //abstract 
 
@Override
	public void speedDisplay() {
		// TODO Auto-generated method stub
		
		System.out.println(rating);
		
	}
 @Override
public void changeGear(int newValue) {
	
	super.changeGear(newValue);
	if(newValue>=1 && newValue<=5)
	{
		gear=newValue;
		System.out.println(gear);
	}
	else
	{
		System.err.println("invalid");
	}
	}


void Num(){
  System.out.println("values are=  " +num); 
 }
}


	





