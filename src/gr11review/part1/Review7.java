package gr11review.part1;
import java.io.*;

public class Review7{
	public static void main(String[] args) throws IOException{
    
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    String theSentence = keyboard.readLine();
    int[] charArray = {0, 0 , 0};
    String newString = "";

    for(int i = 0; i < theSentence.length(); i++){
        charArray[0]++;
      
      if(theSentence.charAt(i) == ' '){
        charArray[1]++;
      }
      if(theSentence.charAt(i) == 'a'){
        charArray[2]++;
      }
      if(i % 2 == 0){
        newString += "-";
      }
    }
    
    System.out.println("There are " + charArray[0] + " characters in the sentence.");
    System.out.println("There are "+charArray[1]+" spaces in the sentence.");
    System.out.println("There are "+charArray[2]+" letter a in the sentence.");
    System.out.println(newString);
    
  }
}