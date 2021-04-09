
public class ShapeTest {

	public static void main(String[] args) {
		// programming for interfaces not implementation
		Shape s1=new Circle(10); //upcasting
		Circle c=new Circle(10);
		s1.draw();
		System.out.println("radius=" +c.getRadius());
		System.out.println("area=" +s1.getArea());
	
		
		
		//switching from one implementation to another
		
		s1=new Rectangle(10,10);
		s1.draw();
		System.out.println("area=" +s1.getArea());
		

	}

}
