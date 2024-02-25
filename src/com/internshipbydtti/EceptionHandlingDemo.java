package com.internshipbydtti;


public class EceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ARRAY INDEX OUT OF BOUND
		  try {
			int arr[]= {2,54,32,87,1};
			System.out.println(arr[5]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("This is the example of Array Index Out Of Bounds Exception");
		System.out.println("####################################");
		//NULL POINTER EXCEPTION
		String name=null;
		try {
			System.out.println("Length of Name is"+name.length());
		}catch(NullPointerException ne){
			ne.printStackTrace();
		}
		System.out.println("This is the example of Null pointer exception");
		System.out.println("####################################");
		int a=30,b=0;
		try {
			System.out.println("Divivsion is: "+(a/b));
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("This is the example of Artithmetic Exception");
		}
		finally {
			System.out.println("All are end here");
		
		}
		System.out.println("####################################");
	}
}




