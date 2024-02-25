package com.internshipbydtti;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hii I am Alok and from balasore.Alok is a graduate";
		String s2= "Alok";
		System.out.println(s.equals("Alok"));//compare with string
		System.out.println("################");
		System.out.println(s.contains("baripada"));//Word present or not
		System.out.println("################");
		System.out.println(s.substring(3));//Print the string from index 3
		System.out.println("################");
		System.out.println(s.substring(6,50));//Print the string from index 6 to 50
		System.out.println("################");
		System.out.println(s.replace("Alok","Jitu"));//Replace string Alok to Jitu from the string s
		System.out.println("################");
		System.out.println(s.replaceFirst("Alok","Jitu"));//Replace string first Alok to Jitu from the string s
		System.out.println("################");
		System.out.println(s.charAt(15));//Shows the character at index number 15
		System.out.println("################");
		System.out.println(s.toCharArray());//Converting to char array
		System.out.println("################");
		String a[]=s.split(" ");// split the string with the given "space" and store in the string array
		for(String k : a)
			System.out.println(k);
		System.out.println("################");
		String s1="hii ! this is programmng";
		String a1[]=s1.split("!");// split the string with the given ! and store in the string array
		for(String k : a1)
			System.out.println(k);
		System.out.println("################");
		System.out.println(s.toUpperCase().toLowerCase().charAt(15));//first uppercase then  lower case the character at 15 index number
		System.out.println("################");
		StringBuffer s3=new StringBuffer("Hello");//Thread safe
		s3.append("World");
		System.out.println(s3);
		StringBuilder s4=new StringBuilder("Hello");//Not thread safe
		s4.append("Earth");
		System.out.println(s4);
	}

}
