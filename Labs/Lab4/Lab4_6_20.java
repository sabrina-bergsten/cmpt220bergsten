/*

  * file: Lab4_6_20.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 4: Problem 6.20
  * due date: February 28, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab4_6_8"
public class Lab4_6_20{
  //main statement
  public static void main(String[] args){
  	//creates scanner to collect user input
    Scanner input = new Scanner(System.in);
    //prompts user to enter a word
    System.out.println("Enter a word");

    //sets userInput equal the user's word 
    String userInput = input.nextLine();

    //print statement prints out the user's original word and the result
    //of countLetters method with userInput as a parameter
    System.out.println(userInput + " has " + countLetters(userInput) + 
    " letters in it.");
  }

  //creates method countLetters with string s in the paremeter
  public static int countLetters(String s){
    //creates integer variable stringCount to use during for loop
    int stringCount = 0;
    //beginning of for loop that loops once for each character in the string 
    for(int i=0;i<s.length();i++){
      //for each iteration in the loop add one to stringCount
      stringCount++;
    }
    //after for loop is complete return stringCount
    return stringCount;
  }


}