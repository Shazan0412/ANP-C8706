package student8706_crud.Demo;

public class Champu {
	//lazy loading in java
	///sirf ekbaar object bnana padega iska
	
	//step1
	
	private static Champu instance ;
	
	//contr ko private bana do 
	
	private Champu()
	{
		//Initializing code here
	}

	public static Champu getInstance()
	{
		if(instance==null) {
			//If not 
			instance= new Champu();
		}
		//Return the existing instance
		return instance ;
	}
	
	public static void main(String[] args) {
		
		Champu c1 = Champu.getInstance();

		Champu c2 = Champu.getInstance();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
	
}
