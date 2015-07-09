package Week3

/**
 * @author su.yang
 */
import Week3._

object Main {
  def main(args: Array[String]) = println("Hello World!")
  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])
  
  def nthElem[T](n:Int,l:List[T]): T= {
    if (l.isEmpty) throw new IndexOutOfBoundsException("Invalid Index")
    else if (n==0) l.head
    else nthElem(n-1,l.tail)
  }
}