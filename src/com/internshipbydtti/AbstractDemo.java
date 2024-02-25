package com.internshipbydtti;
abstract class Animal{
	abstract void lifeSpan();//abstract method
	void breath() {//concrete method
		System.out.println("Oxygen is neccesary for breathing");
	}
}
class Lion extends Animal{
	void lifeSpan(){
		System.out.println("Lions Lifespan is 35 Years.");
	}
}
class Tiger extends Animal{
	void lifeSpan(){
		System.out.println("Lions Lifespan is 25 Years.");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion ln=new Lion();
		ln.breath();
		ln.lifeSpan();
		Tiger tr=new Tiger();
		tr.breath();
		tr.lifeSpan();
	}

}
