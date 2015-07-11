package funsets

object temp {

  type Set = Int => Boolean

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: funsets.temp.Set, elem: Int)Boolean

  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = x => x == elem
                                                  //> singletonSet: (elem: Int)funsets.temp.Set

  val s:Set = singletonSet(1)                     //> s  : funsets.temp.Set = <function1>
  println(s(1))                                   //> true
  println(s(2))                                   //> false
}