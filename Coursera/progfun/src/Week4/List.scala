package Week4


/**
 * @author su.yang
 */
trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def prepend[U>: T](elem: U): List[U] = new Cons(elem,this) 
  override def toString: String = this match {
    case Nil => "END"
    case Cons(h,t) => h+"->"+t
  }
  // very important
  // to make prepend variant-correct.

}

case class Cons[T](val head:T,val tail:List[T]) extends List[T]{
  def isEmpty = false

}

case class Nil[T]() extends List[T] {
  def isEmpty = true
  def head = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Nil.tail")
}

case object List {
  def apply[T](x1:T,x2:T) : List[T] = new Cons(x1,new Cons(x2,new Nil))
  def aplpy[T] =  new Nil
  def apply[T](x:T) = new Cons(x,new Nil)
}

case object Nil extends List[Nothing] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}

object test {
  val x = Nil
  def f(xs: List[NonEmpty], x: Empty) = xs prepend x
  def isort(xs: List[Int]): List[Int]= xs match {
    case Nil => Nil
    case Cons(h:Int,t:List[Int]) => insert(h,isort(t))
  }
  def insert(h:Int,l:List[Int]): List[Int] = l match{
    case Nil =>  new Cons(h,Nil)   
    case _ => {  
      if (h > l.head) new Cons(l.head,insert(h,l.tail))
      else new Cons(h,l)
    }
  }
}

