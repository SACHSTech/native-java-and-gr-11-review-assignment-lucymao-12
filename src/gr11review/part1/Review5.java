package gr11review.part1;
import java.io.*;

public class Review5{
	public static void main(String[] args) throws IOException{
    
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    double yearly_amount = 0;
    double compound_interest_rate = 0;
    double target_amount = 0;

    System.out.print("Enter the yearly invested amount: ");
    yearly_amount = Double.parseDouble(keyboard.readLine());

    System.out.print("Enter the compound interest rate: ");
    compound_interest_rate = Double.parseDouble(keyboard.readLine());

    System.out.print("Enter the target amount: ");
    target_amount = Double.parseDouble(keyboard.readLine());

    int i = 0;
    double compound_amount = 0;
    double total_money = 0;

    while (total_money < target_amount){
      
      compound_amount = ((total_money + yearly_amount)*(compound_interest_rate/100));

      total_money += compound_amount+yearly_amount;
      i++;
    }
    System.out.println("The target amount will be earned in " + i + " years.");
  }
}