import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ex. nr.1: Write a Java program to print the area and perimeter and area of a rectangle and a hexagon");
        System.out.println("Rectangle Perimeter is - " + Rectangle.rectanglePerimeter(1.2D, 15.3D));
        System.out.println("Rectangle area is - " + Rectangle.rectangleArea(1.2D, 15.5D));
        System.out.println("Hexagon area is - " + Hexagon.hexagonArea(4.0D) + "\n");
        double lat1 = 47.15845D;
        double lon1 = 27.60144D;
        double lat2 = 47.01045D;
        double lon2 = 28.86381D;
        System.out.println("ex. nr.2: Write a Java program to compute the distance between two points on the surface of earth");
        System.out.println(Coordinates.distance(lat1, lat2, lon1, lon2) + " K.M -> not so far\n");
        ReversString reversString = new ReversString();
        String result = "1_eludoM_morF_kroWemoh";
        System.out.println("ex. nr.3: Write a Java program to reverse a string");
        System.out.println(result);
        reversString.sort(result);
        int limit = 100;
        System.out.println("\nex. nr.4: Write a Java program to print the odd numbers from 1 to 99");
        System.out.println("Printing Odd numbers between 1 and " + limit);
        OddNumber.odd(100);
        System.out.println("\n\nex. nr.5: Write a Java program to convert a given string into lowercase");
        String line = "EUGEN";
        line = line.toLowerCase();
        System.out.println(line);
        System.out.println("\nex. nr.6: Write a Java program which iterates the integers from 1 to 100. For multiples\nof three print \"Fizz\" instead of the number and print \"Buzz\" for the multiples\nof five. When number is divided by both three and five, print \"fizz buzz\"");
        int x = 100;
        FizzBuzz.fizzBuzz(x);
        System.out.println("\n\nWrite a Java program to check if a positive number is a palindrome or not");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        Polindrome.check(n);
    }
}
