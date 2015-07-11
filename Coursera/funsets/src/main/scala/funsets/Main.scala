package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  val s:Set = singletonSet(1)
  println(s(1))
  println(s(2))
}
