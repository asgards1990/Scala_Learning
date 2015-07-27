package streams


object test{
 
trait SolutionChecker extends GameDef with Solver with StringParserTerrain {
    /**
     * This method applies a list of moves `ls` to the block at position
     * `startPos`. This can be used to verify if a certain list of moves
     * is a valid solution, i.e. leads to the goal.
     */
    def solve(ls: List[Move]): Block =
      ls.foldLeft(startBlock) { case (block, move) => move match {
        case Left => block.left
        case Right => block.right
        case Up => block.up
        case Down => block.down
        }
      }
    
    }
    
    class Level1 extends SolutionChecker {
      /* terrain for level 1*/

    val level =
    """ooo-------
      |oSoooo----
      |ooooooooo-
      |-ooooooooo
      |-----ooToo
      |------ooo-""".stripMargin

    val optsolution = List(Right, Right, Down, Right, Right, Right, Down)
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1294); 


    val l = new Level1
    {
      val t1 = terrain(Pos(0,0))
      val t2 = !terrain(Pos(4,11))
      val t3 =startPos == Pos(1,1)
      val pStart = pathsFromStart
      val solutions=  pathsFromStart filter (x => done(x._1))
      val t = done(Block(Pos(4,7),Pos(4,7)))
      val aaa = (pStart.filter(x => x._2.length == 6&&(x._1).b1==Pos(4,6)))
      val last = solution.length == optsolution.length
    };System.out.println("""l  : streams.test.Level1{val t1: Boolean; val t2: Boolean; val t3: Boolean; val pStart: Stream[(this.Block, List[this.Move])]; val solutions: scala.collection.immutable.Stream[(this.Block, List[this.Move])]; val t: Boolean; val aaa: scala.collection.immutable.Stream[(this.Block, List[this.Move])]; val last: Boolean} = """ + $show(l ));$skip(69); val res$0 = 
 //l.t1
 //l.t2
 //l.t3
 (l.pStart.filter(x => x._2.length == 6))(0);System.out.println("""res0: (streams.test.l.Block, List[streams.test.l.Move]) = """ + $show(res$0));$skip(7); val res$1 = 
 l.aaa;System.out.println("""res1: scala.collection.immutable.Stream[(streams.test.l.Block, List[streams.test.l.Move])] = """ + $show(res$1));$skip(13); val res$2 = 
//l.goal
l.t;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(14); val res$3 = 


l.solutions;System.out.println("""res3: scala.collection.immutable.Stream[(streams.test.l.Block, List[streams.test.l.Move])] = """ + $show(res$3));$skip(44); 
  
def me(n:Int): Stream[Int] = 1#::me(n+1);System.out.println("""me: (n: Int)Stream[Int]""");$skip(9); val res$4 = 
 
l.last;System.out.println("""res4: Boolean = """ + $show(res$4))}
  

    
}
