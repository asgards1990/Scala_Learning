
import scala.Console
/**
 * @author su.yang
 */


object Main {
  def main(args: Array[String]) : Unit = {
//    val z = new Zero("J-V",34)
    val z = new Zero(34,"J-V")

    Zozor.envoyerMessage("Salut", z)
    z.afficher
    z.afficherMessage
    
    Zozor.afficher("Le nouveau LDZ sortira dans quelques jours :)")
    Console.print('a') // affiche a
    Console.println // n'affiche rien et fait un retour à la ligne, équivalent à Console.print('\n')
    Console.println("Je vous aime les zéros <3") // affiche Je vous aime les zéros <3 et retourne à la ligne
//    Console.println(new Zero) // affiche une référence de la forme @ac34f
//    println("Please enter your full name:")
//    val s = readLine
//    println("Welcome, " + s + "!")
//    println("Donner un entier: ");
//    val n = readInt
//    println("Donner un réel : ")
//    val x = readDouble
//    println("Vous avez entré "+  n + " et " + x)
//    val somme = n + x 
//    println("Leur somme est " + somme)
  }
}

