package labassignment2;

public class SportCar extends Car {
	//package com.assingment.Q2;

	//public class SportCar extends Car{

		int noOfDo;
		public SportCar(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor,int noOfDo) {
			super(noOfWheel, noOfPassenger, model, make, noOfDoor);
			this.noOfDo=noOfDo;
		}
		public void display() {
				   System.out.println("Car Information is "+getNoOfWheel()+getModel()
				   +getNoOfPassenger()+getNoOfDoor()+getMake()+noOfDo );
		}

	}



