package jul3;

public class Animal {
	    public void sound() {
	        System.out.println("The animal makes a sound.");
	    }
	
  public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();
    }
}


	

