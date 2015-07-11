package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = 
    if (c==0||c==r) 1 
    else pascal(c-1,r-1)+pascal(c,r-1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
      def loop(c: List[Char],diff:Int) :Boolean =
        if (c.isEmpty) diff==0
        else if (c.head=='(') loop(c.tail,diff+1)
        else if (c.head==')') {
           if (diff==0) false
           else loop(c.tail,diff-1)          
        }
        else loop(c.tail,diff)
        
        loop(chars,0)
      }
  

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
    if (money==0) 1
    else if (coins.isEmpty) 0
    else if (money<coins.head) countChange(money,coins.tail)
    else countChange(money-coins.head,coins)+countChange(money,coins.tail)

//    println(countChange(300,List(5,10,20,50,100,200,500)))
}
