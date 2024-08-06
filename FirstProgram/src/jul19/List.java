package jul19;


	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;

	public class List {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("List of integers: ");
	        String input = scanner.nextLine();

	        String[] integers = input.split(" ");

	        Set<Integer> uniqueIntegers = new HashSet<>();

	        for (String integer : integers) {
	            uniqueIntegers.add(Integer.parseInt(integer));
	        }

	        System.out.println("Unique integers: " + uniqueIntegers);
	    }
	}

