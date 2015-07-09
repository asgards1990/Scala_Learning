package Week1

object Session {
 1+2                                              //> res0: Int(3) = 3
 def abs(x: Double) = if (x>=0) x else -x         //> abs: (x: Double)Double
 
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
  }                                               //> sqrt: (x: Double)Double
 
 sqrt(2)                                          //> res1: Double = 1.4142156862745097
 sqrt(4)                                          //> res2: Double = 2.0000000929222947
 sqrt(1e-6)                                       //> res3: Double = 0.0010000001533016628
 sqrt(1e60)                                       //> res4: Double = 1.0000000031080746E30
 sqrt(0.001)                                      //> res5: Double = 0.03162278245070105
 sqrt(0.1e-20)                                    //> res6: Double = 3.1622778383672726E-11
 sqrt(1e20)                                       //> res7: Double = 1.0000021484861237E10
 sqrt(1e50)                                       //> res8: Double = 1.0000003807575104E25
 
	def gcd(a:Int, b:Int): Int=
		if (b==0) a else gcd(b, a%b)      //> gcd: (a: Int, b: Int)Int
 	
 	gcd(14,21)                                //> res9: Int = 7
 	
 	def factorial(n:Int):Int=
 		if (n==0) 1 else factorial(n-1)*n //> factorial: (n: Int)Int
 		
 		factorial(4)                      //> res10: Int = 24
 		
 	def factorialTailRec(n:Int)={
 		def factorialRec(output:Int,m:Int):Int=
 			if (m==0) output else factorialRec(output*m,m-1)
 		factorialRec(1,n)
 	}                                         //> factorialTailRec: (n: Int)Int
 	factorialTailRec(10)                      //> res11: Int = 3628800
}