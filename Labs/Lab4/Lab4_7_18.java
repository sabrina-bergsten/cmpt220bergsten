/*

  * file: Lab4_7_18.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 4: Problem 7.18
  * due date: February 28, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;


//create new public class "Lab4_7_18"
public class Lab4_7_18{
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

    //calls sortArray function with arrayNum as its parameter
    sortArray(arrayNum);

    //for loop runs through each element of the newly sorted 
    //array and prints out each element in order
    for(int x=0; x<arrayNum.length;x++){
      System.out.println(" " + arrayNum[x]);
    }

  }

  //declaration of void method sortArray with double array 
  //as a parameter 
  public static void sortArray(double[] array ){
    /*creates double variable temp, to temporarily hold 
    //the value to be swapped later in the for loops so no values
    are lost*/
    double temp;
    //first for loop starts for the first iteration of bubble sort 
    for(int n=0; n<(array.length); n++){
      //nested for loop goes through the array from the first to the
      //last element and swaps !!neighbors!! who are not in order
      for(int j=1; j < (array.length-n); j++){
        //checks to see if the element to the left of the element 
        //in "j" position is less than that in the j position
        if(array[j-1]>array[j]){
          //if so perform the swap
          temp = array[j-1]; 
          array[j-1] = array[j];
          array[j] = temp;
        }

      }

    }
  }
  
}
