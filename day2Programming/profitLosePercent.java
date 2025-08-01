package day2Programming;

import java.util.Scanner;

public class profitLosePercent {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the cost price: ");
    double costPrice = sc.nextDouble();
    System.out.print("and the selling price: ");
    double sellingPrice = sc.nextDouble();

    if (sellingPrice > costPrice) {
      double profit = sellingPrice - costPrice;
      double profitPercent = (profit / costPrice) * 100;
      System.out.println("Profit: " + profit);
      System.out.println("Profit Percent: " + profitPercent + "%");
    } else if (sellingPrice < costPrice) {
      double loss = costPrice - sellingPrice;
      double lossPercent = (loss / costPrice) * 100;
      System.out.println("Loss: " + loss);
      System.out.println("Loss Percent: " + lossPercent + "%");
    } else {
      System.out.println("No Profit No Loss");
    }
  }
}
