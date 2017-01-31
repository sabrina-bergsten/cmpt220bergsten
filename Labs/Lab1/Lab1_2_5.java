/*

  * file: Lab1_2_5.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 1: Problem 2.5
  * due date: January 31, 2017
  * version: 1.3

 */
//Scanner import to allow for user input
import java.util.Scanner;

public class Lab1_2_5{
  public static void main(String[] args){
  	//creates scanner for user input
    Scanner input = new Scanner(System.in);
    //User input prompt
    System.out.print("Enter the subtotal and a gratuity rate: ");
    //saves first user input as subtotal 
    double subtotal = input.nextDouble();
    //saves 2nd user input data as gratuity rate
    double gratuityRateInput = input.nextDouble();
    
    //creates gratuity variable that holds actual gratuity price
    double gratuity = (gratuityRateInput/100)*subtotal;
    //creates total variable that takes into account subtotal + gratuity price
    double total = gratuity+subtotal;

    //final statement prints the final gratuity price and total
    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
  }
}

