package com.java.basic;

public class Overriding {

	public void boyName() {
     System.out.println("name is ajith");
	}
	
	public void girlName() {
      System.out.println("name is ramya");
	}
	
	public void boyMark(float mark) {
  
		System.out.println("mark"+mark);
	}
	public static void main(String[] args) {
		Overriding ov = new Overriding();
		ov.boyName();
		ov.girlName();
	}
	
	
	
}
