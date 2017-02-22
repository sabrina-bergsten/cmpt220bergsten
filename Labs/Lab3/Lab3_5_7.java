/*

  * file: Lab3_5_7.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 3: Problem 5.7
  * due date: February 21, 2017
  * version: 1.3

 */

//create new public class "Lab3_5_7"
public class Lab3_5_7{
  //main statement
  public static void main(String[] args){
    //variable that holds the original (current) tuition
  	double currentTuition = 10000; 
  	//double totalTuition = 0;
  	System.out.printf("Tuition %.2f", find_4_years_tuition(calc_10_Year_Tuition(currentTuition)));
  }
  	//creates new function for calculating tuition rates 10 years
  	//in the future, with amount as a paramater
  	public static double calc_10_Year_Tuition(double amount){
  	  //for loop to calculate the price of tuition after 10 years
  	   	for(int i=0;i<10;i++){
  		  //sets amount equal to prior amount plus 5 percent
  		  amount = amount + (amount*.05);
  		}
  		//returns final amount after running 10 times
  		return amount;
  	}
  	//creates new function to calculate the total cost of four years
  	//worth of tuition after the 10th year
  	public static double find_4_years_tuition(double newTuition){
      double totalTuition = 0;
  		//for loop calculates new tuition and adds it to the 4 year 
  		//tuition total
  		for(int n=0;n<4;n++){
  		  newTuition = newTuition + (newTuition*.05);
  		  totalTuition += newTuition;
  		}

  	  return totalTuition;
  	} 
}