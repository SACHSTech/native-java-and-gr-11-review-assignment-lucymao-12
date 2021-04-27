package gr11review.part1;
import java.io.*;
/** 
* Review1 allows the used to input a month and
* date and  outputs the day of the year that
* that month + date lies on
*/
public class Review1{
	public static void main(String[] args) throws IOException{

		// set variables, make table for the days of each month: in order
    int intMonth = 0;
    int intDay = 0;
    int intMonthNum = 0;    
    int[] intMonthsList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // ask user for month and date and turn them to integers
    System.out.print("Enter the month number: ");
    intMonth = Integer.parseInt(keyboard.readLine());

    System.out.print("Enter the day number: ");
    intDay = Integer.parseInt(keyboard.readLine());

    for(int i = 0; i <= 12; i++){
      // for the value of i that == the value of the month inputted, add all the month days (from the list) up until the inputted month number
      if(i == intMonth){
        for(int s = 1; s < i; s++){
          intMonthNum += intMonthsList[s-1];
        }
      }
    }
    // print out both the added months and the date inputted
    System.out.println(intMonthNum+intDay);
  }
}