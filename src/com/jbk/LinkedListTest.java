package com.jbk;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(23);
		ll.add(67);
		ll.add(89);
		ll.add(12);
		ll.add(5);
		ll.add(12);
		System.out.println(ll);
		System.out.println(ll.size());
		
		
		
		//Iterator
		System.out.println("Iterator");
		
		Iterator<Integer> itr= ll.iterator();
		while(itr.hasNext()){
			int pp =itr.next();
			System.out.println(pp);
		}
		
		//ListIterator
		System.out.println("ListIterator");
		ListIterator<Integer> ltr=ll.listIterator();
		while(ltr.hasNext()){
			int pp=ltr.next();
			System.out.println(pp);
		}
		
		//For each
		System.out.println("for Each");
		for(Integer ss :ll){
			System.out.println(ss);
			
		}
		
		
	}

}
