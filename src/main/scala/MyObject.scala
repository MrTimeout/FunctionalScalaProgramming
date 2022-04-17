package org.learning.language

object MyObject {

  def abs(number: Int): Int =
    if (number < 0) -number
    else number

  private def formatAbs(number: Int): String = {
    return s"abs($number)=${abs(number)}"
  }

  private def factorial(number: Int): Int = {
    def doFactorial(number: Int, accumulator: Int): Int =
      if (number <= 0) accumulator
      else doFactorial(number - 1, number * accumulator)

    doFactorial(number, 1)
  }

  // Tail in Scala -> A call is said to be in 'tail position' if the caller does nothing other than return the value of the recursive call.
  private def fibonacci(number: Int): Int = {
    def doFibonacci(number: Int, previous: Int, accumulator: Int): Int =
      if (number <= 2) accumulator
      else doFibonacci(number - 1, accumulator, accumulator + previous)

    if (number == 1) 0
    else if (number == 2) 1
    else doFibonacci(number, 0, 1)
  }

  // The function as parameter makes the function loop HOF (Higher-Order Function). Conventions for parameter function are: f, g and h
  private def loop(from: Int, to: Int, f: Int => Int): Unit = {
    def doLoop(from: Int): Unit = {
      if (from >= to) return
      else {
        println(s"f($from) = ${f(from)}")
        doLoop(from + 1)
      }
    }

    doLoop(from)
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-2))

    println(factorial(5))
    //loop(1, 47, fibonacci)

    // Lambda syntax
    loop(0, 1, (x: Int) => x + 1)
    loop(0, 1, (x) => x + 1)
    loop(0, 1, x => x + 1)
    loop(0, 1, _ + 1)
    loop(0, 1, x => {
      val r = x + 1; r
    })
}

/**
 * import MyObject._ imports all of its methods unqualified
 * import MyObject.abs will allows us to use the abs method directly
 * import org.learning.language.MyObject._ imports all of its methods unqualified
 */
