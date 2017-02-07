/*

  * file: Lab2_part2.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 2: Part 2 Programming Excercise
  * due date: February 7th, 2017
  * version: 1.3

 */
//import Scanner util 
import java.util.Scanner;

//create new public class "Lab2_part2"
public class Lab2_part2{
  //main statement
  public static void main(String[] args){
  	//Create a Scanner to collect user input 
  	Scanner input = new Scanner(System.in);

  	//prompts user for grade input
  	System.out.println("Please Enter the Following as Percentages: ");
    
    //prompts user for grade and saves it as an int
    System.out.print("midterm exam: ");
  	int midtermGrade = input.nextInt();

    //prompts user for grade and saves it as an int
    System.out.print("final exam: ");
    int finalGrade = input.nextInt();

    //prompts user for grade and saves it as an int
    System.out.print("projects: ");
    int projects = input.nextInt();

    //prompts user for grade and saves it as an int
    System.out.print("homework and labs: ");
    int homework = input.nextInt();

    //convert to letter grade using if statements
    int averageGrade = (midtermGrade+finalGrade+projects+homework+homework)/5;

    System.out.println("average: " + averageGrade);

    if(averageGrade>=95){
      System.out.println("Your final grade is: A");
    }
    else if(averageGrade>=90){
      System.out.println("Your final grade is: A-");
    }
    else if(averageGrade>=87){
      System.out.println("Your final grade is: B+");
    }
    else if(averageGrade>=83){
      System.out.println("Your final grade is: B");
    }
    else if(averageGrade>=80){
      System.out.println("Your final grade is: B-");
    }
    else if(averageGrade>=77){
      System.out.println("Your final grade is: C+");
    }
    else if(averageGrade>=73){
      System.out.println("Your final grade is: C");
    }
    else if(averageGrade>=70){
      System.out.println("Your final grade is: C-");
    }
    else if(averageGrade>=65){
      System.out.println("Your final grade is: D+");
    }
    else if(averageGrade>=60){
      System.out.println("Your final grade is: D");
    }
    else if(averageGrade<60){
      System.out.println("Your final grade is: F");
    }
  }
}