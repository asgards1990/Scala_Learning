package Week3

object Session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  val tree = new NonEmpty(3,new Empty,new Empty);System.out.println("""tree  : Week3.NonEmpty = """ + $show(tree ))}
}

//Only abstract classes can contain instances of function without implementation
abstract class IntSet {
	def incl(x:Int): IntSet
	def contains(x:Int): Boolean
}


class Empty extends IntSet {
	def contains(x:Int): Boolean=false
	def incl(x:Int):IntSet = new NonEmpty(x,new Empty, new Empty)
}

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
}
