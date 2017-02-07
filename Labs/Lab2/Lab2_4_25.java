/*

  * file: Lab2_4_25.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 2: Problem 4.25
  * due date: February 7th, 2017
  * version: 1.3

 */

//create new public class "Lab2_4_25"
public class Lab2_4_25{
  //main statement
  public static void main(String[] args){
    
    //3 random int variables from, for each of the 4 
    //capital letter ASCII codes
    int letterCode1 = 65 + ((int)((Math.random()*25)+1));
    int letterCode2 = 65 + ((int)((Math.random()*25)+1));
    int letterCode3 = 65 + ((int)((Math.random()*25)+1));
    
    //4 random integer variables from 1-9 inclusive
    int randNum1 = ((int)((Math.random()*8)+1));
    int randNum2 = ((int)((Math.random()*8)+1));
    int randNum3 = ((int)((Math.random()*8)+1));
    int randNum4 = ((int)((Math.random()*8)+1));  

    //prints out all of the random numbers, the first three converted 
    //into characters and the last 4 remaining as integers
    System.out.println("Your plate number is " + ((char)letterCode1) + 
    ((char)letterCode2) + ((char)letterCode3) +
    randNum1 + randNum2 + randNum3 + randNum4);

  }
}