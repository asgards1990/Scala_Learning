package Week2
import math.abs

object Session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(194); 
 
  def mapReduce(g:(Int,Int)=>Int,f:Int => Int,neutral:Int)(a:Int,b:Int): Int=
  	if (a>b) neutral
   	else g(f(a),mapReduce(g,f,neutral)(a+1,b));System.out.println("""mapReduce: (g: (Int, Int) => Int, f: Int => Int, neutral: Int)(a: Int, b: Int)Int""");$skip(89); val res$0 = 
                                                  
  mapReduce((x,y)=>x*y,x=>x*x,1)(3,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(82); 
  
  def product(f: Int => Int)(a:Int,b:Int): Int= mapReduce((x,y)=>x*y,f,1)(a,b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(28); val res$1 = 
    	product(x => x*x)(3,4);System.out.println("""res1: Int = """ + $show(res$1));$skip(44); 
		def factorial(n:Int)=product(x =>x )(1,n);System.out.println("""factorial: (n: Int)Int""");$skip(18); val res$2 = 
		  factorial(10);System.out.println("""res2: Int = """ + $show(res$2));$skip(30); 
		  
		  val tolerance=0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(69); 
		  def isCloseEnough(x:Double,y:Double) =
		  	abs(x-y)<tolerance*x;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(67); 
		  	
	def averageDamp(f: Double => Double)(x:Double) = (x+f(x))/2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(253); 

  def fixedPoint(f:Double =>Double)(firstGuess: Double) = {
	  def iterate(guess:Double): Double = {
	  	println("guess = "+guess)
	  	val next = f(guess)
	  	if (isCloseEnough(guess,next)) next
	  	else iterate(next)
	  	}
	  	iterate(firstGuess)
  };System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(63); 
  
  def sqrt(x:Double) = fixedPoint(averageDamp(y => x/y))(1);System.out.println("""sqrt: (x: Double)Double""");$skip(9); val res$3 = 
	sqrt(2);System.out.println("""res3: Double = """ + $show(res$3))}
}
