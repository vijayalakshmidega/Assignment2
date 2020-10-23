package labassignment2;

public class Car extends Vehicle {
	
	 
	   int noOfDoor;
		public Car(int noOfWheel, int noOfPassenger, int model, String make,int noOfDoor) {
			super(noOfWheel, noOfPassenger, model, make);
			this.noOfDoor=noOfDoor;		
		}
		public int getNoOfDoor() {
			return noOfDoor;
		}
		public void setNoOfDoor(int noOfDoor) {
			this.noOfDoor = noOfDoor;
		}
		public void display() {
			System.out.println("Make is "+getMake()+ "Model "+getModel()+ 
					"NoOfDoor"+noOfDoor);
		}

	}



