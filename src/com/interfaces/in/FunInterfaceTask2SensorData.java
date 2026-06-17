/**
 * 2nd Question
You are tasked with creating a user-defined class and using predefined functional
interfaces to analyze the temperature value.
1. SensorData Class:
Attributes:Define a class 
SensorData with two private attributes:
double temperature
double humidity
Constructor:Provide a parameterized constructor to initialize these attributes.
Setters and Getters:
Provide setter and getter methods for both the 
humidity attributes.
temperature and
2. Functional Interfaces for Temperature Analysis:
In the SensorData class, implement the following logic:First Functional Interface (Function<SensorData, Double> ):
Define a Function<SensorData, Double> interface to extract and return the temperature from the SensorData instance.
Method Signature: Double apply(SensorData Data)
Use an anonymous inner class to implement this functional interface and
extract the temperature from a 
SensorData object.
Store and display the extracted temperature.
Second Functional Interface (
Function<Double, Boolean> ):
Define a 
Function<Double, Boolean> interface that takes a 
(temperature) as a parameter and returns a 
Boolean .
This function should return 
Double
true if the temperature is above a
specified threshold (e.g., 25 degrees Celsius), and 
false otherwise.
Use an anonymous inner class to implement this functional interface and
check if the extracted temperature is above the threshold.
Print the result (
true or 
false ) based on the function’s return value.
3. Threshold and Main Logic:
Local Variable:
Define a local variable 
threshold.
Temperature Checking:
double threshold = 25.0 for the temperature
In the main method, apply the first function to the 
SensorData object
to extract the temperature.
Apply the second function to check if the temperature exceeds the
threshold and print 
true or 
false based on the result
 */

package com.interfaces.in;
import java.util.function.Function;
class SensorData {
	double temperature;
	double humidity;
	SensorData(double temp,double humid){
		this.temperature=temp;
		this.humidity=humid;
	}
	public double gettemp() {
		return temperature;
	}
	public double gethumid() {
		return humidity;
	}
	public void settemp(double temp) {
		this.temperature=temp;
	}
	public void sethumidity(double humid) {
		this.temperature=humid;
	}
}
	public class FunInterfaceTask2SensorData {
	public static void main(String[] args) { 
		 SensorData data = new SensorData(30.5, 65.0);
		 double threshold = 25.0;
		Function<SensorData, Double> temperature=new Function<SensorData, Double>(){
			@Override
			public Double apply(SensorData data) {
				return data.gettemp();
			}
		};
		double ttemp=temperature.apply(data);
		System.out.println("Temperature : "+ttemp);
		Function<Double, Boolean> bd =new  Function<Double, Boolean>(){
			@Override
			public Boolean apply(Double t) {
				return t>threshold;
			}
		};
		boolean result=bd.apply(ttemp);
		System.out.println(result);
	}
}