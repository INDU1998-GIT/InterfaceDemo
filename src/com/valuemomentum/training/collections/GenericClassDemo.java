package com.valuemomentum.training.collections;
import java.util.*;

 class Sample<T>{
	 private T data;
	 

	public Sample(T data) {    //defining the constructor
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	 
	 
 }
public class GenericClassDemo {

	public static void main(String[] args) {
		 
		Sample<Integer> s1=new Sample<Integer>(15); //create an object of generic class of user defined class,constructor
		//s1.setData(15);
		System.out.println("Display generic class of type integer:" +s1.getData());
		
		

		Sample<String> s2=new Sample<String>("java generics"); //create an object of generic class of user defined class
		//s2.setData("Java Generics");
		System.out.println("Display generic class of type string:" +s2.getData());
		
		Sample<Float> s3=new Sample<Float>(120.36f); //create an object of generic class of user defined class
		//s3.setData(120.36f);
		System.out.println("Display generic class of type float:" +s3.getData());
		

		
		
		
	}

}
