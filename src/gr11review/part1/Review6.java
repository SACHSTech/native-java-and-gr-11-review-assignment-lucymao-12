package gr11review.part1;

// import the java.text.DecimalFormat class
import java.text.DecimalFormat;
import java.io.*;

public class Review6{
	public static void main(String[] args) throws IOException{
    
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // set the decimal format to output only two decimal places
    DecimalFormat decimalformat = new DecimalFormat("#0.00");

    // set variables to hold the price of items as well as the total price (make sure price != 0)
    double itemPrice = 1;
    double totalPrice = 0;

    /* use a while loop to have the system ask for prices as long as the price != 0
    * Add that price to the total price each time
    */
    while(itemPrice != 0){
      System.out.print("Enter the price for an item: ");
      itemPrice = Double.parseDouble(keyboard.readLine());
      totalPrice += itemPrice;
    }

    // print out the subtotal, tax, and total while formatting with the created decimal format
    System.out.println("Subtotal: $" + (decimalformat.format(totalPrice)));
    System.out.println("Tax: $" + (decimalformat.format(totalPrice*.13)));
    System.out.println("Total: $" + (decimalformat.format(totalPrice+(totalPrice*.13))));
  }
}