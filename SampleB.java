
public class SampleB  {
 public static void main(String[] args)
 {
 MountainBike mb= new MountainBike(10,10,5,150,10);
 mb.Num();
 mb.changeGear(4);
 RoadBike rb= new RoadBike(10,10,5,45);
 rb.speedDisplay();
 TandemBike tb=new TandemBike(10,10,5,5);
tb.speedDisplay();
 }
} 
