 public class TandemBike extends Bicycle{
 int design;

 TandemBike(int cadence,int speed,int gear,int design){
  super(cadence,speed,gear);
   this.design=design;
 }

	@Override
		public void speedDisplay() {
			// TODO Auto-generated method stub
		System.out.println(design);
		}
 }
    