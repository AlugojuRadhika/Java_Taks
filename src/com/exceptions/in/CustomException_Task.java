package com.exceptions.in;

class InvalidAgeOfVehicleException extends Exception{
	public InvalidAgeOfVehicleException(String message) {
		super(message);
	}
}
class InvalidAgeOfTireException extends Exception{
	public InvalidAgeOfTireException(String message) {
		super(message);
	}
}
class InvalidAgeOfEngineException extends Exception{
	public InvalidAgeOfEngineException(String message) {
		super(message);
	}
}
class Vehicle{
	public void checkage(int ageOfVehicle,int ageOfTire,int ageOfEngine) throws InvalidAgeOfVehicleException,
	InvalidAgeOfTireException,InvalidAgeOfEngineException{
		if(ageOfVehicle>10) {
			throw new InvalidAgeOfVehicleException("greater than 10 years vehicles are not allowed.");
		}
		else if(ageOfTire>2) {
			throw new InvalidAgeOfTireException("greater than 2 years tires are not allowed.");
		}else if(ageOfEngine>15) {
			throw new InvalidAgeOfEngineException("greater than 15 years engines are not allowed.");
		}else {
			System.out.println("valid vehicle");
		}
	}
}
public class CustomException_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Vehicle().checkage(10,2,16);
		}catch(InvalidAgeOfVehicleException | InvalidAgeOfTireException | InvalidAgeOfEngineException e) {
			e.printStackTrace();
		}
		System.out.println("Exception executed");
	}

}
