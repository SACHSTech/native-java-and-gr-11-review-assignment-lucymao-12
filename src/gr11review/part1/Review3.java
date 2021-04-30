package gr11review.part1;

import java.io.*;

public class Review3{
	public static void main(String[] args) throws IOException{

    /* run a for loop that counts from 20 to 100
    * only prints the value if it is an odd number
    */
    for(int i = 20; i < 100; i++){
      if(i %2 != 0){
        System.out.println(i);
      }
    }

    System.out.println("");

    // run a for loop that starts at 29 and counts backwards to two, prints out all the values
    for(int i = 29; i >= 2; i--){
      System.out.println(i);
    }
  }
}