/*

  * file: Lab5_7_32.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 5: Problem 7.32
  * due date: March 28, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab5_7_32"
public class Lab5_7_32{
  //main statement
  public static void main(String[] args){
  	//create double variable inputNum to save future user input
  	int inputNum;
  	//creates new scanner to collect user input 
  	Scanner input = new Scanner(System.in);

  	//prompts user for numbers to add to first list
  	System.out.println("Enter List: ");

    //sets first inputted integer as the length of inputList
    int listLength = input.nextInt();

    //creates empty new array, inputlist
    int [] inputList = new int [listLength];

  	//beginning of for loop to add each inputted number to the array
  	//array runs as many times as there are elements in the array
  	for(int i=0; i<listLength; i++){
  	  //sets inputNum equal to userInput
  	  inputNum = input.nextInt();
  	  //sets array element at position i equal to inputNum 
  	  inputList[i] = inputNum;
  	}

    //runs the partition method with inputList as the parameter 
    partition(inputList);

  }
  //start of partition method 
  public static int partition(int[] list){
    //creates empty list to later fill in the correct order
    //new partitionedList has same length as whatever list was sent in by 
    //the method
    int [] partitionedList = new int [list.length];

    //sets pivot equal to the first element in the list
    int pivot = list[0];
    //sets pIndex, or the index of the pivot equal to zero
    int pIndex = 0; 
    //for loop to loop through entirity of list
    for(int n=1;n<list.length;n++){
      //if pivot is greater than the nth element of the list then 
      //add nth element to the new empty list 
      if(pivot>list[n]){
        partitionedList[pIndex] = list[n];
        pIndex++;
      }
    }
    //once all numbers lower than the pivot are added to the new list 
    //add the pivot value to the list 
    partitionedList[pIndex]=pivot;
    //set this final index of the pivot as the value of finalIndex to return
    //at end of method
    int finalIndex = pIndex; 
    //add one to pIndex
    pIndex++;
    //for loop to go through entire list passed in and add all elements 
    //with values higher than pivot's to the new list 
    for(int j=1;j<list.length;j++){
      if(pivot<list[j]){
        partitionedList[pIndex] = list[j];
        pIndex++;
      } 
    }
    //once new list is entirely filled in proper order print out each element
    System.out.print("After the partition, the list is ");
    for(int y=0; y<list.length;y++){
      System.out.print(" " + partitionedList[y]);
    }
    System.out.println();
    //returns the final index of the pivot value 
    return finalIndex; 
  }
}