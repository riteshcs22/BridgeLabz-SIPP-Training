package day2Programming;

import java.util.Scanner;

public class kmToMiles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter distance in kilometers: ");
    double kilometers = sc.nextDouble();
    double conversionFactor = 1.0 / 1.6;
    double miles = kilometers * conversionFactor;
    System.out.println("The total miles is: " + miles + " for the given kilometers: " + kilometers);
  }
}
