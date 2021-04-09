package com.valuemomentum.training.collections;
import java.util.*;

public class Student5 {
 int rollno;
 String name;
 String  address;
 String course;
 int marks;
public Student5(int rollno, String name, String address,String course,int marks) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.address = address;
	this.course=course;
	this.marks=marks;
}
@Override
public String toString() {
	return "Student5 [rollno=" + rollno + ", name=" + name + ", address=" + address + ", course=" + course + ", marks="
			+ marks + "]";
}
}
 
	 class SortByMarks implements Comparator<Student5>
	 {
		 public int compare(Student5 s1,Student5 s2)
		 {
			 return s1.marks-s2.marks;
		 }
	 }
	 class SortByRoll implements Comparator<Student5>
	 {
		 public int compare(Student5 s1,Student5 s2)
		 {
			 return s1.rollno-s2.rollno;
		 }
	 }



 
	 class SortByName implements Comparator<Student5>
	 {
		 public int compare(Student5 s1,Student5 s2)
		 {
			 return s1.name.compareTo(s2.name);
		 }
	 }
 