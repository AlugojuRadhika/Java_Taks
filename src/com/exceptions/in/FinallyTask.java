package com.exceptions.in;

class Handling{
	public static void tiMethod(int n) {
		try {
			System.out.println(10000);
			tilMethod(n);
			System.out.println("Coders");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void tilMethod(int n)throws Exception{
		try {
			int x=100/n;
			if(n==0) {
				throw new ArithmeticException("ArithmeticException");
			}else if(n==10) {
				throw new Exception("Exception");
			}else {
				System.out.println("Completed");
			}
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally");
		}
	}
}
public class FinallyTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Handling.tiMethod(0);
//		Handling.tiMethod(1);
		Handling.tiMethod(10);
//		Handling.tiMethod(15);
	}

}
