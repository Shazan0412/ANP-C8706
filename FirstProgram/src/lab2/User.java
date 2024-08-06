package lab2;

import java.util.*;
public class User {
   
  public static void checked( String email) throws InvalidEmailException {
      if (email.contains("@")) {
    	  System.out.println("Email is vaild");
      }
    	  else {
    		  throw new InvalidEmailException("Email is not  vaild you can't consider the @..");
    	  }
         
      }
  
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your email");
	  String email=sc.next();
	  try
	  {
		  checked(email);
	  }
	  catch (Exception e){
		 e.printStackTrace();;
	  }
	  
      System.out.println("Thank you!");
  }
	       
}