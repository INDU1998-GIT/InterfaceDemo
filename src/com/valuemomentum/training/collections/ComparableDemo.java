package com.valuemomentum.training.collections;
import java.util.*;

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(111,"John",29));
		al.add(new Student(121,"Mike",21));
		al.add(new Student(555,"mary",26));
		for(Student st : al )
		System.out.println(st.rollno+"  "+st.name+"  "+st.age);
		System.out.println("after sorting");
		Collections.sort(al);
		for(Student st:al) {
			
		System.out.println(st.rollno+ " "+st.name+" "+st.age);
		}
		

	}

}
