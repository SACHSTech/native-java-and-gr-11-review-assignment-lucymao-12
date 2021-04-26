package gr11review.part1;

import java.io.*;

public class Review1{
	public static void main(String[] args) throws IOException{

		int intMonth = 0;
    int intDay = 0;
    int intMonthNum = 0;

    int[] intMonthsList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter the month number: ");
    intMonth = Integer.parseInt(keyboard.readLine());

    System.out.print("Enter the day number: ");
    intDay = Integer.parseInt(keyboard.readLine());

    for(int i = 0; i<=12; i++){
      if(i == intMonth){
        for(int s = 1; s<i; s++){
          intMonthNum += intMonthsList[s-1];
        }
      }
    }
    System.out.println(intMonthNum+intDay);


  }
}