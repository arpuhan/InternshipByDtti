package com.internshipbydtti;

import java.util.Scanner;

class Infosys{
	int totalEmp;
	int empId;
	long mob;
	
	
	Infosys(long mob,int empId){
		this.empId=empId;
		this.mob=mob;
		totalEmp=400;
		System.out.print("Mob: "+mob);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile Number: ");
		long mob=sc.nextLong();
		System.out.println("Enter Employ Id: ");
		int empId=sc.nextInt();
		Infosys is=new Infosys(mob,empId);
		System.out.print("Total Employ: "+is.totalEmp+"\nemploy Id: "+is.empId+"\nMobile Number: "+is.mob);
	}

}
