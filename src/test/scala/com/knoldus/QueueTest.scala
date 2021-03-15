package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class QueueTest extends AnyFlatSpec {

  //scalastyle:off magic.number

  val doubleTheQueue = new DoubleQueue

  "enqueue operation in doubleTheQueue " should "first double the element then add that element to queue " in {
    assert(doubleTheQueue.enqueue(List(1, 2, 3), 4) == List(8, 1, 2, 3))
  }


  //negative test case
  "enqueue operation in doubleTheQueue  " should "correctly double the element then add to queue " in {
    assert(doubleTheQueue.enqueue(List(4, 2, 3), 10) != List(10, 4, 2, 3))
  }

  it should "throw NoSuchElementException when List is empty" in
    assertThrows[NoSuchElementException] {
      doubleTheQueue.dequeue(List())
    }

  "dequeue operation in doubleTheQueue " should "remove the first inserted element from the queue " in {
    assert(doubleTheQueue.dequeue(List(20, 30, 40, 50)) == List(20, 30, 40))
  }

  //negative test case
  "dequeue operation in doubleTheQueue " should "remove the first inserted element from the queue correctly  " in {
    assert(doubleTheQueue.dequeue(List(20, 30, 40, 50)) != List(30, 40, 50))
  }


  val squareTheQueue = new SquareQueue

  "enqueue operation in squareTheQueue " should "first find square of the element then add it to queue " in {
    assert(squareTheQueue.enqueue(List(10, 20, 30), 5) == List(25, 10, 20, 30))
  }

  //negative test case
  "enqueue operation in squareTheQueue " should "correctly find square of the element then add it to queue " in {
    assert(squareTheQueue.enqueue(List(20, 30, 40), 10) != List(25, 20, 30, 40))
  }

  it should "throw NoSuchElementException when List is empty" in
    assertThrows[NoSuchElementException] {
      squareTheQueue.dequeue(List())
    }


  "dequeue operation in squareTheQueue " should "remove the first inserted element from the queue " in {
    assert(squareTheQueue.dequeue(List(20, 30, 40, 50)) == List(20, 30, 40))
  }

  //negative test case
  "dequeue operation in squareTheQueue " should "remove the first inserted element from the queue correctly" in {
    assert(squareTheQueue.dequeue(List(20, 30, 40, 50)) != List(20, 30, 50))
  }


}
