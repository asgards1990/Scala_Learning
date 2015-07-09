package Week4

/**
 * @author su.yang
 */
//trait Expr {
//  
//  def isNumber: Boolean
//  def isSum: Boolean
//  def numValue: Int
//  def leftOp: Expr
//  def rightOp: Expr
//  override def toString: String
//  
//}
//
//class Number(n: Int) extends Expr {
//  def isNumber: Boolean = true
//  def isSum: Boolean = false
//  def numValue: Int = n
//  def leftOp: Expr = throw new Error ("Number.leftOp")
//  def rightOp: Expr  = throw new Error ("Number.rightOp")
//}
//
//class Sum(e1: Expr, e2: Expr) extends Expr {
//  def isNumber: Boolean = false
//  def isSum: Boolean = true
//  def numValue: Int = throw new Error("Sum.numValue")
//  def leftOp: Expr = e1
//  def rightOp: Expr  = e2
//}

//This is OO decomposition applied to expressions

trait Expr {
  def eval: Int = this match {
    case Number(n) => n
    case Sum(e1,e2) => e1.eval+e2.eval
  }
  override def toString: String = this match {
    case Number(n) => n.toString
    case Sum(e1,e2) => e1+" + "+e2
    case Prod(e1,e2) => (e1,e2) match {
      case (Sum(f1,f2),Sum(g1,g2)) => "("+e1+")"+" * "+"("+e2+")"
      case(Sum(f1,f2),_) => "("+e1+")"+" * "+e2
      case(_,Sum(g1,g2)) => e1+" * "+"("+e2+")"
      case(_,_) => e1+" * "+e2
    }    
  }
  
}

case class Number(n: Int) extends Expr

case class Sum(e1: Expr, e2: Expr) extends Expr

case class Prod(e1: Expr, e2: Expr) extends Expr

case class Variable(n: Int) extends Expr
