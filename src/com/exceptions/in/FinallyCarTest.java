package com.exceptions.in;
class CarStopped extends Exception{
	CarStopped(String str){
		super(str);
	}
}
class CarPuncture extends Exception{
	CarPuncture(String str1){
		super(str1);
	}
}
class CarHeat extends Exception{
	CarHeat(String str5){
		super(str5);
	}
}
public class FinallyCarTest {
	public static void Stop(String str3) throws CarStopped{
			if(str3.equals("stop")){
				throw new CarStopped("CarStopped");
			}
			else {
				System.out.println("Car not stalled");
			}
		}
	public static void puncture(String str4) throws CarPuncture{
			if(str4.equals("puncture")) {
				throw new CarPuncture( "Car is Punctured");
			}else {
				System.out.println("Car not punctured");
			}
		}
	public static void  carHeat(int temp) throws CarHeat{
			if(temp>50) {
				throw new CarHeat( "Car is heated more than 50 degrees");
			}else {
				System.out.println("Car not stalled");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			Stop("stop");
//		}catch(CarStopped e) {
//			e.printStackTrace();
//		}
		try {
			puncture("puncture");
		}catch(CarPuncture e1) {
			e1.printStackTrace();
		}
//		try {
//			carHeat(51);
//		}catch(CarHeat e2) {
//			e2.printStackTrace();
//		}
	}
}