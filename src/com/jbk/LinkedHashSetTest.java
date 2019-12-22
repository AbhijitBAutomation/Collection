package com.jbk;



import java.util.Iterator;
import java.util.LinkedHashSet;



public class LinkedHashSetTest {
	public static void main(String[] args) {
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		hs.add(23);
		hs.add(67);
		hs.add(89);
		hs.add(12);
		hs.add(5);
		hs.add(12);
		System.out.println(hs);
		System.out.println(hs.size());
		
		
		
		//Iterator
		System.out.println("Iterator");
		
		Iterator<Integer> itr= hs.iterator();
		while(itr.hasNext()){
			int pp =itr.next();
			System.out.println(pp);
		}
		
	/*	//ListIterator
		System.out.println("ListIterator");
		ListIterator<Integer> ltr=hs.listIterator();
		while(ltr.hasNext()){
			int pp=ltr.next();
			System.out.println(pp);
		}*/
		
		//For each
		System.out.println("for Each");
		for(Integer ss :hs){
			System.out.println(ss);
			
		}
		
		
	}

}
