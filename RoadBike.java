 public class RoadBike extends Bicycle{

 
 int a;
 

 RoadBike(int cadence,int speed,int gear,int a){
  super(cadence,speed,gear);
this.a=a;
}
	@Override
		public void speedDisplay() {
			// TODO Auto-generated method stub
		System.out.println(a);
		}
 }