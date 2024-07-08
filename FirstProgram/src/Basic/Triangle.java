package Basic;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        String triangleType = getTriangleType(side1, side2, side3);

        System.out.println("The triangle is " + triangleType);
    }

    public static String getTriangleType(double side1, double side2, double side3) {
        if (isNotATriangle(side1, side2, side3)) {
            return "Not a triangle";
        } else if (isEquilateral(side1, side2, side3)) {
            return "Equilateral";
        } else if (isIsosceles(side1, side2, side3)) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    public static boolean isNotATriangle(double side1, double side2, double side3) {
        return (side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1);
    }

    public static boolean isEquilateral(double side1, double side2, double side3) {
        return side1 == side2 && side2 == side3;
    }

    public static boolean isIsosceles(double side1, double side2, double side3) {
        return (side1 == side2) || (side1 == side3) || (side2 == side3);
        

    }
}