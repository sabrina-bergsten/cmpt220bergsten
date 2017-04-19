/*

  * file: lab6_9_13.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 6
  * due date: April 18, 2017
  * version: 1.3

 */
/*UML Diagram for problem 9.1 
--------------------------------------------
        Location                           |
--------------------------------------------
+row: int                                  |
+column: int                               |
+maxValue: double                          |
--------------------------------------------
+Location():void                           |
+Location(int:int, int:int, double:double) | 
+locateLargest(double[][]): int, int, double|
--------------------------------------------
*/

//Scanner Import
import java.util.Scanner;

public class lab6_9_13 {
  public static void main(String[] args) {
  	//prompt user for input
  	System.out.print("Enter the number of rows and columns in the array: ");

  	//Scanner to prompt user input
    Scanner input = new Scanner(System.in);
    //saves 1st user inputted integer as userRow 
    int userRow = input.nextInt();
    //saves 2nd user inputted integer as userColumn
    int userColumn = input.nextInt();

    //prompt user for array
    System.out.println("Enter the array:");
    //saves empty userArray with previously inputted # of rows and col's
    double [][] userArray = new double[userRow][userColumn];
    //for loop to add user input to the 2d array 
    for(int i=0;i<userArray.length;i++){
      for(int n =0; n<userArray[i].length;n++){
 		userArray[i][n] = input.nextDouble();
      }
    }

    //create a new location object equal to userArray put into 
    //Location's locateLargest method 
    Location finalSolution = Location.locateLargest(userArray);
    
    //final print of solution 
    System.out.println("The location of the largest element is " + 
    	finalSolution.maxValue + " (" + finalSolution.row + ", " + 
    	finalSolution.column + ")");
  }


}
//initialization of Location class 
class Location{
  //creates row, column, and maxValue variables
  int row; 
  int column; 
  double maxValue; 
  
  //constructs location object, because I'm a good programmer!
  Location(){

  }
  //
  public Location(int row, int column, double maxValue){
  	this.row = row;
  	this.column = column;
  	this.maxValue = maxValue;
  }
  //beginning of locateLargest method with 2d array as a parameter
  public static Location locateLargest(double[][] a){
    //row, column, and maxValue are variables in the method
    int row=0;
    int column=0;
    double maxValue = a[row][column]; 
    //for loop to go through the array by row and then column
    for(int i=0;i<a.length;i++){
      for(int n=0;n<a[i].length;n++){
        //asks if each element of the array is larger than
        //the previous maxValue
        if(a[i][n]>maxValue){
      	  //if element is larger than previous maxValue then set maxValue
          //equal to this element
      	  maxValue=a[i][n];
      	  //set row and column equal to the new elements row and column
      	  //location to refer to during the solution's print
      	  row = i;
      	  column = n;
        }
      }
    }
    //return the new Location object with the largest element and its
    //row and column
    return new Location(row,column,maxValue);	
  }
}