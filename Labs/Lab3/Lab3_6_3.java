/*

  * file: Lab3_6_3.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 3: Problem 6.3
  * due date: February 21, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab3_6_3"
public class Lab3_6_3{
  //main statement
  public static void main(String[] args){
  	//Prompt the user to fill in input fields 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer to find out if it's a palindrome."
    + "The program will return true if it is, and false if it is not.");

    //integer variable, userInputNum, used to save the user input
    int userInputNum = input.nextInt();

    //print statement prints out the result of userInputNum in the
    //isPalindrome function 
    System.out.println((isPalindrome(userInputNum)));
  }

  //return the reversal of an integer i.e., reverse(456) returns 654
  public static int reverse(int number){
  	//creates lastDigit variable and reverseNum variables
  	int lastDigit = 0;
  	int reverseNum = 0;
  	
  	//while number inputted is greater than zero 
  	while(number>0){
  	  //multiply reverseNum by 10 so the next digit added can be 
  	  //in the ones place 
  	  reverseNum = reverseNum*10;
  	  //find the last digit and save to lastDigit variable
  	  lastDigit = number%10; 
  	  //last digit is added to reverseNum variable
  	  reverseNum = reverseNum+lastDigit;
  	  //originally inputted number is divided by 10 to delete the last 
  	  //digit
  	  number = number/10; 
  	}

  //returns final reversed number 
  return reverseNum;
  }
  //return true if number is a palindrome 
  public static boolean isPalindrome(int number){
  	
  	//creates boolean variable answer 
  	boolean answer;
  	//if the reversed number is equal to the original return
  	//true
  	if((reverse(number))==number){
  	  answer = true;
  	}
  	//if the reversed number is not equal to the original 
  	//return false
  	else{
  	  answer = false;
  	}
  	//returns answer
  	return answer;
  }
}