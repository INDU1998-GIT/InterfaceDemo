package com.valuemomentum.training.collections;
import java.util.*;

public class GenericMethodTest {
	
	//generic method printArray
	
	public static <E> void printArray(E[] inputArray)           //common method for printing all type of arrays
	
	{
		for (E element : inputArray) {
			System.out.printf("%s", element);  //java can also have printf like c
			
		}
		System.out.println(" ");
	}
	

	public static void main(String[] args) {
		
		
		
		 // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1 , 2 , 3 , 4 , 5 };
        Double[] doubleArray = { 1.1 , 2.2 , 3.3 , 4.4 };
        Character[] charArray = { 'H' , 'E' , 'L' , 'L' , 'O' };

        System.out.println( "Array integerArray contains:" );
        printArray( intArray  ); // pass an Integer array

        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // pass a Double array

        System.out.println( "\nArray characterArray contains:" );
        printArray( charArray ); // pass a Character array
    } 
}

	
