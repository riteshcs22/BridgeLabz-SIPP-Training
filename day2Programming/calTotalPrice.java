package day2Programming;

import java.util.Scanner;

public class calTotalPrice {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the price of the item: ");
    double price = sc.nextDouble();
    System.out.print("Enter the quantity of the item: ");
    int quantity = sc.nextInt();
    double totalPrice = price * quantity;
    System.out.println("The total price is: " + totalPrice);
  }
}
