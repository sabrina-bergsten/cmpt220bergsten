/*

  * file: Lab1_2_6.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 1: Problem 2.6
  * due date: January 31, 2017
  * version: 1.3

 */
//Scanner import to allow for user input
import java.util.Scanner;

public class Lab1_2_6{
  public static void main(String[] args){
  	//creates scanner for user input
    Scanner input = new Scanner(System.in);
    //User input prompt
    System.out.print("Enter an integer inbetween 0 and 1000 ");
    //saves user input as integer called num
    int num = input.nextInt();
    //finds the last integer of the inputted num
    int lastInt = num%10;
    //finds the second integer by removing the third and 
    //then separating the last 
    int secondInt = (num/10)%10;
    //finds the first integer by removing the 2nd and 3rd
    int firstInt = num/100;

    //adds all the integers together 
    int integerSum = firstInt+secondInt+lastInt;
	  
    System.out.println("The sum of the digits is " + integerSum);
  }
}