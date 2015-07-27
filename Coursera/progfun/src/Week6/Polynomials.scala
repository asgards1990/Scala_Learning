package Week6

/**
 * @author corpus
 */
object Polynomials {
  
  class Poly(terms0:Map[Int,Double]) {
    
    def this(bindings: (Int,Double)*) = this(bindings.toMap)
    
    val terms = terms0 withDefaultValue 0.0
    override def toString: String = 
      (for ((exp,coeff) <- terms.toList.sorted.reverse) yield coeff+"x^"+exp) mkString " + "
      
      
    //def + (other: Poly) = new Poly (terms ++ (other.terms map adjust))
    
    def adjust(term: (Int,Double)): (Int, Double) = {
      val (exp, coeff) = term
      (exp,(coeff + terms(exp)))
    }
    
    def + (other:Poly) = 
      new Poly(((other.terms foldLeft terms)(addTerm)))
          
    def addTerm(terms: Map[Int,Double], term: (Int,Double)): Map[Int,Double] = 
      terms+(term._1 -> (term._2+terms(term._1)))
    
  }
  
}