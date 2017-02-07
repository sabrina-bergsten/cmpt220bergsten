/*

  * file: Lab2_4_15.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 2: Problem 4.15
  * due date: February 7th, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab2_4_15"
public class Lab2_4_15{
  //main statement
  public static void main(String[] args){
    
    //Prompt the user to fill in input fields 
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter: ");

    int keyPadNum = 0;
    //integer variable, userCode, used to save the user input
    char userLetter = input.next().charAt(0);

    //integer variable, letterCode, takes the char's ASCII value 
    int letterCode = ((int)userLetter);

    //if the letter is capitalized, this converts it to its lower 
    //case 
    if(letterCode<97){
      letterCode += 32;
    }

    //beginning of switch statement for each lowercase 
    //letter in the alphabet
    switch(letterCode){
      case 97: keyPadNum = 2; break;
      case 98: keyPadNum = 2; break;
      case 99: keyPadNum = 2; break;
      case 100: keyPadNum = 3; break;
      case 101: keyPadNum = 3; break;
      case 102: keyPadNum = 3; break;
      case 103: keyPadNum = 4; break;
      case 104: keyPadNum = 4; break;
      case 105: keyPadNum = 4; break;
      case 106: keyPadNum = 5; break; 
      case 107: keyPadNum = 5; break;
      case 108: keyPadNum = 5; break;
      case 109: keyPadNum = 6; break;
      case 110: keyPadNum = 6; break;
      case 111: keyPadNum = 6; break;
      case 112: keyPadNum = 7; break;
      case 113: keyPadNum = 7; break;
      case 114: keyPadNum = 7; break;
      case 115: keyPadNum = 7; break;
      case 116: keyPadNum = 8; break;
      case 117: keyPadNum = 8; break;
      case 118: keyPadNum = 8; break;
      case 119: keyPadNum = 9; break;
      case 120: keyPadNum = 9; break;
      case 121: keyPadNum = 9; break;
      case 122: keyPadNum = 9; break;
    }

    System.out.println(keyPadNum);
  }
}