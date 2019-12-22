package com.jbk;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(23, "India");
		hm.put(7, "India4");
		hm.put(34, "India1");
		hm.put(23, "India2");
		hm.put(18, "India3");
		hm.put(7, "India44");
		hm.put(15, "India5");
		hm.put(23, "India22");
		System.out.println(hm);
		System.out.println(hm.size());
		
		Set<Integer> keys=hm.keySet();
		System.out.println("Keys are "+keys);
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()){
			
			int key=itr.next();
			System.out.println("key is"+key);
			String value=hm.get(key);
			System.out.println("Value is"+value);
		
		}

		

}
}
