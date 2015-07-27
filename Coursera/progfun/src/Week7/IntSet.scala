package Week6

/**
 * @author su.yang
 */
abstract class IntSet {
  def incl(x:Int): IntSet
  def contains(x:Int): Boolean
  def union(other:IntSet): IntSet
}


class Empty extends IntSet {
  def contains(x:Int): Boolean=false
  def incl(x:Int):IntSet = new NonEmpty(x,new Empty, new Empty)
  def union(other:IntSet): IntSet = other
  override def toString = "."
}

//one can override def in superclasses by using override
class NonEmpty(root:Int,left:IntSet,right:IntSet) extends IntSet {

  def contains(x:Int): Boolean = {
    if (x==root) true
    else if (x>root) right.contains(x)
    else left.contains(x)
  }
  
  def incl(x:Int): IntSet = {
    if (x>root) new NonEmpty(root,left,right.incl(x))
    else if (x<root) new NonEmpty(root,left.incl(x),right)
    else this
  }
  
  def union(other:IntSet):IntSet = {
    (right union (left union other)) incl root
  }
  override def toString = "{"+ left+ root + right + "}"
}

  
  abstract class Base  {
    def foo = 1
    def bar: Int
  }
  
  class Sub extends Base {
    override def foo = 2
    def bar = 4
  }