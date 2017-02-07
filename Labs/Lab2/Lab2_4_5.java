/*

  * file: Lab2_4_5.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 2: Problem 4.5
  * due date: February 7th, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab2_4_5"
public class Lab2_4_5{
  //main statement
  public static void main(String[] args){
    
    //Prompt the user to fill in input fields 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of sides your polygon has:");

    //double variable, n, holds number of sides  
    double n = input.nextDouble();
    //second user prompt for length of side
    System.out.println("Enter the length of a side: ");
    //saves side length as double variable s
    double s = input.nextDouble();

    //use regular polygon area formula to calculate area of user's polygon
    double area = ((n*(Math.pow(s,2)))/(4*(Math.tan((1/n)*(Math.PI)))));

    //prints out area 
    System.out.println("The area of your regular polygon is " + area);
  }
}

