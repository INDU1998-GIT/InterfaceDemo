package com.valuemomentum.training.collections;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {

	public static void main(String[] args) {
		
		//creating map of books
		 Map<Integer,Book>mapbook = new HashMap<Integer,Book>();
		 Book b1=new Book(101,"let us c","yashwanth","BPB",8); //object creation of book
		 Book b2=new Book(102,"java","kiran","BPB",7);
		 Book b3=new Book(103,"python","Galvin","BPB",6);
 
		 mapbook.put(1, b1);
		 mapbook.put(2, b2);
		 mapbook.put(3, b3);
		 
		 for(Map.Entry<Integer, Book>  e:mapbook.entrySet()) {
			int key=e.getKey();
			Book b=e.getValue();
			System.out.println(key+  "details");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		 }

	}

}

