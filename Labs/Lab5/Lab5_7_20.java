/*

  * file: Lab5_7_20.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 5: Problem 7.20
  * due date: March 28, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;


//create new public class "Lab5_7_20"
public class Lab5_7_20{
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
  	//statement runs arrayNum through the selectionSortSwap method
  	selectionSortSwap(arrayNum);
  	//for loop prints each element of the array
    for(int x=0; x<arrayNum.length;x++){
      System.out.println(" " + arrayNum[x]);
    }
  }
   //declaration of void method sortArray with double array 
   //as a parameter 
   public static void selectionSortSwap(double[] array ){
     //creates new double variable, largestNum, to compare numbers in the array
     double largestNum; 
     //for loop to run as many times as there are items in the array, starting
     //with the last element
     for(int i=9;i>0;i--){
       //sets largestNum equal to the last item in the array
       largestNum = array[i];
       //creates variable used to save the index of the largest element
       int largestNumIndex = i;

       //for loop compares the largestNum variable to all other elements 
       //in the array
       for(int j= i -1;j>0;j--){
         if(largestNum<array[j]){
           largestNum = array[j];
           largestNumIndex = j; 
         }
       }

       //if largestNumIndex does no longer equal i, switch the two index values 
       if(largestNumIndex != i){
         array[largestNumIndex] = array[i];
         array[i] = largestNum;
       } 
     }
   }
}