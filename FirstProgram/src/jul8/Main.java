package jul8;

public class Main {
	    public static void main(String[] args) {
	        Document document = new Document("I am Printable");
	        document.print();

	        Image image = new Image(800, 600);
	        image.print();
	    }
	}
