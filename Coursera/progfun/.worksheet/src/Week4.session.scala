package Week4

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(134); 
 val expr = Prod(Prod(Sum(Sum(Number(1),Number(69)),Number(55)),
 Number(2)),Sum(Number(3),Number(4)));System.out.println("""expr  : Week4.Prod = """ + $show(expr ));$skip(30); 
 val t = Cons(3,Cons(2,Nil ));System.out.println("""t  : Week4.Cons[Int] = """ + $show(t ));$skip(15); val res$0 = 
 test.isort(t);System.out.println("""res0: Week4.List[Int] = """ + $show(res$0));$skip(70); 
 val l = Cons(9,Cons(2,Cons(7,Cons(85,Cons(5,Cons(8,Cons(1,Nil)))))));System.out.println("""l  : Week4.Cons[Int] = """ + $show(l ));$skip(15); val res$1 = 
 test.isort(l);System.out.println("""res1: Week4.List[Int] = """ + $show(res$1))}
}
