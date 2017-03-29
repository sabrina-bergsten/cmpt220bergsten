/*

  * file: Lab5_8_13.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 5: Problem 8.13
  * due date: March 28, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab5_8_13"
public class Lab5_8_13{
  //main statement
  public static void main(String[] args){
  	Scanner input = new Scanner(System.in);
  	System.out.println("Enter the number of rows and columns of the array: ");
  	int r = input.nextInt();
  	int c = input.nextInt();

  	double[][] arr1 = new double[r][c];

  	System.out.println("Enter the array: ");
  	  for(int j=0; j<arr1.length; j++){
  	  	for(int k=0; k<arr1[j].length; k++){
  	  	  arr1[j][k] = input.nextInt();
  	  	}
  	  }

  	int[] location = locateLargest(arr1);

  	System.out.println("The location of the largest number is at: " + location[0]
  	+ ", " + location[1] + " .");
  }
  
  public static int[] locateLargest(double[][] a){
  	double maximum = 0;
  	int[] array = new int[2];
  	array[0] = 0;
  	array[1] = 0;
  	  for(int n=0;n<a.length;n++){
  	  	for(int p=0;p<a[n].length;p++){
  	  	  if(maximum<a[n][p]){
  	  	  	array[0] = n;
  	  	  	array[1] = p;
  	  	  	maximum = a[n][p];
  	  	  }
  	  	}
  	  }
  	return array;  
  }
}