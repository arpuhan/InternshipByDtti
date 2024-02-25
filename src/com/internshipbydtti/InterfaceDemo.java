package com.internshipbydtti;
/*interface Vehicle{
	void speed();
	
}

abstract class Car implements Vehicle{
	 void viper() {
		System.out.println("car has the 2 viper in front and one in back");
	}
	
}
class Thar extends Car{
	public void speed() {
		System.out.println("Thar Speed is: 140km/h");
	}
}
abstract class Bike implements Vehicle{
	
	void stand() {
		System.out.println("Bmw have stand");
	}
}
class Bmw extends Bike{
	public void speed() {
		System.out.println("Bmw Speed is: 200km/h");
	}
}
abstract class Truck implements Vehicle{

	void container() {
		System.out.println("Tata truck had 300 litre container");
	}
}
class Tata extends Truck{
	public void speed() {
		System.out.println("Tata Speed is: 100km/h");
	}
}
*/
interface Parent{
	int age=76;
	String job="Govt Job";
}
interface Child extends Parent{
	int age=23;
}
class adhar implements Parent,Child{
	void show() {
		System.out.println("Parent Age is : "+Parent.age+"\nParents Job is: "+Parent.job);
		System.out.println("Child Age is : "+Child.age);//when both variable are same 
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adhar a = new adhar();
		a.show();
	/*	Car x=new Thar();
		x.speed();
		x.viper();
		Bike b=new Bmw();
		b.speed();
		b.stand();
		Truck t =new Tata();
		t.container();
		t.speed();
		*/
	}

}
