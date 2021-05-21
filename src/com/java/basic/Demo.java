package com.java.basic;

public class Demo {

	public Demo() {
     System.out.println("test demo");
	}
	
	public Demo(int id){
		System.out.println("your id:"+id);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo(45);  
		
		
	}

	
	
	
}
