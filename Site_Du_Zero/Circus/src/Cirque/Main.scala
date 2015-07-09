// All methods are virtual in Scala, meaning it's the inherited class's methods
//that is called in priority, whereas in C++ it's the mother class.

package Cirque/**
 * @author su.yang
 */

object Main {
  
  def main(args: Array[String]) {
  val chien = new Chien("Bobby")
  val serpent = new Serpent("Tika")
  chien.afficher
  Jojo.dresser(chien)
  serpent.afficher   
  chien.seDeplacer
  serpent.seDeplacer
//  println(chien.isInstanceOf[Animal])
//  println(Jojo.isInstanceOf[Animal])
  chien.faireLeShow
  serpent.faireLeShow
  Jojo.dresser(serpent)
  serpent.faireLeShow
  val viande = new Viande
  Jojo.faireMangerC(chien, viande)
  }

}