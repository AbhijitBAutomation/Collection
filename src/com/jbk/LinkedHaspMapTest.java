package com.jbk;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHaspMapTest {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(23, "India");
		lhm.put(7, "India4");
		lhm.put(34, "India1");
		lhm.put(23, "India2");
		lhm.put(18, "India3");
		lhm.put(7, "India44");
		lhm.put(15, "India5");
		lhm.put(23, "India22");
		System.out.println(lhm);
		System.out.println(lhm.size());
		
		Set<Integer> keys=lhm.keySet();
		System.out.println("Keys are "+keys);
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()){
			
			int key=itr.next();
			System.out.println("key is"+key);
			String value=lhm.get(key);
			System.out.println("Value is"+value);
		
		}

		

}
}
