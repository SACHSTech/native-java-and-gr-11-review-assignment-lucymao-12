package gr11review.part1;
import java.text.DecimalFormat;
import java.io.*;

public class Review6{
	public static void main(String[] args) throws IOException{
    
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    DecimalFormat decimalformat = new DecimalFormat("#0.00");

    double itemPrice = 1;
    double totalPrice = 0;

    while(itemPrice != 0){
      System.out.print("Enter the price for an item: ");
      itemPrice = Double.parseDouble(keyboard.readLine());
      totalPrice += itemPrice;
    }
    System.out.println("Subtotal: $" + (decimalformat.format(totalPrice)));
    System.out.println("Tax: $" + (decimalformat.format(totalPrice*.13)));
    System.out.println("Total: $" + (decimalformat.format(totalPrice+(totalPrice*.13))));
  }
}