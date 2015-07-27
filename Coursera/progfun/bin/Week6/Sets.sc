package Week6

import NQueens._

object Sets {
	val fruit = Set("banana","apple","orange","pear")
                                                  //> fruit  : scala.collection.immutable.Set[String] = Set(banana, apple, orange, 
                                                  //| pear)
	val s = (1 to 6).toSet                    //> s  : scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)
	
	s map (_ + 2)                             //> res0: scala.collection.immutable.Set[Int] = Set(5, 6, 7, 3, 8, 4)
	fruit filter	(_.startsWith("app"))     //> res1: scala.collection.immutable.Set[String] = Set(apple)
	s.nonEmpty                                //> res2: Boolean = true
	
	queens(6)                                 //> res3: Set[List[Int]] = Set(List(3, 0, 4, 1, 5, 2), List(4, 2, 0, 5, 3, 1), L
                                                  //| ist(2, 5, 1, 4, 0, 3), List(1, 3, 5, 0, 2, 4))
	(queens(10) take 3 map show) mkString "\n"//> res4: String = "
                                                  //| * * * * * * * X * * 
                                                  //| * * * * * X * * * * 
                                                  //| X * * * * * * * * * 
                                                  //| * * X * * * * * * * 
                                                  //| * * * * * * X * * * 
                                                  //| * * * * * * * * X * 
                                                  //| * * * X * * * * * * 
                                                  //| * X * * * * * * * * 
                                                  //| * * * * X * * * * * 
                                                  //| * * * * * * * * * X 
                                                  //| 
                                                  //| * * * * X * * * * * 
                                                  //| * X * * * * * * * * 
                                                  //| * * * * * X * * * * 
                                                  //| * * * * * * * * * X 
                                                  //| * * X * * * * * * * 
                                                  //| * * * * * * X * * * 
                                                  //| * * * * * * * * X * 
                                                  //| * * * X * * * * * * 
                                                  //| * * * * * * * X * * 
                                                  //| X * * * * * * * * * 
                                                  //| 
                                                  //| * * * * * X * * * * 
                                                  //| X * * * * * * * * * 
                                                  //| * * X * * * * * * * 
                                                  //| * * * * * * * * * X 
                                                  //| * * * * * * * X * * 
                                                  //| * X * * * * * * * * 
                                                  //| * * * X * * * * * * 
                                                  //| * * * * * * * * X * 
                                                  //| * * * * * * X * * * 
                                                  //| * * * * X * * * * * "
	 
}