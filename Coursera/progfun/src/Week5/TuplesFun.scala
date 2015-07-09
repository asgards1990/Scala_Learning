package Week5

/**
 * @author su.yang
 */

case class Tuple2[T1, T2](_1: T1, _2: T2){
  override def toString = "(" + _1 + "," + _2 + ")" 
}