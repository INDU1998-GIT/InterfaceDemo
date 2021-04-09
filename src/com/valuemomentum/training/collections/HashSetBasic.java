package com.valuemomentum.training.collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasic {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("HashSet: " + numbers);
        
        
        numbers.add(2);
        numbers.add(5); //addition of duplicate elements
        
        numbers.add(null);           //addition of nulls
numbers.add(null);
        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("HashSet using Iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}


