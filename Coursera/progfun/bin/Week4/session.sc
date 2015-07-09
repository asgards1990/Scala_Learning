package Week4

object session {
 val expr = Prod(Prod(Sum(Sum(Number(1),Number(69)),Number(55)),
 Number(2)),Sum(Number(3),Number(4)))             //> expr  : Week4.Prod = (1 + 69 + 55) * 2 * (3 + 4)
 val t = Cons(3,Cons(2,Nil ))                     //> t  : Week4.Cons[Int] = 3->2->END
 test.isort(t)                                    //> 2+Nil
                                                  //| 3+Nil
                                                  //| res0: Week4.List[Int] = 2->3->END
 val l = Cons(9,Cons(2,Cons(7,Cons(85,Cons(5,Cons(8,Cons(1,Nil)))))))
                                                  //> l  : Week4.Cons[Int] = 9->2->7->85->5->8->1->END
 test.isort(l)                                    //> 1+Nil
                                                  //| 8+Nil
                                                  //| 85+Nil
                                                  //| res1: Week4.List[Int] = 1->2->5->7->8->9->85->END
}