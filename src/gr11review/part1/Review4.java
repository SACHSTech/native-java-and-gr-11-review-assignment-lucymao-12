package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

public class Review4{
	public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    
    // set the decimal format to include only two decimal places
    DecimalFormat decimalformat = new DecimalFormat("#0.00");
    
    // set the variables for the number of items, the price of the items and the value of the total
    int intItems = 0;
    double dblPrice = 0;
    double dblTotal = 0;

    // ask user how many items they want, put that value into the intItems variable
    System.out.print("How many items do you want to buy? ");
    intItems = Integer.parseInt(keyboard.readLine());

    /* with a for loop, continue running until the user has inputted the price of all the items
    * add the price of the item to the total price each time
    */
    for(int i = 0; i<intItems; i++){
      System.out.print("Enter price for item " + intItems + ": ");

      dblPrice = Double.parseDouble(keyboard.readLine());

      dblTotal += dblPrice; 

    }

    // output the total price, tax (total price * .13) and the total price plus tax
    System.out.println(decimalformat.format("Subtotal: $" + dblTotal));
    System.out.println(decimalformat.format("Tax: $" + dblTotal * 0.13));
    System.out.println(decimalformat.format("Total: $" + dblTotal + (dblTotal * 0.13)));
  }
}