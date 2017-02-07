/*

  * file: Lab2_3_8.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 2: Problem 3.8
  * due date: February 7th, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab2_3_8"
public class Lab2_3_8{
  //main statement
  public static void main(String[] args){
  	//first scanner 
    Scanner input = new Scanner(System.in);
    //user prompt asks for integer
    System.out.println("Enter your first integer");
    //saves user input as integer variable userInput1
    int userInput1 = input.nextInt();

    //second scanner 
    Scanner input2 = new Scanner(System.in);
    //user prompt asks for integer
    System.out.println("Enter your second integer");
    //saves user input as integer variable userInput2
    int userInput2 = input2.nextInt();

    //third and final scanner 
    Scanner input3 = new Scanner(System.in);
    //user prompt asks for integer
    System.out.println("Enter your third integer");
    //saves user input as integer variable userInput3
    int userInput3 = input3.nextInt();

    //begin sorting integers 
    //create int variables min, mid, and max as placeholders for 
    //the minimum, mid, and max integers
    int min = 0;
    int mid = 0;
    int max = 0;
    //if userInput1 is less than or equal to userInput2
    if(userInput1<=userInput2){
    	if(userInput1<userInput3){
    	  min = userInput1;
    	  if(userInput2<userInput3){
    	  	mid = userInput2;
    	  	max = userInput3;
    	  }
        }
        else{
        	min = userInput3;
        	mid = userInput1;
        	max = userInput2;
		}
    }
    else if(userInput2<userInput1){ 
 	  if(userInput2<userInput3){
 	  	min = userInput2;
 	  	if(userInput1<userInput3){
 	      mid = userInput1;
 	      max = userInput3;
 	  	}
 	  	else{
 	  	  mid = userInput3;
 	  	  max = userInput1;
 	  	}
 	  }
 	  else{
 	  	min = userInput3;
 	  	mid = userInput2;
 	  	max = userInput1;
 	  }
    }

    //print out numbers in decreasing order
    System.out.println(min + " " + mid + " " + max);
    
  }
}