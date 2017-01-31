/*

  * file: Lab1_part2.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 1: Part 2 Calculate Percentage Total Grade
  * due date: January 31, 2017
  * version: 1.3

 */
//Scanner import to allow for user input
import java.util.Scanner;

public class Lab1_part2{
  public static void main (String[]args){
	System.out.println("Please enter the following as percentage...");

	//creates new Scanner 1 for user input: midterm exam score
	Scanner input = new Scanner(System.in);
	//User input prompt: midterm exam score
    System.out.print("Midterm Exam: ");
    //saves user input as double variable, midterm
    double midterm = input.nextDouble();

    //creates new second Scanner  for user input: final exam score
	Scanner input2 = new Scanner(System.in);
	//User input prompt: final exam score
    System.out.print("Final Exam: ");
    //saves user input as double variable, finalExam
    double finalExam = input.nextDouble();

    //creates new third Scanner for user input: projects score
	Scanner input3 = new Scanner(System.in);
	//User input prompt: Projects
    System.out.print("Projects: ");
    //saves user input as double variable, projects
    double projects = input.nextDouble();

    //creates new fourth Scanner for user input: homeworks and labs
	Scanner input4 = new Scanner(System.in);
	//User input prompt: homework and labs
    System.out.print("Homework and Labs: ");
    //saves user input as double variable, homework
    double homework = input.nextDouble();

    //create finalGrade variable by adding all scores, including homework
    //twice (one time for hw one time for labs) and dividing by 5 to find
    //the average of all grades
    double finalGrade = (midterm+finalExam+projects+homework+homework)/5.0;

    System.out.println("Your final grade is " + (int)finalGrade + "%");
	}
}