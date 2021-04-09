package com.valuemomentum.training.collections;
import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorDemo {

	public static void main(String[] args) {
		 ArrayList<String> a1=new ArrayList<String>();
		 a1.add("Jim");
		 a1.add("Jerry");
		 a1.add("John");
		 a1.add(1,"Jive");
		 System.out.println("element at second position:" +a1.get(2));
		  ListIterator<String>itr =a1.listIterator();
		  System.out.println("traversing elements in forward direction");
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
		  }
		  System.out.println("traversing elements in backward direction");
		  while(itr.hasPrevious())
		  {
			  System.out.println(itr.previous());
		  }
	}

}

