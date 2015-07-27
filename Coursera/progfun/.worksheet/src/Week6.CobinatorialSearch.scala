package Week6

import SeqFun._

object CobinatorialSearch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
	val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(59); val res$0 = 
  (1 until n) map (i => (1 until n-i) map ((i,_))) flatten;System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(58); val res$1 = 
  
  (1 until n) flatMap (i => (1 until n-i) map ((i,_)));System.out.println("""res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$1));$skip(84); val res$2 = 
  
	for {
		i <- 1 until n;
		j <- 1 until n-i;
		if isPrime(i+j)

		}
	yield (i,j);System.out.println("""res2: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$2));$skip(39); 
  val u:Vector[Double] = Vector(1,2,3);System.out.println("""u  : Vector[Double] = """ + $show(u ));$skip(39); 
  val v:Vector[Double] = Vector(3,2,1);System.out.println("""v  : Vector[Double] = """ + $show(v ));$skip(24); val res$3 = 
  scalarProductFor(u,v);System.out.println("""res3: Double = """ + $show(res$3));$skip(11); val res$4 = 
  u.length;System.out.println("""res4: Int = """ + $show(res$4));$skip(11); val res$5 = 
  
  u(1);System.out.println("""res5: Double = """ + $show(res$5));$skip(52); val res$6 = 
  (for (i <- 0 until u.length) yield u(i)*v(i)) sum;System.out.println("""res6: Double = """ + $show(res$6))}
}
