package com.valuemomentum.training.collections;

public class StudentAssignment implements Comparable<StudentAssignment>
{

	int rollno,marks;
String name,course;


	

public StudentAssignment(int rollno, int marks, String name, String course) {
	super();
	this.rollno = rollno;
	this.marks = marks;
	this.name = name;
	this.course = course;
}




public int compareTo(StudentAssignment st) {
	if (marks==st.marks)
		return 0;
	else if(marks>st.marks)
		return 1;
	else 
		return -1;
	
}
}



