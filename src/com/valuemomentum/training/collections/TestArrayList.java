package com.valuemomentum.training.collections;


import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<String> a1=new ArrayList<String>(); //creating array list by upcasting
		a1.add("jim"); //importing object to arraylist
		a1.add("Michael");
		a1.add("James"); //add is a method
		a1.add("Andy");
		System.out.println(a1);
		
		//traversing elements using iterator
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext()) {   //hasnext() is a method cursor goes to next element
			System.out.println(itr.next()); // display
		}
		
		System.out.println(a1.get(1));
		
	        a1.add(3,"Raj"); //adding element in specified index
		
		a1.remove(0); //delete the content
		a1.set(1, "java"); //replace existing content
		
		System.out.println("Display using for each loop"); 
		 for(String i:a1)  //for each loop
		 {
			 System.out.println(i);
		 }
		
		

	}

}
