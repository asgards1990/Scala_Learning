package Week6

import Book._
/**
 * @author corpus
 */
object ForHigherFun {
  
  val books: Set[Book] = Set(
      Book("test",List("By","tester","1")),
      Book("test2",List("By","tester","2")),
      Book("test3",List("By","tester","3")),
      Book("test4",List("By","tester","4")),
      Book("test5",List("By","tester","1","again")))
  def mapFun[T,U](l: List[T], f: T => U): List[U] =
    for (x <- l) yield f(x)
  
  def flatMap[T,U](l: List[T], f: T => Iterable[U]): List[U] =
    for (x <- l; y <- f(x)) yield y
   
  def filter[T](l: List[T], p: T => Boolean): List[T] =
    for (x <- l if p(x)) yield x
  
    
  def authosStartWith(bs: Set[Book], s: String): Set[String] = 
    bs.flatMap(book => book.authors withFilter(_.startsWith(s)) map (_ => book.title))
}