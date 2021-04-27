package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

public class Review4{
	public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    
    DecimalFormat decimalformat = new DecimalFormat("#0.00");
    
    int intItems = 0;
    double dblPrice = 0;
    double dblTotal = 0;

    System.out.print("How many items do you want to buy? ");
    intItems = Integer.parseInt(keyboard.readLine());

    for(int i = 0; i<intItems; i++){
      System.out.print("Enter price for item " + intItems + ": ");

      dblPrice = Double.parseDouble(keyboard.readLine());

      dblTotal += dblPrice; 

    }
    System.out.println(decimalformat.format("Subtotal: " + dblTotal));
    System.out.println(decimalformat.format("Tax: " + dblTotal * 0.13));
    System.out.println(decimalformat.format("Total: " + dblTotal + (dblTotal * 0.13)));
  }
}