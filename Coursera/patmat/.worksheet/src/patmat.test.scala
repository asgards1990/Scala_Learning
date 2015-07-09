package patmat
import patmat.Huffman._
object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(116); 
	val lc = List('x','c','y','s','d','x','x','y','v','b','x','c');System.out.println("""lc  : List[Char] = """ + $show(lc ));$skip(22); 
	val time = times(lc);System.out.println("""time  : List[(Char, Int)] = """ + $show(time ));$skip(30); 
  val tm = lc.groupBy(x => x);System.out.println("""tm  : scala.collection.immutable.Map[Char,List[Char]] = """ + $show(tm ));$skip(31); 
  val y:List[Char] = (tm('x'));System.out.println("""y  : List[Char] = """ + $show(y ));$skip(21); val res$0 = 
  y.count(x => true);System.out.println("""res0: Int = """ + $show(res$0));$skip(57); 
  var m:scala.collection.immutable.Map[Char,Int] = Map();System.out.println("""m  : scala.collection.immutable.Map[Char,Int] = """ + $show(m ));$skip(22); 
  var n = m+ ('t'->1);System.out.println("""n  : scala.collection.immutable.Map[Char,Int] = """ + $show(n ));$skip(96); 
  lc.foreach(c => {println(c)
  if (m isDefinedAt c) m=m.updated(c,m(c)+1)
  else m=m+(c->1) });$skip(4); val res$1 = 
  m;System.out.println("""res1: scala.collection.immutable.Map[Char,Int] = """ + $show(res$1));$skip(37); 
  var res: List[(Char,Int)] = List();System.out.println("""res  : List[(Char, Int)] = """ + $show(res ));$skip(83); 
  m.foreach {case(key,value) => {println(key+"="+value)
  res = (key,value)::res}};$skip(6); val res$2 = 
  res;System.out.println("""res2: List[(Char, Int)] = """ + $show(res$2))}
  
 
}
