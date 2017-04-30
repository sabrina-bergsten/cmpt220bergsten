/*

  * file: Queue.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 7
  * due date: April 25, 2017
  * version: 1.3

 */
/*UML Diagram for problem 10.10
--------------------------------------------
        Location                           |
--------------------------------------------
+name: String                                 |
+age: int                               |
+weight: double 
+height: double
+KILOGRAMS_PER_POUND: double
+METERS_PER_INCH: double
+INCH_PER_FOOT: double                         |
--------------------------------------------
+BMI()                         |
+Location(int:int, int:int, double:double) | 
+locateLargest(double[][]): int, int, double|
--------------------------------------------
*/

//initialize Queue class for problem 10.10
public class Queue {
	private int[] elements;
	private int size; 
	public static final int DEFAULT_CAPACITY = 8;

	//construct a stack with the default capacity 8
	public Queue(){
	  this (DEFAULT_CAPACITY);
	}

	//Construct a stack with the specified maximum capacity
	public Queue(int capacity){
	  elements = new int[capacity];
	}

	//adds v into the newly constructed queue
	public void enqueue(int v){
	  if(size >= elements.length){
	  	int[] temp = new int[elements.length*2];
	  	System.arraycopy(elements, 0, temp, 0, elements.length);
	  	elements = temp;
	  }

	  elements[size++] = v;

	}

	public int dequeue(){
	  int v = elements[0];
	  int [] temp = new int[elements.length];
	  System.arraycopy(elements, 1, temp, 0, size);
	  elements = temp;
	  size--;
	  return v; 
	}

	//test whether the queue is empty 
	public boolean empty(){
	  return size==0;
	}

	//return the number of elements in the queue
	public int getSize(){
	  return size;
	}
}