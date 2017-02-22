/*

  * file: Lab3_5_13.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 3: Problem 5.13
  * due date: February 21, 2017
  * version: 1.3

 */

//create new public class "Lab3_5_13"
public class Lab3_5_13{
  //main statement
  public static void main(String[] args){
  	//create integer variable n and set to zero
    int n=0; 
    //beginning of while loop
  	while((Math.pow(n, 3))<12000){
      //adds 1 to n while its cube is less than 12,000
  	 	n++;
  	}
    //prints out final number, n
  	System.out.println("The largest number in which it's cube is smaller"
  	+ "than 12,000 is " + n);
  }
}