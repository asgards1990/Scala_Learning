object Session {
  val t1 = new NonEmpty(3,Empty,Empty)            //> t1  : NonEmpty = {.3.}
  val t2 = t1 incl 4                              //> t2  : IntSet = {.3{.4.}}
  t1 union t2                                     //> res0: IntSet = {.3{.4.}}
  val t3 = new NonEmpty(12,new NonEmpty(1,Empty,Empty) ,new NonEmpty(55,Empty,Empty) )
                                                  //> t3  : NonEmpty = {{.1.}12{.55.}}
  t2 union t3                                     //> res1: IntSet = {{.1{{.3.}4.}}12{.55.}}
}

//Only abstract classes can contain instances of function without implementation
abstract class IntSet {
	def incl(x:Int): IntSet
	def contains(x:Int): Boolean
	def union(other:IntSet): IntSet
}


object Empty extends IntSet {
	def contains(x:Int): Boolean=false
	def incl(x:Int):IntSet = new NonEmpty(x,Empty, Empty)
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
		((right union left) union other) incl root
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