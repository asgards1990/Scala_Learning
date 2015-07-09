package patmat

import patmat.Huffman._

object encodingDecoding {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(126); 
  val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5);System.out.println("""t1  : patmat.Huffman.Fork = """ + $show(t1 ));$skip(101); 
  val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9);System.out.println("""t2  : patmat.Huffman.Fork = """ + $show(t2 ));$skip(34); 
  var l = encode(t1)("ab".toList);System.out.println("""l  : List[patmat.Huffman.Bit] = """ + $show(l ));$skip(40); 
  val l2 = quickEncode(t1)("ab".toList);System.out.println("""l2  : List[patmat.Huffman.Bit] = """ + $show(l2 ));$skip(15); val res$0 = 
  decode(t1,l);System.out.println("""res0: List[Char] = """ + $show(res$0));$skip(26); 
  val table = convert(t2);System.out.println("""table  : patmat.Huffman.CodeTable = """ + $show(table ));$skip(22); val res$1 = 
	codeBits(table)('d');System.out.println("""res1: List[patmat.Huffman.Bit] = """ + $show(res$1));$skip(26); 
	val test = decodedSecret;System.out.println("""test  : List[Char] = """ + $show(test ))}
}
