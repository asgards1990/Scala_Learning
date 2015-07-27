package Week7

/**
 * @author su.yang
 */
object primes {
    def from(n: Int): Stream[Int] = n #:: from(n+1)
    def isPrime(n: Int) = (2 to n/2) forall (n%_!=0)
    
    val nats = from(0)
    val m4s = nats map (_*4)
    
    def sieve(s: Stream[Int]): Stream[Int] =
      s.head #:: sieve(s.tail filter (_%s.head!=0))
    
    def sqrtStream(x: Double): Stream[Double] = {
      def improve(guess: Double) = (guess+x/guess)/2
      lazy val guesses: Stream[Double] = 1 #:: (guesses map improve)
      guesses
    }
    
    def isGoodEnough(guess: Double, x: Double) =
      math.abs(guess*guess/x-1)<0.0001
}