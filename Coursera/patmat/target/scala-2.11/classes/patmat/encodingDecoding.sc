package patmat

import patmat.Huffman._

object encodingDecoding {
  val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
                                                  //> t1  : patmat.Huffman.Fork = Fork(Leaf(a,2),Leaf(b,3),List(a, b),5)
  val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)
                                                  //> t2  : patmat.Huffman.Fork = Fork(Fork(Leaf(a,2),Leaf(b,3),List(a, b),5),Leaf
                                                  //| (d,4),List(a, b, d),9)
  var l = encode(t1)("ab".toList)                 //> l  : List[patmat.Huffman.Bit] = List(0, 1)
  val l2 = quickEncode(t1)("ab".toList)           //> l2  : List[patmat.Huffman.Bit] = List(0, 1)
  decode(t1,l)                                    //> res0: List[Char] = List(a, b)
  val table = convert(t2)                         //> table  : patmat.Huffman.CodeTable = List((a,List(0, 0)), (b,List(0, 1)), (d,
                                                  //| List(1)))
	codeBits(table)('d')                      //> res1: List[patmat.Huffman.Bit] = List(1)
	val test = decodedSecret                  //> test  : List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
}