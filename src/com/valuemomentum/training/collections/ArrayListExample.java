package com.valuemomentum.training.collections;
import java.util.*;
import java.util.List;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating list of books
		
List<Book> list= new ArrayList<Book>();

//creating books
Book b1=new Book(101,"let us c","yashwanth","BPB",8); //object creation of book
Book b2=new Book(102,"java","kiran","BPB",7);
Book b3=new Book(103,"python","Galvin","BPB",6);

//adding books to list
list.add(b1);
list.add(b2);
list.add(b3);



 //Traversing list
for(Book b: list) // b referring  or  pointing to the  collection list
{
System.out.println(b.id+" "+ b.name+" "+b.author+" "+b.publisher+" "+b.quantity);	
}


	}

}

