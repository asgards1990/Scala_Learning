package Week7


object testPour {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  val problem = new Pouring(Vector(4,7));System.out.println("""problem  : Week7.Pouring = """ + $show(problem ));$skip(36); 
  val p2 = new Pouring(Vector(4,9));System.out.println("""p2  : Week7.Pouring = """ + $show(p2 ));$skip(39); 
  val p3 = new Pouring(Vector(4,9,19));System.out.println("""p3  : Week7.Pouring = """ + $show(p3 ));$skip(16); val res$0 = 
  problem.moves;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Product with Serializable with Week7.testPour.problem.Move] = """ + $show(res$0));$skip(23); val res$1 = 
  problem.solutions(6);System.out.println("""res1: Stream[Week7.testPour.problem.Path] = """ + $show(res$1));$skip(22); val res$2 = 
   
  p2.solutions(6);System.out.println("""res2: Stream[Week7.testPour.p2.Path] = """ + $show(res$2));$skip(19); val res$3 = 
  p3.solutions(17);System.out.println("""res3: Stream[Week7.testPour.p3.Path] = """ + $show(res$3))}
}
