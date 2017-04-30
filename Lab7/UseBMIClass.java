/*

  * file: UseBMIClass.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 7
  * due date: April 25, 2017
  * version: 1.3

 */
//user class for BMI class (problem 10.2)
public class UseBMIClass{
  //main method
  public static void main(String[] args) {
    //creates 3 objects each of which invoke a different getBMI method
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
    System.out.println("The BMI for " + bmi1.getName() + " is " + 
    bmi1.getBMI() + " " + bmi1.getStatus());

    BMI bmi2 = new BMI("Susan King", 215, 70);
    System.out.println("The BMI for " + bmi2.getName() + " is " + 
    bmi2.getBMI() + " " + bmi2.getStatus());

    //creates object that invoked NEW getBMI method which 
    //includes feet and inches 
    BMI bmi3 = new BMI("Sabrina Bergsten", 18, 118, 5, 3);
    System.out.println("The BMI for " + bmi3.getName() + " is " + 
    bmi3.getBMI() + " " + bmi3.getStatus());

  }
}