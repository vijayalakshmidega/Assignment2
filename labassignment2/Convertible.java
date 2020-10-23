package labassignment2;

public class Convertible extends Car{
	boolean isHood=true;;
    public Convertible(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		
	}
 public void display() {
	   System.out.println("Car Information is "+getNoOfWheel()+" " +getModel()+" "
	   +getNoOfPassenger() +" "+getNoOfDoor()+" "+getMake() );
 
 if(isHood==true) {
	   System.out.println("Open");
 }
 else {
	   System.out.println("Closed");
 }
 }

 

}
