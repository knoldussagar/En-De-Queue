package com.knoldus


//DoubleQueue enqueues the element after doubling them
class DoubleQueue extends Queue
{
  def enqueue(queue: List[Int] , element : Int): List[Int] =
  {
    ( element * 2 )  :: queue
  }

  override def dequeue(queue: List[Int]): Any = super.dequeue(queue)
}



//SquareQueue enqueues the element after squaring them
class SquareQueue extends Queue
{

  //add element to the queue
  def enqueue(queue: List[Int], element: Int): List[Int] = {
    {
      (element * element) :: queue
    }
  }

  //delete element from the queue
  override def dequeue(queue: List[Int]): Any = super.dequeue(queue)

}