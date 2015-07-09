package Week5

import math.Ordering
/**
 * @author su.yang
 */
object ListFun {
  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("last of empty list")
    case List(x) => x
    case y::ys => last(ys)
  }
  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("Init of empty list")
    case List(x) => List()
    case y::ys => y::init(ys)
  }
  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case z::zs => z::concat(zs,ys)
  }
  
  def reverseBad[T](xs: List[T]): List[T] = xs match {
    case List() => xs
    case y::ys => reverseBad(ys)++List(y)
  }
  
  def reverse[T](xs: List[T]): List[T] = {
    def rec (start: List[T],end: List[T]): List[T] = start match {
      case List() => end
      case h::t => rec(t,h::end)
    }
    rec(xs,List())
  }
  
  def removeAt[T](xs: List[T], n: Int): List[T] = (xs,n) match {
    case (List(),_) => List()
    case (h::t,0) => t
    case (h::t,_) => h::removeAt(t,n-1)
  }
  
  def flatten(xs: List[Any]): List[Any] = {
    def rec(anything: Any): List[Any] = anything match {
      case List() => List()
      case x::t => concat(rec(x),rec(t))
      case _ => List(anything)
    }
    rec(xs)
  }
  
//  def msort[T](xs: List[T])(lt: (T,T) => Boolean): List[T] = {
//    val n = xs.length/2
//    if (n==0) xs
//    else {
//      val (l,r) = xs splitAt n
//      merge(msort(l)(lt),msort(r)(lt))(lt)
//    }    
//  }
//   def merge[T](l: List[T],r: List[T])(lt: (T,T) => Boolean): List[T] = (l,r) match {
//    case (List(),_) => r
//    case (_,List()) => l
//    case (lh::tl,rh::tr) => if (lt(lh,rh)) lh::merge(tl,r)(lt) else rh::merge(l,tr)(lt)
//  }
  
  def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length/2
    if (n==0) xs
    else {
      val (l,r) = xs splitAt n
      merge(msort(l),msort(r))
    }    
  }
 
   def merge[T](l: List[T],r: List[T])(implicit ord: Ordering[T]): List[T] = (l,r) match {
    case (List(),_) => r
    case (_,List()) => l
    case (lh::tl,rh::tr) => if (ord.lt(lh,rh)) lh::merge(tl,r) else rh::merge(l,tr)
  }
  
}