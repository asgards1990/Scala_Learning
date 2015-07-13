package forcomp

import Anagrams._
object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  val word = "ababCdseab";System.out.println("""word  : String = """ + $show(word ));$skip(19); 
  val w2 = "HEJEJ";System.out.println("""w2  : String = """ + $show(w2 ));$skip(38); 
  val lw =List(word,w2,"the","Third");System.out.println("""lw  : List[String] = """ + $show(lw ));$skip(24); val res$0 = 
  wordOccurrences(word);System.out.println("""res0: forcomp.Anagrams.Occurrences = """ + $show(res$0));$skip(26); val res$1 = 
  sentenceOccurrences(lw);System.out.println("""res1: forcomp.Anagrams.Occurrences = """ + $show(res$1));$skip(40); val res$2 = 
  combinations(wordOccurrences("aabb"));System.out.println("""res2: List[forcomp.Anagrams.Occurrences] = """ + $show(res$2));$skip(43); 

    val sentence = List("Linux", "rulez");System.out.println("""sentence  : List[String] = """ + $show(sentence ));$skip(698); 
    val anas = List(
      List("Rex", "Lin", "Zulu"),
      List("nil", "Zulu", "Rex"),
      List("Rex", "nil", "Zulu"),
      List("Zulu", "Rex", "Lin"),
      List("null", "Uzi", "Rex"),
      List("Rex", "Zulu", "Lin"),
      List("Uzi", "null", "Rex"),
      List("Rex", "null", "Uzi"),
      List("null", "Rex", "Uzi"),
      List("Lin", "Rex", "Zulu"),
      List("nil", "Rex", "Zulu"),
      List("Rex", "Uzi", "null"),
      List("Rex", "Zulu", "nil"),
      List("Zulu", "Rex", "nil"),
      List("Zulu", "Lin", "Rex"),
      List("Lin", "Zulu", "Rex"),
      List("Uzi", "Rex", "null"),
      List("Zulu", "nil", "Rex"),
      List("rulez", "Linux"),
      List("Linux", "rulez")
    );System.out.println("""anas  : List[List[String]] = """ + $show(anas ));$skip(53); val res$3 = 
  
   sentenceAnagrams(sentence).toSet == anas.toSet;System.out.println("""res3: Boolean = """ + $show(res$3))}

	
}
