package day2Programming;

import java.util.Scanner;

public class maxHandshakes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    int n = sc.nextInt();
    int maxHandshakes = (n * (n - 1)) / 2;
    System.out.println("The maximum number of handshakes is: " + maxHandshakes);
  }
}
