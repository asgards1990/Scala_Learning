package Week6

import ForHigherFun._
object For {

		for {
			b1 <- books
			b2 <- books
			if b1.title  < b2.title
			a1 <- b1.authors
			a2 <- b2.authors
			if a1==a2
	  	} yield a1                        //> res0: scala.collection.immutable.Set[String] = Set(By, tester, 1)
	val fruit = List("banana","apple","orange","pear","pineapple")
                                                  //> fruit  : List[String] = List(banana, apple, orange, pear, pineapple)
	List("By","tester","1","again")==List("By","tester","1")
                                                  //> res1: Boolean = false
	
	authosStartWith(books,"1")                //> res2: Set[String] = Set(test5, test)
	
	fruit sortWith (_.length < _.length)      //> res3: List[String] = List(pear, apple, banana, orange, pineapple)
	fruit.sorted                              //> res4: List[String] = List(apple, banana, orange, pear, pineapple)
	fruit groupBy (_.head)                    //> res5: scala.collection.immutable.Map[Char,List[String]] = Map(b -> List(bana
                                                  //| na), p -> List(pear, pineapple), a -> List(apple), o -> List(orange))
}