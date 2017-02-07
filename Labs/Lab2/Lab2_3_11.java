/*

  * file: Lab2_3_11.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 2: Problem 3.11
  * due date: February 7th, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab2_3_11"
public class Lab2_3_11{
  //main statement
  public static void main(String[] args){
    //creates a new scanner to collect user input
    Scanner input = new Scanner(System.in);
    //user prompt asks for a month in numeric units
    System.out.println("Enter a month (by it's number)");
    //saves user input as integer variable userMonth
    int userMonth = input.nextInt();
    //second user prompt asks for year 
    System.out.println("Enter a year");
    //saves second user input as integer variable userYear
    int userYear = input.nextInt();

    //creates null string variable to assign during the switch statement
    String finalMonth = null; 
    //creates integer variable daysInMonth to be determined in switch
    //statement
    int daysInMonth = 0; 

    //start of switch statement
    switch(userMonth){
      case 1: finalMonth = "January "; daysInMonth = 30; break;
      case 2: finalMonth = "February "; daysInMonth = 28; break; 
      case 3: finalMonth = "March "; daysInMonth = 31; break;
      case 4: finalMonth = "April "; daysInMonth = 30; break;
      case 5: finalMonth = "May "; daysInMonth = 31; break;
      case 6: finalMonth = "June "; daysInMonth = 30; break;
      case 7: finalMonth = "July "; daysInMonth = 31; break;
      case 8: finalMonth = "August "; daysInMonth = 31; break;
      case 9: finalMonth = "September "; daysInMonth = 30; break;
      case 10: finalMonth = "October "; daysInMonth = 31; break;
      case 11: finalMonth = "November "; daysInMonth = 30; break;
      case 12: finalMonth = "December "; daysInMonth = 31; break;
    }

    if(((userYear%4)==0) && (finalMonth=="February ")){
      daysInMonth = 29;
    }
   
    System.out.println(finalMonth + userYear + " had " + daysInMonth 
    + " days.");

}
}