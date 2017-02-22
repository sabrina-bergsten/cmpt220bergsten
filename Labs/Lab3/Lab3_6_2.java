/*

  * file: Lab3_6_2.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 3: Problem 6.2
  * due date: February 21, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab3_6_2"
public class Lab3_6_2{
  //main statement
  public static void main(String[] args){
    //Prompt the user to fill in input fields 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer to find the sum of its digits");

    //long variable, userInputNum, used to save the user input
    long userInputNum = input.nextLong();
      
    //prints result of sumDigits method
    System.out.println("The total of your digits is " 
    + sumDigits(userInputNum));
  }
  //beginning of new method, sumDigits with parameter long n 
  public static int sumDigits(long n){
  	//convert n from long to integer
    int num = (int) n;

    //declaration of digitSum variable to hold sum of all digits 
  	int digitSum = 0;
  	//declaration of lastDigit variable to temporarily hold 
  	//the last digit of the number 
  	int lastDigit = 0;
  	//beginning of while loop 
  	while((num>0)){
  	  //while num is greater than 0, set lastDigit equal to 
  	  //num%10 and add it to the digitSum 
  	  lastDigit = num%10; 
  	  digitSum += lastDigit; 
  	  //after adding lastDigit to digitSum, delete the last digit by 
  	  //dividing by 10
  	  num = num/10; 
  	}
  	//once num = 0, return the digitSum
  	return digitSum;
  }
}