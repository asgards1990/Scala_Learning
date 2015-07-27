package Week6

import SeqFun._

object CobinatorialSearch {
	val n = 7                                 //> n  : Int = 7
  (1 until n) map (i => (1 until n-i) map ((i,_))) flatten
                                                  //> res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (1,2
                                                  //| ), (1,3), (1,4), (1,5), (2,1), (2,2), (2,3), (2,4), (3,1), (3,2), (3,3), (4,
                                                  //| 1), (4,2), (5,1))
  
  (1 until n) flatMap (i => (1 until n-i) map ((i,_)))
                                                  //> res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (1,2
                                                  //| ), (1,3), (1,4), (1,5), (2,1), (2,2), (2,3), (2,4), (3,1), (3,2), (3,3), (4,
                                                  //| 1), (4,2), (5,1))
  
	for {
		i <- 1 until n;
		j <- 1 until n-i;
		if isPrime(i+j)

		}
	yield (i,j)                               //> res2: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (1,2
                                                  //| ), (1,3), (1,4), (2,1), (2,2), (2,3), (3,1), (3,2), (4,1))
  val u:Vector[Double] = Vector(1,2,3)            //> u  : Vector[Double] = Vector(1.0, 2.0, 3.0)
  val v:Vector[Double] = Vector(3,2,1)            //> v  : Vector[Double] = Vector(3.0, 2.0, 1.0)
  scalarProductFor(u,v)                           //> res3: Double = 10.0
  u.length                                        //> res4: Int = 3
  
  u(1)                                            //> res5: Double = 2.0
  (for (i <- 0 until u.length) yield u(i)*v(i)) sum
                                                  //> res6: Double = 10.0
}