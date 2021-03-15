package com.knoldus

trait Queue
{

  //method declaration to insert element to the queue
  def enqueue(queue :List[Int] , element : Int) : List[Int]

  //concrete method for delete element from queue
  def dequeue(queue : List[Int]) : Any =
    queue match {
      case  Nil => throw new NoSuchElementException
      case _ => queue.init
    }

}