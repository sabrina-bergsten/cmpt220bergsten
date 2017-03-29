/*

  * file: Driver_prj1
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Project 1 
  * due date: March 28, 2017
  * version: 1.3

 */

//Scanner Import
import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    //Scanner to prompt user input
    Scanner input = new Scanner(System.in);
    
    //saves 1st user inputted integer as variable i
    int input1 = input.nextInt();

    //saves 2nd user inputted int. as variable j
    int input2 = input.nextInt();
    
    //Creates a range for the arrays/matrices to operate within
    //creates a new array of doubles labeled arr1
    double[] arr1 = new double[input1];
 	
 	//creates second new array of doubles, arr2
    double[] arr2 = new double[input2];
    

    //adds data to both arrays, arr1 and arr2 as it is inputted
    //by the user. 
    for (int n = 0; n < input1; n++){
      arr1[n] = input.nextDouble();
    }
    for (int p = 0; p < input2; p++){
      arr2[p] = input.nextDouble();
    }
    
    //Gets the final convolved matrix from convolveVectors method 
    double[] arr3 = convolveVectors(arr1, arr2);
    
    //correctly outputs the result of the convolveVectors method in proper
    //format 
    for (int x = 0; x < arr3.length - 1; x++) {
      System.out.printf("%d ", new Object[] { Long.valueOf(Math.round(arr3[x])) });
    }
    System.out.printf("%d\n", new Object[] { Long.valueOf(Math.round(arr3[(arr3.length - 1)])) });
  }
  public static double[] convolveVectors(double[] vector1, double[] vector2) {
    
    double[] vFinal = new double[vector1.length + vector2.length - 1];
    
    //puts the vectors given in the matrices through the convolution 
    //equation
    for (int i = 0; i < vFinal.length; i++){
      vFinal[i] = 0.0; 
      for (int j = 0; j < vector2.length; j++) {
        if ((i - j >= 0) && (i - j < vector1.length)) {
          vFinal[i] += vector1[(i - j)] * vector2[j];
        }
      }
    }
    //returns the final vector or third matrix, result. 
    return vFinal;
  }
}