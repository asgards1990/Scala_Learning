package patmat
import patmat.Huffman._
object test {
	val lc = List('x','c','y','s','d','x','x','y','v','b','x','c')
                                                  //> lc  : List[Char] = List(x, c, y, s, d, x, x, y, v, b, x, c)
	val time = times(lc)                      //> time  : List[(Char, Int)] = List((d,1), (c,2), (b,1), (v,1), (y,2), (x,4), (
                                                  //| s,1))
  val tm = lc.groupBy(x => x)                     //> tm  : scala.collection.immutable.Map[Char,List[Char]] = Map(s -> List(s), x 
                                                  //| -> List(x, x, x, x), y -> List(y, y), v -> List(v), b -> List(b), c -> List(
                                                  //| c, c), d -> List(d))
  val y:List[Char] = (tm('x'))                    //> y  : List[Char] = List(x, x, x, x)
  y.count(x => true)                              //> res0: Int = 4
  var m:scala.collection.immutable.Map[Char,Int] = Map()
                                                  //> m  : scala.collection.immutable.Map[Char,Int] = Map()
  var n = m+ ('t'->1)                             //> n  : scala.collection.immutable.Map[Char,Int] = Map(t -> 1)
  lc.foreach(c => {println(c)
  if (m isDefinedAt c) m=m.updated(c,m(c)+1)
  else m=m+(c->1) })                              //> x
                                                  //| c
                                                  //| y
                                                  //| s
                                                  //| d
                                                  //| x
                                                  //| x
                                                  //| y
                                                  //| v
                                                  //| b
                                                  //| x
                                                  //| c
  m                                               //> res1: scala.collection.immutable.Map[Char,Int] = Map(s -> 1, x -> 4, y -> 2,
                                                  //|  v -> 1, b -> 1, c -> 2, d -> 1)
  var res: List[(Char,Int)] = List()              //> res  : List[(Char, Int)] = List()
  m.foreach {case(key,value) => {println(key+"="+value)
  res = (key,value)::res}}                        //> s=1
                                                  //| x=4
                                                  //| y=2
                                                  //| v=1
                                                  //| b=1
                                                  //| c=2
                                                  //| d=1
  res                                             //> res2: List[(Char, Int)] = List((d,1), (c,2), (b,1), (v,1), (y,2), (x,4), (s,
                                                  //| 1))
  
 
}