/*

  * file: Lab1_2_1.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 1: Problem 2.1
  * due date: January 31, 2017
  * version: 1.3

 */
//Scanner import to allow for user input
import java.util.Scanner;

public class Lab1_2_1{
  public static void main(String[] args){
    //User Scanner to allow user input in the code
    Scanner input = new Scanner(System.in);
    //User input prompt
    System.out.print("Enter a degree in Celsius ");
    //saves user input as a double variable called celsiusValue
    double celsiusValue = input.nextDouble();

    //calculate fahrenheit using the fahrenheit formula and save it to 
    //the fahrenheit double variable
    double fahrenheitValue = ((9.0/5) * celsiusValue) + 32;

    //print out final statement including celcius input value and it's
    //fahrenheit conversion  
    System.out.println(celsiusValue + " Celsius is " + fahrenheitValue +
     " fahrenheit");

  }
}