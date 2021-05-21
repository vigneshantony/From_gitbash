package com.java.basic;

public class Overriding2 extends Overriding{

	@Override
	public void boyName() {
     super.boyName();
     
	}
	
	@Override
	public void girlName() {
		super.girlName();

	}
	
	@Override
	public void boyMark(float mark) {
		super.boyMark(mark);
	
	}
	public static void main(String[] args) {
		
	
	     Overriding2 ove = new Overriding2();
	      ove.boyMark(28.2f);
           ove.boyName();
           ove.girlName();
	     
	     
	} 
	
	
	
	
	

	}
	
	
	
	
	
	
	
	
	
	
	

