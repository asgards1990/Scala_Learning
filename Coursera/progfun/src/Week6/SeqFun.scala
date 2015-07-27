package Week6

/**
 * @author su.yang
 */
object SeqFun {
    def combinations(M: Int, N:Int): Seq[(Int,Int)] =
     (1 to M) flatMap (x => (1 to N) map ( y => (x,y)))
    
    def scalarProduct(u:Vector[Double],v:Vector[Double]):Double = 
      (u zip v).map(xy => xy._1*xy._2).sum
      
    def isPrime(n: Int): Boolean = 
      (2 until n/2) forall (n%_!=0)
      
    def scalarProductFor(u:Vector[Double],v:Vector[Double]):Double =
      (for (i <- 0 until u.length) yield u(i)*v(i)).sum
      
//    def scalarProductFor(u:Vector[Double],v:Vector[Double]):Double =
//      (for (x,y) <- u zip v) yield x*y).sum
}