package com.jbk;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Integer> vv=new Vector<>();
		vv.add(23);
		vv.add(67);
		vv.add(89);
		vv.add(12);
		vv.add(5);
		vv.add(12);
		System.out.println(vv);
		System.out.println(vv.size());
		
		
		
		//Iterator
		System.out.println("Iterator");
		
		Iterator<Integer> itr= vv.iterator();
		while(itr.hasNext()){
			int pp =itr.next();
			System.out.println(pp);
		}
		
		//ListIterator
		System.out.println("ListIterator");
		ListIterator<Integer> ltr=vv.listIterator();
		while(ltr.hasNext()){
			int pp=ltr.next();
			System.out.println(pp);
		}
		
		//For each
		System.out.println("for Each");
		for(Integer ss :vv){
			System.out.println(ss);
			
		}
		
		
	}

}
