package com.valuemomentum.training.collections;
import java.util.*;
public class ComparableAssignment {

	public static void main(String[] args) {
		ArrayList<StudentAssignment> al=new ArrayList<StudentAssignment>();
		al.add(new StudentAssignment(111,500,"indu","ece"));
		al.add(new StudentAssignment(121,460,"Mike","it"));
		al.add(new StudentAssignment(555,560,"nick","mech"));
		for(StudentAssignment st : al )
		System.out.println(st.rollno+"  "+st.marks+"  "+st.name+" "+st.course);
		System.out.println("after sorting");
		Collections.sort(al);
		for(StudentAssignment st:al) {
			
		System.out.println(st.rollno+ " "+st.marks+" "+st.name+" "+st.course);
		}
		

	}

}

		
	
