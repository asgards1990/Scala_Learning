import Week3._

object SessionOnRationals {
  new Rational(1,23)                              //> res0: Week3.Rational = 1/23
  
  def error(msg:String) = throw new Error(msg)    //> error: (msg: String)Nothing
  val x=null                                      //> x  : Null = null
  val y:String = x                                //> y  : String = null
  
	if (true) 1 else false                    //> res1: AnyVal = 1
	
	val l:Nil[Int] =  new Nil                 //> l  : Week3.Nil[Int] = Week3.Nil@40e40f4c
	
	val l2:List[Int] = new Cons(1,l)          //> l2  : Week3.List[Int] = Week3.Cons@7ca1320e
	l2.head                                   //> res2: Int = 1
	
	val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : Week3.Cons[Int] = Week3.Cons@3add750e
 	Main.nthElem(2,list)                      //> res3: Int = 3
 	Main.nthElem(4,list)                      //> java.lang.IndexOutOfBoundsException: Invalid Index
                                                  //| 	at Week3.Main$.nthElem(Main.scala:13)
                                                  //| 	at SessionOnRationals$$anonfun$main$1.apply$mcV$sp(SessionOnRationals.sc
                                                  //| ala:19)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at SessionOnRationals$.main(SessionOnRationals.scala:3)
                                                  //| 	at SessionOnRationals.main(SessionOnRationals.scala)
 	
 	Main.nthElem(-1,list)
	
	
}