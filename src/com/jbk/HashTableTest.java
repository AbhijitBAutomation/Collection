package com.jbk;


import java.util.Hashtable;
import java.util.Iterator;

import java.util.Set;

public class HashTableTest {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<>();
		ht.put(23, "India");
		ht.put(7, "India4");
		ht.put(34, "India1");
		ht.put(23, "India2");
		ht.put(18, "India3");
		ht.put(7, "India44");
		ht.put(15, "India5");
		ht.put(23, "India22");
		System.out.println(ht);
		System.out.println(ht.size());
		
		Set<Integer> keys=ht.keySet();
		System.out.println("Keys are "+keys);
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()){
			
			int key=itr.next();
			System.out.println("key is"+key);
			
			String value=ht.get(key);
			System.out.println("Value is"+value);
		
		}

		

}
}
