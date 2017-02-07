/*

  * file: Lab2_3_15.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 2: Problem 3.15
  * due date: February 7th, 2017
  * version: 1.3

 */
//Scanner import
import java.util.Scanner;

//create new public class "Lab2_3_15"
public class Lab2_3_15{
  //main statement
  public static void main(String[] args){
    //Generate a lottery number 
    int lottery = (int)((Math.random()*899)+100);

    System.out.println("The lottery number is " + lottery);

    //Prompt the user to enter a guess 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your 3 digit lottery pick.");
    int guess = input.nextInt();

    //Gets digits from lottery
    int lotteryDigit1 = lottery/100; 
    int lotteryDigit2 = ((lottery/10)%10);
    int lotteryDigit3 = lottery%10; 

    //Gets digits from guess
    int guessDigit1 = guess/100;
    int guessDigit2 = ((guess/10)%10);
    int guessDigit3 = guess%10;

    //UNCOMMENT THIS WHEN DONE
    //System.out.println("The lottery number is " + lottery);

    //Check the guess
    //create variable winCase to differentiate each different
    //case of a winning number  
    int winCase = 0;
    if (guess == lottery){
      winCase = 0;
    }
    //checks to see if guessDigit1 exists in lotto number
    else if ((guessDigit1 == lotteryDigit2)||(guessDigit1==lotteryDigit3)||
    (guessDigit1 == lotteryDigit1)){
      //adds 1 to winCase since so far 1 digit is existant in both numbers
      winCase += 1;
      if((guessDigit2==lotteryDigit1)||(guessDigit2==lotteryDigit3)||
      (guessDigit2==lotteryDigit2)){
        //If guess != lottery, but guessDigit1 and guessDigit2 exist 
        //in the lottery number
        winCase += 1;
      }
      if((guessDigit3==lotteryDigit1)||(guessDigit3==lotteryDigit2)||
      (guessDigit3 == lotteryDigit3)){
        //if guess != lottery, but guessDigit1 and 3 exist 
        //in lottery number
        winCase += 1;
      }
      //else if only guessDigit1 exists in lottery
      else{
        winCase = 2;
      }
    }
    //checks to see if guessDigit2 exists in lotto number
    else if ((guessDigit2 == lotteryDigit1)||(guessDigit2==lotteryDigit3)||
      (guessDigit2==lotteryDigit2)){
      //adds 1 to winCase since so far 1 digit is existant in both numbers
      winCase += 1;
      //if guessDigit 3 exists in lotto number
      if((guessDigit3==lotteryDigit1)||(guessDigit3==lotteryDigit2)){
        //if guess != lottery, but guessDigit2 and 3 exist 
        //in lottery number
        winCase = 4;
      }
      //else if only guessDigit2 exists in lottery
      else{
        winCase = 1;
      }
    }
    
    //checks to see if guessDigit3 exists in lotto number
    else if ((guessDigit3 == lotteryDigit3)/*||(guessDigit3==lotteryDigit1)*/){
      //adds 1 to winCase since so far 1 digit is existant in both numbers
      winCase += 1;
      if((guessDigit1==lotteryDigit2)||(guessDigit1==lotteryDigit3)){
        //If guess != lottery, but guessDigit1 and guessDigit3 exist 
        //in the lottery number
        winCase = 2;
      }
      /*if((guessDigit2==lotteryDigit1)||(guessDigit2==lotteryDigit3)){
        //if guess != lottery, but guessDigit1 and 3 exist 
        //in lottery number
        winCase = 1;
      }*/
      //else if only guessDigit3 exists in lottery
      else{
        winCase = 1;
      }
    }
    //no matching digits
    else{
      winCase = 5;
    }

    //switch statements
    switch(winCase){
      case 0: System.out.println("Exact match: you win $10,000!"); break;
      case 1: System.out.println("Match one digit: you win $1,000!"); break; 
      case 2: System.out.println("Match two digits: you win $1,000!"); break;
      case 3: System.out.println("Match all digits: you win $3,000!"); break;
      case 4: System.out.println("Sorry, that's not a lucky number. No winnings"); 
      break;
    }
  }
}
