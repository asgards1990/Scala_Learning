package Week5

import ListReductionFun._

object ReductionFun {
  fact(0)                                         //> res0: Int = 1
  fact(1)                                         //> res1: Int = 1
  fact(10)                                        //> res2: Int = 3628800
  val l = generateList(25)                        //> l  : List[Int] = List(25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12
                                                  //| , 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
  lengthFun(l)                                    //> res3: Int = 25
}