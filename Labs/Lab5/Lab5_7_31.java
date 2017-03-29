/*

  * file: Lab5_7_31.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 5: Problem 7.31
  * due date: March 28, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;


//left off by initializing the sort method (at the bottom) and creating 
//two working array filling loops. 
//just need to figure out how to merge

//create new public class "Lab5_7_31"
public class Lab5_7_31{
  //main statement
  public static void main(String[] args){
  	//create double variable inputNum to save future user input
  	int inputNum;
  	//creates new scanner to collect user input 
  	Scanner input = new Scanner(System.in);

  	//prompts user for numbers to add to first list
  	System.out.println("Enter List 1: ");

    //sets first inputted integer as the length of inputList1
    int list1Length = input.nextInt();

    //creates empty new array, inputlist1
    int [] inputList1 = new int [list1Length];

  	//beginning of for loop to add each inputted number to the array
  	//array runs as many times as there are elements in the array
  	for(int i=0; i<list1Length; i++){
  	  //sets inputNum equal to userInput
  	  inputNum = input.nextInt();
  	  //sets array element at position i equal to inputNum 
  	  inputList1[i] = inputNum;
  	}
   
    System.out.println("Enter List 2: "); 

    //sets first inputted integer for the 2nd round equal to 
    //length of inputlist2
    int list2Length = input.nextInt();

    //creates new array, list2 
    int [] inputList2 = new int [list2Length];

    for(int n=0; n<list2Length; n++){
      //sets inputNum equal to userInput
      inputNum = input.nextInt();
      //sets array element at position i equal to inputNum 
      inputList2[n] = inputNum;
    }

    
    for(int x=0; x<inputList1.length;x++){
      System.out.print(" " + inputList1[x]);
    }

    System.out.println();

    for(int y=0; y<inputList2.length;y++){
      System.out.print(" " + inputList2[y]);
    }

    merge(inputList1,inputList2);
  }

  public static int[] merge(int[] list1, int[] list2){
    int [] finalList = new int [(list1.length)+(list2.length)];
    //int p = 0;
    int j = 0;
    int k = 0; 
      for(int p=0;p<finalList.length;p++){
        if(list1[k]<list2[j]){
          finalList[p] = list1[k];
          p++;
        }
        else{
          finalList[p] = list2[j]; 
          j++;
          p++;
        }
    }
    
  }
}