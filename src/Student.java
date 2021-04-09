import java.util.*;
public class Student implements Imaths {

	@Override
	public void add() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter any two integer values to perform addition");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a+b;
		System.out.println("sum of "+a+" and " +b+ "is" +s);

	}

	@Override
	public void sub() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter any two integer values to perform subtraction");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a-b;
		System.out.println("Difference of "+a+" and " +b+ "is" +s);


	}

	@Override
	public void mul() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter any two integer values to perform muultiplication");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a*b;
		System.out.println("product of "+a+" and " +b+ "is" +s);
	

	}

	@Override
	public void div() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter any two integer values to perform division");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a/b;
		System.out.println("quotient of "+a+" and " +b+ "is" +s);
		

	}


	public static void main(String[] args) {
		Student s1=new Student();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
		
		

	}
}


