/*

  * file: lab7_10_2.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 7
  * due date: April 25, 2017
  * version: 1.3

 */
/*UML Diagram for problem 10.2
-----------------------------------------------------------------------------
        						BMI                                			|
-----------------------------------------------------------------------------
+name: String                              									|
+age: int                                  									|
+weight: double 						   									|
+height: double							   									|
+KILOGRAMS_PER_POUND: double			   									|
+METERS_PER_INCH: double				   									|
+INCH_PER_FOOT: double                     									|
-----------------------------------------------------------------------------
+BMI(String: String, int:int, double:double, double:double) 				|                         
+BMI(String: String, double:double, double:double) 							| 
+BMI(String: String, int:int, double:double, double:double, double:double)  |
+getBMI(): int 																|
+getStatus(): String														|
+getName(): String															|
+getAge(): int 																|
+getWeight(): double														|
+getHeight(): double														|
-----------------------------------------------------------------------------
*/
  //class declaration of BMI class
  public class BMI{
  	//initialization of variables
  	private String name;
  	private int age; 
  	private double weight; //in pounds 
  	private double height; //in inches 
  	public static final double KILOGRAMS_PER_POUND = 0.45359237;
  	public static final double METERS_PER_INCH = 0.0254;
  	public static final double INCH_PER_FOOT = 12; 

  	//constructor 1 takes parameters name age weight and height
  	public BMI(String name, int age, double weight, double height){
  	  this.name = name; 
  	  this.age = age;
  	  this.weight = weight;
  	  this.height = height;
  	}

  	//constructor 2 takes parameters name weight and height
  	public BMI(String name, double weight, double height){
  	  this(name, 20, weight, height);
  	}

  	//constructor 3 takes parameters name age weight feet and inches 
  	public BMI(String name, int age, double weight, double feet, double inches){
  	  this(name, age, weight, inches + feet * 12);
  	}

  	//uses BMI equation to calculate and return BMI
  	public double getBMI(){
  	  double bmi = weight*KILOGRAMS_PER_POUND / 
  	  ((height*METERS_PER_INCH) * (height*METERS_PER_INCH));
  	  return Math.round(bmi*100) / 100.0;
  	}

  	//returns status of BMI
  	public String getStatus(){
  	  double bmi = getBMI();
  	  if(bmi < 18.5)
  	  	return "Underweight";
  	  else if(bmi<25)
  	  	return "Normal";
  	  else if(bmi<30)
  	  	return "Overweight";
  	  else 
  	  	return "Obese";
  	}
  	//returns name 
  	public String getName(){
  	  return name; 
  	}
  	//returns age 
  	public int getAge(){
  	  return age;
  	}
  	//returns weight
  	public double getWeight(){
  	  return weight;
  	}
  	//return height
  	public double getHeight(){
      return height; 
  	}
  }