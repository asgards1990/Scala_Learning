package Week5

import ListFun._
import ListHigherFun._

object Session1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(106); 
	val l = List(1,List(2,List(3)));System.out.println("""l  : List[Any] = """ + $show(l ));$skip(9); val res$0 = 
	init(l);System.out.println("""res0: List[Any] = """ + $show(res$0));$skip(35); val res$1 = 
	removeAt(List('a','b','c','d'),1);System.out.println("""res1: List[Char] = """ + $show(res$1));$skip(46); 
	val l2 = List(List(1,1),2,List(3,List(5,8)));System.out.println("""l2  : List[Any] = """ + $show(l2 ));$skip(13); val res$2 = 
	flatten(l2);System.out.println("""res2: List[Any] = """ + $show(res$2));$skip(49); 
	val nums = List(1,9,2,4,-1,0,3,3,-4,2,11,7,8,9);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(57); 
	val fruits = List("Apple","Banana","Pineaple","Orange");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(103); val res$3 = 
	//msort(nums)((x,y)=> x<y)
	//msort(fruits)((x,y) => x.compareTo(y) < 0)
	"Apple".compareTo("Banana");System.out.println("""res3: Int = """ + $show(res$3));$skip(29); val res$4 = 
	"Banana".compareTo("Apple");System.out.println("""res4: Int = """ + $show(res$4));$skip(27); val res$5 = 
	msort(nums)(Ordering.Int);System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(32); val res$6 = 
	msort(fruits)(Ordering.String);System.out.println("""res6: List[String] = """ + $show(res$6));$skip(22); val res$7 = 
	filter(nums)(x=>x>0);System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(25); val res$8 = 
	filterNot(nums)(x=>x>0);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(25); val res$9 = 
	partition(nums)(x=>x>0);System.out.println("""res9: (List[Int], List[Int]) = """ + $show(res$9));$skip(25); val res$10 = 
	takeWhile(nums)(x=>x>0);System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(25); val res$11 = 
	dropWhile(nums)(x=>x>0);System.out.println("""res11: List[Int] = """ + $show(res$11));$skip(20); val res$12 = 
	span(nums)(x=>x>0);System.out.println("""res12: (List[Int], List[Int]) = """ + $show(res$12));$skip(53); 
	val repetition =  List('a','a','a','b','c','c','a');System.out.println("""repetition  : List[Char] = """ + $show(repetition ));$skip(18); val res$13 = 
	pack(repetition);System.out.println("""res13: List[List[Char]] = """ + $show(res$13));$skip(20); val res$14 = 
	encode(repetition);System.out.println("""res14: List[(Char, Int)] = """ + $show(res$14))}
                                                  
}
