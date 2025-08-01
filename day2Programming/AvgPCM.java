package day2Programming;

import java.util.Scanner;

public class AvgPCM {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the marks of Math: ");
    double mathMarks = scanner.nextDouble();
    System.out.print("Enter the marks of Physics: ");
    double physicsMarks = scanner.nextDouble();
    System.out.print("Enter the marks of Chemistry: ");
    double chemistryMarks = scanner.nextDouble();
    double average = (mathMarks + physicsMarks + chemistryMarks) / 3;
    System.out.println("Average marks: " + average);
  }
}
