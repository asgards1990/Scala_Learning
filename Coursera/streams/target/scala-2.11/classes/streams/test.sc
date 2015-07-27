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
  }


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
    }                                             //> l  : streams.test.Level1{val t1: Boolean; val t2: Boolean; val t3: Boolean;
                                                  //|  val pStart: Stream[(this.Block, List[this.Move])]; val solutions: scala.co
                                                  //| llection.immutable.Stream[(this.Block, List[this.Move])]; val t: Boolean; v
                                                  //| al aaa: scala.collection.immutable.Stream[(this.Block, List[this.Move])]; v
                                                  //| al last: Boolean} = streams.test$$anonfun$main$1$$anon$1@61bc714e
 //l.t1
 //l.t2
 //l.t3
 (l.pStart.filter(x => x._2.length == 6))(0)      //> res0: (streams.test.l.Block, List[streams.test.l.Move]) = (Block(Pos(4,5),P
                                                  //| os(4,6)),List(Down, Right, Right, Down, Down, Right))
 l.aaa                                            //> res1: scala.collection.immutable.Stream[(streams.test.l.Block, List[streams
                                                  //| .test.l.Move])] = Stream((Block(Pos(4,6),Pos(4,7)),List(Right, Down, Right,
                                                  //|  Down, Right, Right)), ?)
//l.goal
l.t                                               //> res2: Boolean = true


l.solutions                                       //> res3: scala.collection.immutable.Stream[(streams.test.l.Block, List[streams
                                                  //| .test.l.Move])] = Stream((Block(Pos(4,7),Pos(4,7)),List(Right, Down, Right,
                                                  //|  Right, Down, Down, Right)), ?)
  
def me(n:Int): Stream[Int] = 1#::me(n+1)          //> me: (n: Int)Stream[Int]
 
l.last                                            //> res4: Boolean = true
  

    
}