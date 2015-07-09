package Week3

/**
 * @author su.yang
 */
class Rational(x:Int,y:Int) {
  require(y>0,"denominator must be positive")
  private def gcd(a:Int,b:Int):Int= if (b==0) a else gcd(b,a%b)
  private val g=gcd(x,y)
  def num=x/g
  def den=y/g  
  override def toString = num+"/"+den
  
  def +(r:Rational)= new Rational(num*r.den+den*r.num,den*r.den)
  def -(r:Rational)= new Rational(num*r.den-den*r.num,den*r.den)
  def *(r:Rational)= new Rational(num*r.num,den*r.den)
  def <(r:Rational)= (num*r.den<den*r.num)
  def unary_-(r:Rational) = new Rational(-num,den)
  
  def max(r:Rational) = if (this<r) r else this
  def min(r:Rational) = if (this<r) this else r
}