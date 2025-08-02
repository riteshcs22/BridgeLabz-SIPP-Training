package day3Programming;

import java.util.*;

public class totalPrice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the price of the item: ");
    double price = sc.nextDouble();
    System.out.print("Enter the quantity of the item: ");
    int quantity = sc.nextInt();
    double total = price * quantity;
    System.out.println("The total price is: " + total);
  }
}
