package jul2;

public class Shape{
	
	public abstract class shape {
	    public abstract double area();
	}

	
	public class Circle extends shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double area() {
	        return 3.14*radius * radius;
	    }
	}

	
	public class Rectangle extends Shape {
	    private double length;
	    private double width;

	    public Rectangle(double length, 
	    		double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public double area() {
	        return length * width;
	    }
	}

	
	public class Main {
	    public static void main(String[] args) {
	       Shape circle = new Circle(5.0);
	       Shape rectangle = new Rectangle(4.0, 6.0);

	        System.out.println("Circle area: " + circle.area());
	        System.out.println("Rectangle area: " + rectangle.area());
	    }
	}

	public double area() {
		return 0;
	}
}
