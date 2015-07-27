package Week6

import SeqFun._

object Vectors {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  val nums = Vector(1,2,3,-88);System.out.println("""nums  : scala.collection.immutable.Vector[Int] = """ + $show(nums ));$skip(45); 
  val people = Vector("Bob","James","Peter");System.out.println("""people  : scala.collection.immutable.Vector[String] = """ + $show(people ));$skip(26); 
  val x = Array(1,2,3,44);System.out.println("""x  : Array[Int] = """ + $show(x ));$skip(17); val res$0 = 
  x map (x=>x*2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(33); 
  val s: String = "Hello World!";System.out.println("""s  : String = """ + $show(s ));$skip(23); val res$1 = 
  s filter (_.isUpper);System.out.println("""res1: String = """ + $show(res$1));$skip(71); 
  //Only lower, upper and steps are stored.
  val r: Range = 1 until 5;System.out.println("""r  : Range = """ + $show(r ));$skip(25); 
  val r2: Range = 1 to 5;System.out.println("""r2  : Range = """ + $show(r2 ));$skip(15); val res$2 = 
  1 to 10 by 3;System.out.println("""res2: scala.collection.immutable.Range = """ + $show(res$2));$skip(15); val res$3 = 
  6 to 1 by -1;System.out.println("""res3: scala.collection.immutable.Range = """ + $show(res$3));$skip(16); val res$4 = 
  1 to 10 by -1;System.out.println("""res4: scala.collection.immutable.Range = """ + $show(res$4));$skip(27); val res$5 = 
  
  s exists (_.isUpper);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(23); val res$6 = 
  s forall (_.isUpper);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(32); 
  val pairs = List(1,2,3) zip s;System.out.println("""pairs  : List[(Int, Char)] = """ + $show(pairs ));$skip(14); val res$7 = 
  pairs.unzip;System.out.println("""res7: (List[Int], List[Char]) = """ + $show(res$7));$skip(29); val res$8 = 
  
  s flatMap (List('.',_));System.out.println("""res8: String = """ + $show(res$8));$skip(8); val res$9 = 
  s.max;System.out.println("""res9: Char = """ + $show(res$9));$skip(25); val res$10 = 

   
  combinations(4,5);System.out.println("""res10: Seq[(Int, Int)] = """ + $show(res$10));$skip(18); val res$11 = 
   
  isPrime(79);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(16); val res$12 = 
  isPrime(1200);System.out.println("""res12: Boolean = """ + $show(res$12))}
}
