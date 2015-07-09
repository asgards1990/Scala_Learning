import Week3._

object SessionOnRationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); val res$0 = 
  new Rational(1,23);System.out.println("""res0: Week3.Rational = """ + $show(res$0));$skip(50); 
  
  def error(msg:String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(13); 
  val x=null;System.out.println("""x  : Null = """ + $show(x ));$skip(19); 
  val y:String = x;System.out.println("""y  : String = """ + $show(y ));$skip(27); val res$1 = 
  
	if (true) 1 else false;System.out.println("""res1: AnyVal = """ + $show(res$1));$skip(30); 
	
	val l:Nil[Int] =  new Nil;System.out.println("""l  : Week3.Nil[Int] = """ + $show(l ));$skip(36); 
	
	val l2:List[Int] = new Cons(1,l);System.out.println("""l2  : Week3.List[Int] = """ + $show(l2 ));$skip(9); val res$2 = 
	l2.head;System.out.println("""res2: Int = """ + $show(res$2));$skip(61); 
	
	val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : Week3.Cons[Int] = """ + $show(list ));$skip(23); val res$3 = 
 	Main.nthElem(2,list);System.out.println("""res3: Int = """ + $show(res$3));$skip(23); val res$4 = 
 	Main.nthElem(4,list);System.out.println("""res4: Int = """ + $show(res$4));$skip(27); val res$5 = 
 	
 	Main.nthElem(-1,list);System.out.println("""res5: Int = """ + $show(res$5))}
	
	
}
