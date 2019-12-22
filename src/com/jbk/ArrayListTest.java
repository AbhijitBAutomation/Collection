package com.jbk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(23);
		al.add(67);
		al.add(89);
		al.add(12);
		al.add(5);
		al.add(12);
		System.out.println(al);
		System.out.println(al.size());
		
		
		
		//Iterator
		System.out.println("Iterator");
		
		Iterator<Integer> itr= al.iterator();
		while(itr.hasNext()){
			int pp =itr.next();
			System.out.println(pp);
		}
		
		//ListIterator
		System.out.println("ListIterator");
		ListIterator<Integer> ltr=al.listIterator();
		while(ltr.hasNext()){
			int pp=ltr.next();
			System.out.println(pp);
		}
		
		//For each
		System.out.println("for Each");
		for(int ss :al){
			System.out.println(ss);
			
		}
		
		
		//ListIterator hasPrevious method
				System.out.println("ListIterator having hasPrevious() method ");
		ListIterator<Integer> ltr1=al.listIterator(al.size());
		while(ltr1.hasPrevious()){
			int pp=ltr1.previous();
			System.out.println(pp);
		}
		
		
	}

}
