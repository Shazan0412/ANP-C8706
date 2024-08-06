package jul19;

import java.util.*;

	public class UniqueWords {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        String[] words = sentence.split(" ");

	        Set<String> uniqueWords = new HashSet<>();

	        for (String word : words) {
	            uniqueWords.add(word.toLowerCase());
	        }

	        Set<String> sortWords = new TreeSet<>(uniqueWords);

	        System.out.println("Unique words: " + sortWords);
	    }
	}

