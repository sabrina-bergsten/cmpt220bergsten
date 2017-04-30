/*

  * file: testQueue.java
  * author: Sabrina Bergsten
  * course: CMPT 220
  * assignment: Lab 7
  * due date: April 25, 2017
  * version: 1.3

 */
//test class for Queue class (problem 10.10)
public class testQueue {
  public static void main(String[] args) {
  	//creates new Queue object called queue
  	Queue queue = new Queue();

  	//puts numbers 1-20 into new queue object
  	for(int i=1; i<=20; i++){
  	  queue.enqueue(i);

  	//removes numbers and prints them 
  	while(!queue.empty()){
  	  System.out.print(queue.dequeue() + " ");
  	}

  	}
  }
}