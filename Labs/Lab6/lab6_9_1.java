/*

  * file: lab6_9_1.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 6
  * due date: April 18, 2017
  * version: 1.3

 */
/*UML Diagram for problem 9.1 
---------------------------
         Rectangle        |
---------------------------
+width: double            |
+height: double           |
---------------------------
+Recatangle():void        |
+Rectangle(Double)        | 
+getArea(): Double        |
+getPerimeter(): Double   | 
--------------------------
*/


public class lab6_9_1{
  public static void main(String[] args) {
    //creates new rectangle object, rectangle1, with width 4 and height 40
    Rectangle rectangle1 = new Rectangle(4, 40);
    //print statement shows user the width, height, area, and perimeter
    //of rectangle1 
    System.out.println("Rectangle 1: Width: " + rectangle1.width + " Height: "
    + rectangle1.height + " Area: " + rectangle1.getArea() + " Perimeter: " +
    rectangle1.getPerimeter());
    
    //creates new rectangle object, rectangle1, with width 3.5 and height 35.9
    Rectangle rectangle2 = new Rectangle(3.5, 35.9);
    
    //print statement shows user the width, height, area, and perimeter
    //of rectangle2 
    System.out.println("Rectangle 2: Width: " + rectangle2.width + " Height: "
    + rectangle2.height + " Area: " + rectangle2.getArea() + " Perimeter: " +
    rectangle2.getPerimeter());
  } 
}
//initialization of Rectangle class
class Rectangle {
    
  //width and height variables created w/ default values 
  double width = 1;
  double height = 1;
    
  //necessary Rectangle default constructor
  Rectangle() {
  }
  
  //
  Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }
  
  //getArea method of the Rectangle class returns the wdith*height 
  //of your object
  double getArea() {
    return width * height;
  }
  //getPerimeter method to return the perimeter of any given Rectangle object
  double getPerimeter() {
    return width * 2 + height * 2;
  }    
}