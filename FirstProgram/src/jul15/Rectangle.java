package jul15;

public class Rectangle extends Shape {
  
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
	}
	
	void display() {
		System.out.println(length * width);
	}

	@Override
    public int getArea() {
        return length * width;
    }
	public static void main(String[] args) {
		Rectangle r = new Rectangle() ;
	    r.length = 15 ;
	    r.width = 12 ;
	    r.display();
	}
}
	




