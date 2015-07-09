package Week2
import math.abs

object Session {
 
  def mapReduce(g:(Int,Int)=>Int,f:Int => Int,neutral:Int)(a:Int,b:Int): Int=
  	if (a>b) neutral
   	else g(f(a),mapReduce(g,f,neutral)(a+1,b))//> mapReduce: (g: (Int, Int) => Int, f: Int => Int, neutral: Int)(a: Int, b: In
                                                  //| t)Int
                                                  
  mapReduce((x,y)=>x*y,x=>x*x,1)(3,4)             //> res0: Int = 144
  
  def product(f: Int => Int)(a:Int,b:Int): Int= mapReduce((x,y)=>x*y,f,1)(a,b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
    	product(x => x*x)(3,4)                    //> res1: Int = 144
		def factorial(n:Int)=product(x =>x )(1,n)
                                                  //> factorial: (n: Int)Int
		  factorial(10)                   //> res2: Int = 3628800
		  
		  val tolerance=0.0001            //> tolerance  : Double = 1.0E-4
		  def isCloseEnough(x:Double,y:Double) =
		  	abs(x-y)<tolerance*x      //> isCloseEnough: (x: Double, y: Double)Boolean
		  	
	def averageDamp(f: Double => Double)(x:Double) = (x+f(x))/2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double

  def fixedPoint(f:Double =>Double)(firstGuess: Double) = {
	  def iterate(guess:Double): Double = {
	  	println("guess = "+guess)
	  	val next = f(guess)
	  	if (isCloseEnough(guess,next)) next
	  	else iterate(next)
	  	}
	  	iterate(firstGuess)
  }                                               //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
  
  def sqrt(x:Double) = fixedPoint(averageDamp(y => x/y))(1)
                                                  //> sqrt: (x: Double)Double
	sqrt(2)                                   //> guess = 1.0
                                                  //| guess = 1.5
                                                  //| guess = 1.4166666666666665
                                                  //| guess = 1.4142156862745097
                                                  //| res3: Double = 1.4142135623746899
}