package Week1

object Session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(36); val res$0 = 
 1+2;System.out.println("""res0: Int(3) = """ + $show(res$0));$skip(42); 
 def abs(x: Double) = if (x>=0) x else -x;System.out.println("""abs: (x: Double)Double""");$skip(562); 
 
 //The bloc is a nested name-space, very useful if no reused functions are involved.
 //By nesting things, no need to pass explicit arguments that are unique and passed from outside.
 def sqrt(x:Double) = {
 
 //By writing operators, here "=" on the first line, we tell Scala that the expression is not
 //finished yet.
 def isGoodEnough(guess:Double) =
 	(abs(guess*guess-x)<x/10000)
 
 def improve(guess:Double)=
 	(guess+x/guess)/2
 
 def sqrtIter(guess:Double):Double=
 	if(isGoodEnough(guess)) guess
 	else sqrtIter(improve(guess))
 	
  sqrtIter(1.0)
  };System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$1 = 
 
 sqrt(2);System.out.println("""res1: Double = """ + $show(res$1));$skip(9); val res$2 = 
 sqrt(4);System.out.println("""res2: Double = """ + $show(res$2));$skip(12); val res$3 = 
 sqrt(1e-6);System.out.println("""res3: Double = """ + $show(res$3));$skip(12); val res$4 = 
 sqrt(1e60);System.out.println("""res4: Double = """ + $show(res$4));$skip(13); val res$5 = 
 sqrt(0.001);System.out.println("""res5: Double = """ + $show(res$5));$skip(15); val res$6 = 
 sqrt(0.1e-20);System.out.println("""res6: Double = """ + $show(res$6));$skip(12); val res$7 = 
 sqrt(1e20);System.out.println("""res7: Double = """ + $show(res$7));$skip(12); val res$8 = 
 sqrt(1e50);System.out.println("""res8: Double = """ + $show(res$8));$skip(62); 
 
	def gcd(a:Int, b:Int): Int=
		if (b==0) a else gcd(b, a%b);System.out.println("""gcd: (a: Int, b: Int)Int""");$skip(16); val res$9 = 
 	
 	gcd(14,21);System.out.println("""res9: Int = """ + $show(res$9));$skip(68); 
 	
 	def factorial(n:Int):Int=
 		if (n==0) 1 else factorial(n-1)*n;System.out.println("""factorial: (n: Int)Int""");$skip(20); val res$10 = 
 		
 		factorial(4);System.out.println("""res10: Int = """ + $show(res$10));$skip(157); 
 		
 	def factorialTailRec(n:Int)={
 		def factorialRec(output:Int,m:Int):Int=
 			if (m==0) output else factorialRec(output*m,m-1)
 		factorialRec(1,n)
 	};System.out.println("""factorialTailRec: (n: Int)Int""");$skip(23); val res$11 = 
 	factorialTailRec(10);System.out.println("""res11: Int = """ + $show(res$11))}
}
