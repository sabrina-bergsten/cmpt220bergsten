/*

  * file: Lab2_4_26.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 2: Problem 4.26
  * due date: February 7th, 2017
  * version: 1.3

 */
//import Scanner util 
import java.util.Scanner;

//create new public class "Lab2_4_26"
public class Lab2_4_26{
  //main statement
  public static void main(String[] args){
  	//Create a Scanner
  	Scanner input = new Scanner(System.in);

  	//Receive the amount from user
  	System.out.println("Enter an amount in double, for example 11.56");
  	String amount = input.nextLine();

  	//finds the index value of the decimal point
  	int decimalPoint = amount.indexOf("."); 

  	//everything to the left of the decimal point is a whole dollar
  	String numberOfOneDollars = amount.substring(0,decimalPoint);

  	//sets everything to the right of the decimal point equal to 
  	//the remaining change to be divided up later
  	String remainingAmount = amount.substring(decimalPoint+1,(amount.length()));
  	int remainingChange = Integer.parseInt(remainingAmount);
  	
  	//Find the number of quarters in the remaining amt 
  	int numberOfQuarters = remainingChange / 25;
  	remainingChange = remainingChange % 25; 

  	//Find the number of dimes in the remaining amt
  	int numberOfDimes = remainingChange / 10;
  	remainingChange = remainingChange % 10;

  	//Find the number of nickels in the remaining amt
  	int numberOfNickels = remainingChange / 5;
  	remainingChange = remainingChange % 5; 

  	//Find the number of pennies in the remaining amt
  	int numberOfPennies = remainingChange;

  	//Display results 
  	System.out.println("Your amount " + amount + " consists of ");
  	System.out.println("    " + numberOfOneDollars + " dollars");
  	System.out.println("    " + numberOfQuarters + " quarters");
  	System.out.println("    " + numberOfDimes + " dimes");
  	System.out.println("    " + numberOfNickels + " nickels");
  	System.out.println("    " + numberOfPennies + " pennies");

    }
}