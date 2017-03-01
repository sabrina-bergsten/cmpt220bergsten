/*

  * file: Lab4_7_9.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 4: Problem 7.9
  * due date: February 28, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab4_7_9"
public class Lab4_7_9{
  //main statement
  public static void main(String[] args){
    //create double variable inputNum to save future user input
    double inputNum;
    //creates empty new array, arrayNum with size 10
    double [] arrayNum = new double [10];
    //creates new scanner to collect user input 
    Scanner input = new Scanner(System.in);
    //prompts user for 10 numbers
    System.out.println("Enter 10 numbers: ");

    //beginning of for loop to add each inputted number to the array
    //array runs as many times as there are elements in the array
    for(int i=0; i<arrayNum.length; i++){
      //sets inputNum equal to userInput
      inputNum = input.nextDouble();
      //sets array element at position i equal to inputNum 
      arrayNum[i] = inputNum;
    }
    
    //print statement prints out the result of min method with arrayNum
    //as input
    System.out.println("The minimum number is: " + min(arrayNum));
    
  }
  //beginning of min method to find minimum array element
  public static double min(double[]array){
    //creates integer variable, minimum, and sets it equal to zero
    int minimum=0; 
    //for loop that runs as many times as there are elements in array
    for(int n=1;n<array.length;n++){
      //if element at (variable) minimum position is greater than
      //or equal to element at the "nth" position set minimum equal to n
      if(array[minimum]>=array[n])
        minimum = n; 
    }

    //once for loop runs through each element in array return the value 
    //of array[minimum]
    return array[minimum];

  }

}