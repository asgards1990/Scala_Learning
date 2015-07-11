package funsets

object temp {

  type Set = Int => Boolean;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(180); 

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: funsets.temp.Set, elem: Int)Boolean""");$skip(112); 

  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = x => x == elem;System.out.println("""singletonSet: (elem: Int)funsets.temp.Set""");$skip(31); 

  val s:Set = singletonSet(1);System.out.println("""s  : funsets.temp.Set = """ + $show(s ));$skip(16); 
  println(s(1));$skip(16); 
  println(s(2))}
}
