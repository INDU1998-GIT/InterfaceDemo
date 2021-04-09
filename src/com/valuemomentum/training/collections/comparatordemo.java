package com.valuemomentum.training.collections;
import java.util.*;

public class comparatordemo {

	public static void main(String[] args) {
		
		ArrayList<Student5> ar=new ArrayList<Student5>();
		
		Student5 s1=new Student5(111,"John","Bengaluru","ECE",500);
		Student5 s2=new Student5(121,"Alem","mumbai","it",450);
		Student5 s3=new Student5(131,"Vamshi","newyork","cse",560);
		Student5 s4=new Student5(112,"Sam","milan","mech",460);
		
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		
		System.out.println("**********Unsorted Array List:************");
		System.out.println(ar); // invoke toString() method
		for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
		
		Collections.sort(ar, new SortByMarks());
		
		System.out.println("**********Sorted Array List by marks:**********");
				for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
		
				Collections.sort(ar, new SortByRoll());
				
				System.out.println("**********Sorted Array List by Rollno:**********");
						for (int i=0; i<ar.size(); i++)
		            System.out.println(ar.get(i));
						
					

				
		

		Collections.sort(ar, new SortByName());
		System.out.println("**********Sorted Array List by Name:**************");
		for (int i=0; i<ar.size(); i++)
    System.out.println(ar.get(i));
	}

}

		
		
		

	
