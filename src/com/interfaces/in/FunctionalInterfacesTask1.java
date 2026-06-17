///**
// * 1st Question
//You are tasked with creating two functional interfaces and implementing them using
//anonymous inner classes in Java.
//1. NumberChecker Interface:
//Functional Interface: This interface should contain the following method:
//Method Name: 
//checkNumber
//Parameters: 
//int (a single integer)
//Return Type: 
//boolean
//Description: The method 
//checkNumber should determine if the provided
//integer is a prime number or not.
//2. CharChecker Interface:
//Functional Interface: This interface should contain the following method:
//Method Name: 
//checkChar
//Parameters: 
//char (a single character)
//Return Type: 
//void
//Description: The method 
//checkChar should check whether the ASCII value
//of the provided character is prime or not. It should print the result.
//3. Main Class:
//isPrime Static Method:
//Implement a static method named 
//isPrime in the Main class that checks
//whether an integer (either a number or ASCII value) is a prime number.
//Method Signature: 
//public static boolean isPrime(int number)
//Description: The method should return 
//and 
//false otherwise.
//true if the given number is prime
//4. Anonymous Inner Class Implementations:
//NumberChecker Anonymous Inner Class:
//In the main method, create an instance of the 
//using an anonymous inner class.
//Implement the 
//NumberChecker interface
//checkNumber method to check whether a sample integer
//(e.g., 7) is prime and print the result.
//CharChecker Anonymous Inner Class:
//In the main method, create an instance of the 
//CharChecker interface
//using another anonymous inner class.
//Implement the 
//checkChar method to check whether the ASCII value of a
//sample character (e.g., 
//'A' ) is prime and print the result.
// */
//
package com.interfaces.in;
@FunctionalInterface
public interface NumberChecker{
	boolean checkNumber(int n);
}
public interface CharChecker{
	void checkChar(char ch);
}
public class FunctionalInterfacesTask1 {
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
			return false;
		}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		NumberChecker nc=new NumberChecker() {
			@Override
			public boolean checkNumber(int n) {
				if(isPrime(n)) {
					return true;
				}else {
					return false;
				}
			}
		};
		int n = 89;
		if(nc.checkNumber(n)) {
			System.out.println(n+" prime");
		}else {
			System.out.println(n+" not prime");
		}
		CharChecker cc=new CharChecker() {
			public void checkChar(char ch) {
				int n=(int) ch;
				if(isPrime(n)) {
					System.out.println(ch+" is "+n+ " prime");
				}else {
					System.out.println(ch+" is "+n+ " not prime");
				}
				}
		};
		char ch = 'e';
		cc.checkChar(ch);
	}	
}
