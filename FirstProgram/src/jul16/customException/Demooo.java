package jul16.customException;

public class Demooo {

	public static void ageChecking(int umra) throws InvalidAgeException{
	
	if (umra > 17) {
		System.out.println("You can vote");
	}else {
		throw new InvalidAgeException("You are underage so you can't vote") ;
	}
	
}
	
public static void main(String[] args) {
	int age = 17 ;
	
	try { 
		ageChecking(17) ;
	}catch(Exception a) {
		a.printStackTrace() ;
	}
	System.out.println("100 lines of code ");
}
}
