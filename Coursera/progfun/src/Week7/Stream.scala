package Week7

/**
 * @author su.yang
 */

trait StreamTest[+A] {
  def isEmpty: Boolean
  def head: A
  def tail: Stream[A]
}

object StreamTest {
  def cons[T](hd: T,tl: => Stream[T]) = new StreamTest[T] {
    def isEmpty = false
    def head = hd
    lazy val tail = tl
  }
  
  val empty = new StreamTest[Nothing] {
    def isEmpty = true
    def head = throw new NoSuchElementException("empty.head")
    def tail = throw new NoSuchElementException("empty.tail")
  }
  


}