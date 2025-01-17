package Basic;
import java.util.Scanner;

public class IfElse{
	
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the student's score (0-100): ");
			int score = scanner.nextInt();

			char grade;

			if (score >= 90 && score <= 100) {
			    grade = 'A';
			} else if (score >= 80 && score <= 89) {
			    grade = 'B';
			} else if (score >= 70 && score <= 79) {
			    grade = 'C';
			} else if (score >= 60 && score <= 69) {
			    grade = 'D';
			} else {
			    grade = 'F';
			}

			System.out.println("The student's grade is: " + grade);
		}
    }
}