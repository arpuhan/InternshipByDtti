package com.internshipbydtti;
class Simple<$, A>{
	void show($ s,A w) {
		System.out.println(s+" "+w);
	}
}
public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple<Integer, String> i = new Simple<Integer,String>();
		i.show(1024,"Alok");
		i.show(757001, "Baripada");
		Simple<String, String> s = new Simple<String,String>();
		s.show("SEC","Alok");
		s.show("Balasore", "Mayurbhanj");
		Simple<String, Double> sd = new Simple<String,Double>();
		sd.show("10th Marks",74.6);
		sd.show("12th Marks",62.3);
	}

}
