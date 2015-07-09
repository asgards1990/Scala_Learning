package Week5

/**
 * @author su.yang
 */
object ListReductionFun {
  
  
  def reduceLeft[T](l: List[T])(op: (T,T) => T): T = l match {
    case List() => throw new Error("Empty List reduceLeft")
    case h::t => foldLeft(h)(t)(op)
  }
  
  def foldLeft[T,U](z: U)(l: List[T])(op: (U,T) => U): U = l match {
    case List() => z
    case h::t => (foldLeft(op(z,h))(t)(op))
  }
  
  def reduceRight[T](l: List[T])(op: (T,T) => T): T = l match {
    case List() => throw new Error("Empty List reduceLeft")
    case List(x) => x
    case h::t => op(h,reduceRight(t)(op))
  }
  
  def foldRight[T,U](z: U)(l: List[T])(op: (T,U) => U): U = l match {
    case List() => z
    case h::t => op(h,foldRight(z)(t)(op))
  }
  
  
  def sum(l : List[Int]): Int = 0::l reduceLeft (_+_)
  //def sum(l : List[Int]): Int = (l foldLeft 0) (_+_)
  def product(l : List[Int]): Int = 1::l reduceLeft (_*_) 
  //def product(l : List[Int]): Int = (l foldLeft 1) (_*_) 
  
  def generateList(n: Int):List[Int] = n match {
    case 0 => List()
    case _ => n::generateList(n-1)
  }
  def fact(n: Int) : Int = foldLeft(1)(generateList(n))(_*_)
  
  def concat[T] (xl: List[T], yl: List[T]): List[T] = (xl foldRight yl) (_::_)
  
  def mapFun[T,U](l:List[T], f:T => U): List[U] = foldRight(List[U]())(l)(f(_)::_)
  def lengthFun[T](l: List[T]): Int = foldRight(0)(l)((_,n) => n+1)
}