/*

  * file: Lab4_6_8.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 4: Problem 6.8
  * due date: February 28, 2017
  * version: 1.3

 */
//java.text import for formatting decimals
import java.text.*;

//create new public class "Lab4_6_8"
public class Lab4_6_8{
  //main statement
  public static void main(String[] args){
    //creates double variables cInput, to begin the celsius input values 
    //and fInput to begin the fahrenheit input values
    double cInput=40;
    double fInput=120;
    
    //print statements print out original celsius and farhenheit values 
    //as well as their converted values in a table-like format  
    System.out.println("Celsius        Fahrenheit        "+        
    "|        Fahrenheit        Celsuis");

    //for loop to create the long line under table headings 
    for(int i=0;i<68;i++){
      System.out.print("_");
    }

    System.out.println("");

    //prints out results into the table-like format from 40 as the cInput
    //to as low as 30 for the fInput
    for(cInput=40;cInput>30;cInput--){
      System.out.println(cInput + "           " + 
      celsiusToFahrenheit(cInput) + "              " + "|" + "        " +
      fInput + "              " + fahrenheitToCelsius(fInput));

      fInput-=10;
    }

  }
    
  //convert from Celsius to Fahrenheit
  public static double celsiusToFahrenheit(double celsius){
  	//conversion equation 
  	double fConversion = ((9.0/5.0)* celsius)+32; 
  	//formatting to trim decimal to one decimal place
  	DecimalFormat df = new DecimalFormat("#.#");
  	//newly formatted variable 
  	double trimmedF = Double.parseDouble(df.format(fConversion));
  	//returns converted and trimmed value
  	return trimmedF; 
  }

  //convert from Fahrenheit to Celsius 
  public static double fahrenheitToCelsius(double fahrenheit){
  	//conversion equation
  	double cConversion = ((5.0/9.0) * (fahrenheit-32));
  	//formatting to trim decimal to two decimal places
  	DecimalFormat df = new DecimalFormat("#.##");
  	//newly formatted variable 
  	double trimmedC = Double.parseDouble(df.format(cConversion));
  	//returns converted and trimmed value
  	return trimmedC; 
  }


}