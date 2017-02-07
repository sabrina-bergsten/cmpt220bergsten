/*

  * file: Lab2_4_1.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 2: Problem 4.1
  * due date: February 7th, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab2_4_1"
public class Lab2_4_1{
  //main statement
  public static void main(String[] args){
    
    //Prompt the user to fill in input fields 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length from the center of your pentagon to its vertex.");
    //integer variable, r, holds value inputted by user  
    double r = input.nextDouble();

    //calculate length of one side, s, using given formula
    double s = ((2*r)*(Math.sin(.2*Math.PI)));

    //calculate area of pentagon 
    double area = (5*(Math.pow(s,2)))/(4*Math.tan(.2*Math.PI));

    //truncate double area variable 
    area = (Math.floor(area * 100) / 100);

    //print out final answer
    System.out.println("The area of the pentagon is " + (area));
  }
}
