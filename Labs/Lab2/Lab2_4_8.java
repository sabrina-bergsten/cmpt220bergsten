/*

  * file: Lab2_4_8.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 2: Problem 4.8
  * due date: February 7th, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab2_4_8"
public class Lab2_4_8{
  //main statement
  public static void main(String[] args){
    
    //Prompt the user to fill in input fields 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an ASCII code: ");

    //integer variable, userCode, used to save the user input
    int userCode = input.nextInt();

    //converts ASCII code from an integer to a char 
    //variable, character. 
    char character = ((char)userCode); 

    //print out converted char 
    System.out.println("The character for ASCII code " + userCode + " is " + character);
  }
}


    
