package Week7


object testPour {
  val problem = new Pouring(Vector(4,7))          //> problem  : Week7.Pouring = Week7.Pouring@54d77925
  val p2 = new Pouring(Vector(4,9))               //> p2  : Week7.Pouring = Week7.Pouring@5f02b4b
  val p3 = new Pouring(Vector(4,9,19))            //> p3  : Week7.Pouring = Week7.Pouring@6f912839
  problem.moves                                   //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with W
                                                  //| eek7.testPour.problem.Move] = Vector(Empty(0), Empty(1), Fill(0), Fill(1), P
                                                  //| our(0,1), Pour(1,0))
  problem.solutions(6)                            //> res1: Stream[Week7.testPour.problem.Path] = Stream(Fill(1) Pour(1,0) Empty(0
                                                  //| ) Pour(1,0) Fill(1) Pour(1,0)--> Vector(4, 6), ?)
   
  p2.solutions(6)                                 //> res2: Stream[Week7.testPour.p2.Path] = Stream(Fill(1) Pour(1,0) Empty(0) Pou
                                                  //| r(1,0) Empty(0) Pour(1,0) Fill(1) Pour(1,0)--> Vector(4, 6), ?)
  p3.solutions(17)                                //> res3: Stream[Week7.testPour.p3.Path] = Stream(Fill(0) Fill(1) Pour(0,2) Fill
                                                  //| (0) Pour(1,2) Pour(0,2)--> Vector(0, 0, 17), ?)
}