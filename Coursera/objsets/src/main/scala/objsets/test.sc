package objsets

object test {
  val google = List("android", "Android", "galaxy", "Galaxy", "nexus", "Nexus")
                                                  //> google  : List[String] = List(android, Android, galaxy, Galaxy, nexus, Nexus
                                                  //| )
  val s = "galaxy"                                //> s  : String = galaxy
  google contains s                               //> res0: Boolean = true
  val set1 = new Empty                            //> set1  : objsets.Empty = objsets.Empty@1f7c9157
    val set2 = set1.incl(new Tweet("a", "a body", 20))
                                                  //> set2  : objsets.TweetSet = objsets.NonEmpty@7946738
    val set3 = set2.incl(new Tweet("b", "b body", 20))
                                                  //> set3  : objsets.TweetSet = objsets.NonEmpty@2004916b
    val c = new Tweet("c", "c body", 7)           //> c  : objsets.Tweet = User: c
                                                  //| Text: c body [7]
    val d = new Tweet("d", "d body", 9)           //> d  : objsets.Tweet = User: d
                                                  //| Text: d body [9]
    val set4c = set3.incl(c)                      //> set4c  : objsets.TweetSet = objsets.NonEmpty@be71839
    val set4d = set3.incl(d)                      //> set4d  : objsets.TweetSet = objsets.NonEmpty@70e74c49
    val set5 = set4c.incl(d)                      //> set5  : objsets.TweetSet = objsets.NonEmpty@61418687
    
   def asSet(tweets: TweetSet): Set[Tweet] = {
    var res = Set[Tweet]()
    tweets.foreach(res += _)
    res
  }                                               //> asSet: (tweets: objsets.TweetSet)Set[objsets.Tweet]

  def size(set: TweetSet): Int = asSet(set).size  //> size: (set: objsets.TweetSet)Int


 
  size(set1.filter(tw => tw.user == "a")) == 0    //> res1: Boolean = true
  size(set5.filter(tw => tw.user == "a")) == 1    //> res2: Boolean = true
	size(set5.filter(tw => tw.retweets == 20)) == 2
                                                  //> res3: Boolean = true
	size(set4c.union(set4d)) == 4             //> res4: Boolean = true
	size(set5.union(set1)) == 4               //> res5: Boolean = true
	size(set1.union(set5)) == 4               //> res6: Boolean = true
	val trends = set5.descendingByRetweet     //> trends  : objsets.TweetList = objsets.Cons@30f3c90f
  !trends.isEmpty                                 //> res7: Boolean = true
  trends.head.user == "a" || trends.head.user == "b"
                                                  //> res8: Boolean = true
 
}