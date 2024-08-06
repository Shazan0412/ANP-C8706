package lab4;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of strings: ");

        String input = scanner.nextLine();

        String[] strings = input.split(" ");
        TreeSet<String> treeSet = new TreeSet<>();
        for (String str : strings) {
            treeSet.add(str);
        }

        System.out.println(treeSet);
    }
}