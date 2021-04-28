package gr11review.part1;
// import java.lang.Math
import java.lang.Math;
import java.io.*;

public class Review8{
	public static void main(String[] args) throws IOException{
    
    // set array to hold the three numbers, set the counter for triple numeber
    int[] slot_numbers = {0, 0, 0};
    int s = 0;

    for(int i = 0; i < 1000; i++){
      // use Math.random to set a value for each slot, print out their value
      slot_numbers[0] = (int)(Math.random()*10);
      slot_numbers[1] = (int)(Math.random()*10);
      slot_numbers[2] = (int)(Math.random()*10);
      System.out.print(slot_numbers[0]+ " ");
      System.out.print(slot_numbers[1]+" ");
      System.out.println(slot_numbers[2]);
      
      // if three values are the same, add one to the counter s
      if(slot_numbers[0] == slot_numbers[1] && slot_numbers[0] == slot_numbers[2]){
        s++;
      }
    }
    // print out s counter after the loop has run
    System.out.println(s);
  }
}