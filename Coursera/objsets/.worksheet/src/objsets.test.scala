package objsets

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(110); 
  val google = List("android", "Android", "galaxy", "Galaxy", "nexus", "Nexus");System.out.println("""google  : List[String] = """ + $show(google ));$skip(19); 
  val s = "galaxy";System.out.println("""s  : String = """ + $show(s ));$skip(20); val res$0 = 
  google contains s;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(23); 
  val set1 = new Empty;System.out.println("""set1  : objsets.Empty = """ + $show(set1 ));$skip(55); 
    val set2 = set1.incl(new Tweet("a", "a body", 20));System.out.println("""set2  : objsets.TweetSet = """ + $show(set2 ));$skip(55); 
    val set3 = set2.incl(new Tweet("b", "b body", 20));System.out.println("""set3  : objsets.TweetSet = """ + $show(set3 ));$skip(40); 
    val c = new Tweet("c", "c body", 7);System.out.println("""c  : objsets.Tweet = """ + $show(c ));$skip(40); 
    val d = new Tweet("d", "d body", 9);System.out.println("""d  : objsets.Tweet = """ + $show(d ));$skip(29); 
    val set4c = set3.incl(c);System.out.println("""set4c  : objsets.TweetSet = """ + $show(set4c ));$skip(29); 
    val set4d = set3.incl(d);System.out.println("""set4d  : objsets.TweetSet = """ + $show(set4d ));$skip(29); 
    val set5 = set4c.incl(d);System.out.println("""set5  : objsets.TweetSet = """ + $show(set5 ));$skip(120); 
    
   def asSet(tweets: TweetSet): Set[Tweet] = {
    var res = Set[Tweet]()
    tweets.foreach(res += _)
    res
  };System.out.println("""asSet: (tweets: objsets.TweetSet)Set[objsets.Tweet]""");$skip(50); 

  def size(set: TweetSet): Int = asSet(set).size;System.out.println("""size: (set: objsets.TweetSet)Int""");$skip(51); val res$1 = 


 
  size(set1.filter(tw => tw.user == "a")) == 0;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(47); val res$2 = 
  size(set5.filter(tw => tw.user == "a")) == 1;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(49); val res$3 = 
	size(set5.filter(tw => tw.retweets == 20)) == 2;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(31); val res$4 = 
	size(set4c.union(set4d)) == 4;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(29); val res$5 = 
	size(set5.union(set1)) == 4;System.out.println("""res5: Boolean = """ + $show(res$5));$skip(29); val res$6 = 
	size(set1.union(set5)) == 4;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(39); 
	val trends = set5.descendingByRetweet;System.out.println("""trends  : objsets.TweetList = """ + $show(trends ));$skip(18); val res$7 = 
  !trends.isEmpty;System.out.println("""res7: Boolean = """ + $show(res$7));$skip(53); val res$8 = 
  trends.head.user == "a" || trends.head.user == "b";System.out.println("""res8: Boolean = """ + $show(res$8))}
 
}
