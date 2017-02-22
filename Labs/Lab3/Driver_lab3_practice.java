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
import java.text.*;

//create new public class "Driver_lab3"
public class Driver_lab3{
  //main statement
  public static void main(String[] args){
    //while loop so users can enter as many sets of numbers as they want
    while(true){
      //Prompt the user to fill in input fields 
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your x1 x2 y1 y2 and norm p value"
        + " i.e. 1.0 1.0 2.0 2.0 2.0");

      //double variable, userX1, used to save the user input of the 
      //first x coordinate
      double userX1 = input.nextDouble();
      //checks if users input is 0, if so break
      if(userX1==0){
        break;
      }
      //first Y coordinate
      double userY1 = input.nextDouble();

      //prompts user for second X coordinate
      double userX2 = input.nextDouble();

      //prompts user for second Y coordinate
      double userY2 = input.nextDouble();

      //prompts user for norm p value
      double userP = input.nextDouble();

      //print statement runs calcP_Norm_Distance method with 
      //all user input parameters
      System.out.println(calcP_Norm_Distance(userX1,userY1,userX2,userY2,userP));
    }
  }
  
  //calcP_Norm_Distance method created to find the p-norm distance between
  //pairs of points for a given value of p
  public static double calcP_Norm_Distance(double x1, double y1,
  double x2, double y2, double pValue){
    
    //first step: calculate the absolute value of the difference
    //of x1 and x2
    double abs_of_diff_x = Math.abs((x1-x2)); 
    //next find the absolute value of the difference of y1 and y2
    double abs_of_diff_y = Math.abs((y1-y2));

    //calculate p-norm distance using these absolute values 
    //and the p-norm distance formula
    double pNormDistance = (Math.pow(((Math.pow(abs_of_diff_x, pValue))+
    (Math.pow(abs_of_diff_y, pValue))), (1/pValue)));

    //formats pNormDistance so the decimal truncates after 10 digits
    //past the decimal point
    DecimalFormat df = new DecimalFormat("#.##########");
    //saves newly formatted answer as double finalDistance
    double finalDistance = Double.parseDouble(df.format(pNormDistance));

    //returns finalDistance
    return finalDistance;

  }
}

