package Week6

import SeqFun._

object Vectors {
  val nums = Vector(1,2,3,-88)                    //> nums  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, -88)
  val people = Vector("Bob","James","Peter")      //> people  : scala.collection.immutable.Vector[String] = Vector(Bob, James, Pet
                                                  //| er)
  val x = Array(1,2,3,44)                         //> x  : Array[Int] = Array(1, 2, 3, 44)
  x map (x=>x*2)                                  //> res0: Array[Int] = Array(2, 4, 6, 88)
  val s: String = "Hello World!"                  //> s  : String = Hello World!
  s filter (_.isUpper)                            //> res1: String = HW
  //Only lower, upper and steps are stored.
  val r: Range = 1 until 5                        //> r  : Range = Range(1, 2, 3, 4)
  val r2: Range = 1 to 5                          //> r2  : Range = Range(1, 2, 3, 4, 5)
  1 to 10 by 3                                    //> res2: scala.collection.immutable.Range = Range(1, 4, 7, 10)
  6 to 1 by -1                                    //> res3: scala.collection.immutable.Range = Range(6, 5, 4, 3, 2, 1)
  1 to 10 by -1                                   //> res4: scala.collection.immutable.Range = Range()
  
  s exists (_.isUpper)                            //> res5: Boolean = true
  s forall (_.isUpper)                            //> res6: Boolean = false
  val pairs = List(1,2,3) zip s                   //> pairs  : List[(Int, Char)] = List((1,H), (2,e), (3,l))
  pairs.unzip                                     //> res7: (List[Int], List[Char]) = (List(1, 2, 3),List(H, e, l))
  
  s flatMap (List('.',_))                         //> res8: String = .H.e.l.l.o. .W.o.r.l.d.!
  s.max                                           //> res9: Char = r

   
  combinations(4,5)                               //> res10: Seq[(Int, Int)] = Vector((1,1), (1,2), (1,3), (1,4), (1,5), (2,1), (2
                                                  //| ,2), (2,3), (2,4), (2,5), (3,1), (3,2), (3,3), (3,4), (3,5), (4,1), (4,2), (
                                                  //| 4,3), (4,4), (4,5))
   
  isPrime(79)                                     //> res11: Boolean = true
  isPrime(1200)                                   //> res12: Boolean = false
}