package Week5

/**
 * @author su.yang
 */
object ListHigherFun {
  
  //This is not tail-recursive
  def map[T,S](l:List[T])(f:T => S): List[S] = l match {
    case List() => List()
    case t::h => f(t)::map(h)(f)
  }
  def scaleList(l:List[Double],factor:Double) = map(l)(x => x*factor)
  def squareList(l:List[Double]) = map(l)(x=>x*x)
  
  
  def filter[T](l:List[T])(p:T => Boolean):List[T] = l match {
    case List() => List()
    case h::t => if (p(h)) h::filter(t)(p) else filter(t)(p) 
  }
  def posElements(l:List[Int])=filter(l)(_>0)
  def filterNot[T](l:List[T])(p:T => Boolean):List[T] = filter(l)(x => !p(x))
  
def partition[T](l:List[T])(p:T => Boolean):(List[T],List[T]) = l match {
    case List() => (List(),List())
    case h::t => {
      val (x,y) = partition(t)(p)
      if (p(h)) (h::x,y) 
      else (x,h::y)
    }
  }
  
  def takeWhile[T](l:List[T])(p:T => Boolean): List[T] = l match {
    case List() => List()
    case h::t => if (p(h)) h::takeWhile(t)(p) else List() 
  }
  
  def dropWhile[T](l:List[T])(p:T => Boolean): List[T] = l match {
    case List() => List()
    case h::t => if (p(h)) dropWhile(t)(p) else l 
  }
  
  def span[T](l:List[T])(p:T => Boolean): (List[T],List[T]) = l match {
    case List() => (List(),List())
    case h::t => {
      if (p(h)) {
        val (x,y) = span(t)(p)
        (h::x,y)
      }
      else (List(),l)
    } 
  }
  
  def pack[T](l: List[T]): List[List[T]] = l match {
    case List() => List()
    case h::t => pack(t) match {
      case List() => List(List(h))
      case firstPack::rest => {
        if (firstPack.head==h) (h::firstPack)::rest
        else List(h)::firstPack::rest
        //alternatively:
        //val (first,rest) = span(l)(y => y==h)
        //first::pack(rest)
      }
    }
  }
  def encode[T](l: List[T]): List[(T,Int)] = l match {
    case List() => List()
    case h::t => encode(t) match {
      case List() => List((h,1))
      case firstPack::rest => {
        if (firstPack._1==h) (firstPack._1,firstPack._2+1)::rest
        else (h,1)::firstPack::rest

      }
    }
  }
    //alternatively: (the above is more efficient though)
    //def encode[T](l: List[T]): List[(T,Int)] = l match {
    //  pack(l) map ( packs => (packs.head,packs.length))
    //  first::pack(rest)
    //}
}