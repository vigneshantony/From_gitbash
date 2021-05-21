package com.java.basic;

import java.util.LinkedList;
import java.util.List;

public class Collect {

	public static void main(String[] arg) {
		
		List<Integer> li= new LinkedList<Integer>();
		
		li.add(10);
		li.add(40);
		li.add(60);
		
		List<Integer> li1= new LinkedList<Integer>();

		li1.add(10);
		li1.add(20);
		li1.add(30);
		
		
		li.retainAll(li1);
		System.out.println(li);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
