package Week5

import ListFun._
import ListHigherFun._

object Session1 {
	val l = List(1,List(2,List(3)))           //> l  : List[Any] = List(1, List(2, List(3)))
	init(l)                                   //> res0: List[Any] = List(1)
	removeAt(List('a','b','c','d'),1)         //> res1: List[Char] = List(a, c, d)
	val l2 = List(List(1,1),2,List(3,List(5,8)))
                                                  //> l2  : List[Any] = List(List(1, 1), 2, List(3, List(5, 8)))
	flatten(l2)                               //> res2: List[Any] = List(1, 1, 2, 3, 5, 8)
	val nums = List(1,9,2,4,-1,0,3,3,-4,2,11,7,8,9)
                                                  //> nums  : List[Int] = List(1, 9, 2, 4, -1, 0, 3, 3, -4, 2, 11, 7, 8, 9)
	val fruits = List("Apple","Banana","Pineaple","Orange")
                                                  //> fruits  : List[String] = List(Apple, Banana, Pineaple, Orange)
	//msort(nums)((x,y)=> x<y)
	//msort(fruits)((x,y) => x.compareTo(y) < 0)
	"Apple".compareTo("Banana")               //> res3: Int = -1
	"Banana".compareTo("Apple")               //> res4: Int = 1
	msort(nums)(Ordering.Int)                 //> res5: List[Int] = List(-4, -1, 0, 1, 2, 2, 3, 3, 4, 7, 8, 9, 9, 11)
	msort(fruits)(Ordering.String)            //> res6: List[String] = List(Apple, Banana, Orange, Pineaple)
	filter(nums)(x=>x>0)                      //> res7: List[Int] = List(1, 9, 2, 4, 3, 3, 2, 11, 7, 8, 9)
	filterNot(nums)(x=>x>0)                   //> res8: List[Int] = List(-1, 0, -4)
	partition(nums)(x=>x>0)                   //> res9: (List[Int], List[Int]) = (List(1, 9, 2, 4, 3, 3, 2, 11, 7, 8, 9),List(
                                                  //| -1, 0, -4))
	takeWhile(nums)(x=>x>0)                   //> res10: List[Int] = List(1, 9, 2, 4)
	dropWhile(nums)(x=>x>0)                   //> res11: List[Int] = List(-1, 0, 3, 3, -4, 2, 11, 7, 8, 9)
	span(nums)(x=>x>0)                        //> res12: (List[Int], List[Int]) = (List(1, 9, 2, 4),List(-1, 0, 3, 3, -4, 2, 1
                                                  //| 1, 7, 8, 9))
	val repetition =  List('a','a','a','b','c','c','a')
                                                  //> repetition  : List[Char] = List(a, a, a, b, c, c, a)
	pack(repetition)                          //> res13: List[List[Char]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 
	encode(repetition)                        //> res14: List[(Char, Int)] = List((a,3), (b,1), (c,2), (a,1))
                                                  
}