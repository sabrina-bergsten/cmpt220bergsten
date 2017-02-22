/*

  * file: Lab3_5_1.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 3: Problem 5.1
  * due date: February 21, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab3_5_1"
public class Lab3_5_1{
  //main statement
  public static void main(String[] args){
    double sum = 0; //creates integer variable sum 
  	int negNumCount=0; //creates integer variable negNumCount to count all
  					 //negative numbers inputted
  	int posNumCount=0; //creates integer variable posNumCount to count all
  					 //positive numbers inputted
  	double averageNum=0; //creates double variable averageNum to calculate
  						 //the average of all inputted numbers
  	int userInputNum;

    do{
      //Prompt the user to fill in input fields 
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an integer, the input ends if it is 0: ");

      //integer variable, userInputNum, used to save the user input
      userInputNum = input.nextInt();
      
      //if the inputted number is greater than 0, add 1 to 
      //positive number count
      if(userInputNum>0){
        posNumCount++;
      }
      //otherwise, if the inputted number is less than 0, add 1 
      //to the negative number count
      else if(userInputNum<0){
      	negNumCount++;
      }

      //adds inputted number to overall sum
      sum+= userInputNum;

    } while (userInputNum!=0); //stops loop if userInputNum = 0
    //calculates average of all numbers 
    averageNum = sum/(posNumCount+negNumCount);

    //checks if the only number entered is 0
    if((negNumCount==0)&&(posNumCount==0)){
    	System.out.println("No numbers are entered except 0");
    }
    //if not print out all data collected 
    else{		
	  System.out.println("The number of positives is " + posNumCount);
      System.out.println("The number of negatives is " + negNumCount);
      System.out.println("The total is " + sum);
      System.out.println("The average is " + averageNum);
    }

  }
}