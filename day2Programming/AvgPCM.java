package day2Programming;

import java.util.Scanner;

public class AvgPCM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the marks of Math: ");
    double mathMarks = sc.nextDouble();
    System.out.print("Enter the marks of Physics: ");
    double physicsMarks = sc.nextDouble();
    System.out.print("Enter the marks of Chemistry: ");
    double chemistryMarks = sc.nextDouble();
    double average = (mathMarks + physicsMarks + chemistryMarks) / 3;
    System.out.println("Average marks: " + average);
  }
}
