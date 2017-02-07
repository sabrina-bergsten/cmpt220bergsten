/*

  * file: Lab2_3_4.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 2: Problem 3.4
  * due date: February 7th, 2017
  * version: 1.3

 */
import java.util.Scanner;

//create new public class "Lab2_3_4"
public class Lab2_3_4{
  //main statement
  public static void main(String[] args){
  	//create random variable randNum with range 1-12 inclusive
  	int randNum = (int)((Math.random()*12)+1);
  	  //Start of switch statement
  	  switch(randNum){
  	    case 1: System.out.println("January"); break; 
  	    case 2: System.out.println("February"); break;
  	    case 3: System.out.println("March"); break;
  	    case 4: System.out.println("April"); break;
  	    case 5: System.out.println("May"); break;
  	    case 6: System.out.println("June"); break;
  	    case 7: System.out.println("July"); break;
  	    case 8: System.out.println("August"); break;
  	    case 9: System.out.println("September"); break;
  	    case 10: System.out.println("October"); break;
  	    case 11: System.out.println("November"); break;
  	    case 12: System.out.println("December"); break; 
  	  }
  	}
  }
