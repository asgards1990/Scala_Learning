package Week7

import StreamTest._
import primes._
object Sessions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(106); val res$0 = 
  ((1000 to 10000) filter isPrime)(1);System.out.println("""res0: Int = """ + $show(res$0));$skip(53); val res$1 = 
  ((1000 to 10000).toStream filter isPrime) apply 50;System.out.println("""res1: Int = """ + $show(res$1));$skip(39); 
  val x = 1 #:: (List(2,3,5).toStream);System.out.println("""x  : scala.collection.immutable.Stream[Int] = """ + $show(x ));$skip(27); val res$2 = 
  
  (m4s take 100).toList;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(30); 
  val primes = sieve(from(2));System.out.println("""primes  : Stream[Int] = """ + $show(primes ));$skip(29); val res$3 = 
  
  primes.take(100).toList;System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(62); val res$4 = 
   
  sqrtStream(4).filter(isGoodEnough(_,4)).take(10).toList;System.out.println("""res4: List[Double] = """ + $show(res$4))}
  
}
