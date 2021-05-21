package com.java.basic;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Setting {
 public static void main(String[] args) {
	 
	  Map<String , Object> s = new LinkedHashMap<String, Object>();
	  
	  s.put("life", 25);
	  s.put("size", 45.2f);
	  s.put("future", 2000000l);
	  s.put("key", "hi");
	  
	  System.out.println(s);
	  
	  int size = s.size();
	 System.out.println(size);
	 
	  Object ob = s.get("key");
	 System.out.println(ob);
	 
	 Set<String> ks = s.keySet();
	 System.out.println(ks);
	 
	 boolean ck = s.containsKey("lead");
	  System.out.println(ck);
	  
	  boolean cv = s.containsValue(2000000l);
	 System.out.println(cv);
	 
		 
		
	}
	 
	 
	 
}

