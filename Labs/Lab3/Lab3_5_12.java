/*

  * file: Lab3_5_12.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 3: Problem 5.12
  * due date: February 21, 2017
  * version: 1.3

 */

//create new public class "Lab3_5_12"
public class Lab3_5_12{
  //main statement
  public static void main(String[] args){
    //create integer variable n and set to zero
    int n = 0; 
    //beginning of while loop
    while((Math.pow(n, 2))<12000){
    	//adds 1 to n while its square is less than 12,000
    	n++; 
    }
    //loop ends after n squared is greater than 12,000
    //prints out final number, n
    System.out.println("The smallest number in which its " + 
    "square is larger than 12,000 is " + n);
  }
}