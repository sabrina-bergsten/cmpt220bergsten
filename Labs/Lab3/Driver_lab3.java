/*

  * file: Driver_lab3.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 3: Kattis Problem "Different Distances"
  * due date: February 21, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Driver_lab3"
public class Driver_lab3{
  //main statement
  public static void main(String[] args){

    //Prompt the user to fill in input fields 
    Scanner input = new Scanner(System.in);

    //double variable, x1, used to save the user input of the 
    //first x coordinate
    double x1 = input.nextDouble();

    //while loop so users can enter as many sets of numbers as they want
    //as long as the input for x1 doesn not equal 0
    while(x1!=0){
      
      //first Y coordinate input
      double y1 = input.nextDouble();

      //prompts user for second X coordinate
      double x2 = input.nextDouble();

      //prompts user for second Y coordinate
      double y2 = input.nextDouble();

      //prompts user for norm p value
      double pValue = input.nextDouble();

      //calculate p-norm distance using the absolute values 
      //and the p-norm distance formula
      double pNormDistance = (Math.pow(((Math.pow(Math.abs((x1-x2)), pValue))+
      (Math.pow(Math.abs((y1-y2)), pValue))), (1/pValue)));

      //prints and formats pNormDistance so the decimal 
      //truncates after 10 digits past the decimal pt
      System.out.printf("%.10f",pNormDistance);
      //creates a new line before user begins next set of input
      System.out.print("\n");

      //saves x1 as the next number inputted by user after 
      //all the data from the last set is printed
      //basically starts the next loop
      x1 = input.nextDouble();
    }
    //ends program as soon as the while loop condition is false 
    //or when x finally equals 0
    return;
  }
}