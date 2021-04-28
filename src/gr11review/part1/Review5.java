package gr11review.part1;
import java.io.*;

public class Review5{
	public static void main(String[] args) throws IOException{
    
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // set double variable (decimals) for the yearly amount, compound_interest_rate, and target_amount
    double yearly_amount = 0;
    double compound_interest_rate = 0;
    double target_amount = 0;

    // ask user to input the value for the yearly amount, the interest rate, and the target amount
    System.out.print("Enter the yearly invested amount: ");
    yearly_amount = Double.parseDouble(keyboard.readLine());

    System.out.print("Enter the compound interest rate: ");
    compound_interest_rate = Double.parseDouble(keyboard.readLine());

    System.out.print("Enter the target amount: ");
    target_amount = Double.parseDouble(keyboard.readLine());

    // set a counter for the years taken, the amount of money made through the interest, and the total money
    int i = 0;
    double compound_amount = 0;
    double total_money = 0;

    // set a while loop to run as long as the total money is less than the target amount
    while (total_money < target_amount){
      
      // calculate comound amount
      compound_amount = ((total_money + yearly_amount)*(compound_interest_rate/100));

      // calculate the total money
      total_money += compound_amount+yearly_amount;
      
      // add one to the counter for each run through
      i++;
    }

    // print out the counter number
    System.out.println("The target amount will be earned in " + i + " years.");
  }
}