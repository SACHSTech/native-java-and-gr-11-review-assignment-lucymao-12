package gr11review.part1;
import java.io.*;

public class Review2{
	public static void main(String[] args) throws IOException{
    
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // set a string value for choice of joke
    String strJoke = "";

    // show user choices of jokes and take in their input
    System.out.println("0 - print a joke about your hair");
    System.out.println("1 - print a joke about your feet");
    System.out.println("2 - print a joke about your clothes"); 
    System.out.println("3 - print a joke about your teacher");
    System.out.print("Choose a menu option: ");

    int intChoice = Integer.parseInt(keyboard.readLine());

    // add the different cases depending on the value the user has submitted, set the strJoke to that value
    switch (intChoice){
      case 0: strJoke = "What do you call Italian cheese with curly hair? Perm-esan.";
      break;
      case 1: strJoke = "My boyfriend told me to stop acting like a flamingo. So I had to put my foot down.";
      break;
      case 2: strJoke = "What is DNA’s favourite piece of clothing? Jeans";
      break;
      case 3: strJoke = "What's a Teacher's Favorite Nation Expla-nation.";
      break;
      default: strJoke = "Invalid menu option";
      break;
    }
    // print out the joke
    System.out.println(strJoke);
  }
}