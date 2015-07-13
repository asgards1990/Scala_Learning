package forcomp

import Anagrams._
object test {
  val word = "ababCdseab"                         //> word  : String = ababCdseab
  val w2 = "HEJEJ"                                //> w2  : String = HEJEJ
  val lw =List(word,w2,"the","Third")             //> lw  : List[String] = List(ababCdseab, HEJEJ, the, Third)
  wordOccurrences(word)                           //> res0: forcomp.Anagrams.Occurrences = List((a,3), (b,3), (c,1), (d,1), (e,1),
                                                  //|  (s,1))
  sentenceOccurrences(lw)                         //> res1: forcomp.Anagrams.Occurrences = List((a,3), (b,3), (c,1), (d,2), (e,4),
                                                  //|  (h,3), (i,1), (j,2), (r,1), (s,1), (t,2))
  combinations(wordOccurrences("aabb"))           //> res2: List[forcomp.Anagrams.Occurrences] = List(List(), List((a,1)), List((a
                                                  //| ,2)), List((b,1)), List((a,1), (b,1)), List((a,2), (b,1)), List((b,2)), List
                                                  //| ((a,1), (b,2)), List((a,2), (b,2)))

    val sentence = List("Linux", "rulez")         //> sentence  : List[String] = List(Linux, rulez)
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
    )                                             //> anas  : List[List[String]] = List(List(Rex, Lin, Zulu), List(nil, Zulu, Rex)
                                                  //| , List(Rex, nil, Zulu), List(Zulu, Rex, Lin), List(null, Uzi, Rex), List(Rex
                                                  //| , Zulu, Lin), List(Uzi, null, Rex), List(Rex, null, Uzi), List(null, Rex, Uz
                                                  //| i), List(Lin, Rex, Zulu), List(nil, Rex, Zulu), List(Rex, Uzi, null), List(R
                                                  //| ex, Zulu, nil), List(Zulu, Rex, nil), List(Zulu, Lin, Rex), List(Lin, Zulu, 
                                                  //| Rex), List(Uzi, Rex, null), List(Zulu, nil, Rex), List(rulez, Linux), List(L
                                                  //| inux, rulez))
  
   sentenceAnagrams(sentence).toSet == anas.toSet //> res3: Boolean = true

	
}