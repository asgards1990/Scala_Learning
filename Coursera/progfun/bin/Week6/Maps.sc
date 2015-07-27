package Week6

import Polynomials._
object Maps {
  val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
                                                  //> romanNumerals  : scala.collection.immutable.Map[String,Int] = Map(I -> 1, V 
                                                  //| -> 5, X -> 10)
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")
                                                  //> capitalOfCountry  : scala.collection.immutable.Map[String,String] = Map(US -
                                                  //| > Washington, Switzerland -> Bern)
  capitalOfCountry get "andorra"                  //> res0: Option[String] = None
  def showCapital(country: String) = capitalOfCountry get(country) match {
  	case None => "missing data"
  	case Some(capital) => capital
  }                                               //> showCapital: (country: String)String
  showCapital("andorra")                          //> res1: String = missing data
  showCapital("US")                               //> res2: String = Washington
  val cap1 = capitalOfCountry withDefaultValue "<unknown>"
                                                  //> cap1  : scala.collection.immutable.Map[String,String] = Map(US -> Washington
                                                  //| , Switzerland -> Bern)
       
  val p1 = new Poly(1 -> 2.0, 3 -> 4.0, 5 -> 6.2) //> p1  : Week6.Polynomials.Poly = 6.2x^5 + 4.0x^3 + 2.0x^1
  val p2 = new Poly(0 -> 3.0, 3 -> 7.0)           //> p2  : Week6.Polynomials.Poly = 7.0x^3 + 3.0x^0
  p1 + p2                                         //> res3: Week6.Polynomials.Poly = 6.2x^5 + 11.0x^3 + 2.0x^1 + 3.0x^0
}