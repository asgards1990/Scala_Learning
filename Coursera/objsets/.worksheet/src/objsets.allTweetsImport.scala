package objsets

import TweetReader._

object allTweetsImport {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(102); 
 val allTweets = TweetReader.allTweets;System.out.println("""allTweets  : objsets.TweetSet = """ + $show(allTweets ))}
 
}
