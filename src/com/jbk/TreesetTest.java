package com.jbk;



import java.util.Iterator;
import java.util.TreeSet;



public class TreesetTest {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(23);
		ts.add(67);
		ts.add(89);
		ts.add(12);
		ts.add(5);
		ts.add(12);
		System.out.println(ts);
		System.out.println(ts.size());
		
		
		
		//Iterator
		System.out.println("Iterator");
		
		Iterator<Integer> itr= ts.iterator();
		while(itr.hasNext()){
			int pp =itr.next();
			System.out.println(pp);
		}
		
		/*//ListIterator
		System.out.println("ListIterator");
		ListIterator<Integer> ltr=ts.listIterator();
		while(ltr.hasNext()){
			int pp=ltr.next();
			System.out.println(pp);
		}*/
		
		//For each
		System.out.println("for Each");
		for(Integer ss :ts){
			System.out.println(ss);
			
		}
		
		
	}

}
