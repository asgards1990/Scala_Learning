package Week5

import ListReductionFun._

object ReductionFun {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); val res$0 = 
  fact(0);System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  fact(1);System.out.println("""res1: Int = """ + $show(res$1));$skip(11); val res$2 = 
  fact(10);System.out.println("""res2: Int = """ + $show(res$2));$skip(27); 
  val l = generateList(25);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(15); val res$3 = 
  lengthFun(l);System.out.println("""res3: Int = """ + $show(res$3))}
}
