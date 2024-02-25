package com.internshipbydtti;
class parent{
	int age = 56;
	void tyres(int tyre) {
		System.out.println("This is a "+tyre+" wheeler car");
	}
}
class Muna extends parent{
	int age=23;
	void info(){
		super.tyres(4);
		System.out.println("Parent's age is "+super.age);
		System.out.println("Muna's age is "+age);
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Muna mn =new Muna();
		mn.info();
	}

}
