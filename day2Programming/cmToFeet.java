package day2Programming;

import java.util.Scanner;

public class cmToFeet {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your height in centimeters: ");
    double centimeters = sc.nextDouble();
    double conversionFactor = 0.0328084;
    double feet = centimeters * conversionFactor;
    System.out.println(
        "Your height in cm is " + centimeters + " while in feet is " + feet + " and inches is " + (feet * 12) + ".");
  }
}
