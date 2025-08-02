package day3Programming;

import java.util.*;

public class IntOperations {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int a = sc.nextInt();
    System.out.print("Enter second integer: ");
    int b = sc.nextInt();
    System.out.print("Enter third integer: ");
    int c = sc.nextInt();
    int one = a + b * c;
    int two = a * b - c;
    double three = (double) c + a / b;
    double four = (double) a % b + c;
    System.out.println("The result of int operations are: " + one + ", " + two + ", " + three + ", " + four);
  }
}
