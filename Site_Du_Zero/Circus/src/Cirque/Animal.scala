

package Cirque/**
 * @author su.yang
 */

abstract class Animal(protected val nom: String, protected var dresse: Boolean = false) {
  private [Cirque]def dresser = {
    dresse = true
    println("J'ai été dressé !!")
  }
  private [Cirque] def faireLeShow = println("Je ne fais rien !!")
  
  protected var aFaim = false
//  type Aliments //déclaration d'un type membre abstrait qu'on redefinit, car les 
//                //différents animaux mangent différentes nourritures, et on ne peut 
//                //changer le template d'une méthode mère
//  private def manger(a: Aliments) = {
//    aFaim = false
//  }
  
}

//abstract class Carnivore(nom: String, dresse: Boolean = false) extends Animal(nom, dresse) {
//  def manger(a: NourritureCarnivore) = { aFaim = false }
//} 
//
//abstract class Herbivore(nom: String, dresse: Boolean = false) extends Animal(nom, dresse) {
//  def manger(a: NourritureHerbivore)
//} 

//<: means only Animals and their descends can inherite from the trait
trait Carnivore <: Animal {
  def manger(a: NourritureCarnivore)
} 

trait Herbivore <:  Animal {
  def manger(a: NourritureHerbivore)
} 
class Chien(n: String,d: Boolean = false) extends Animal(n,d) with Carnivore{
  def seDeplacer = println("Je marche")
  def afficher = println("Je suis un chien, je m'appelle " + nom)
  override def faireLeShow = if(dresse) println("Je danse !!") else super.faireLeShow
  def manger(nourriture: NourritureCarnivore) = { aFaim = false }
//  override type Aliments = Viande // redéfinition du type membre Aliments
}

class Serpent(n: String,d: Boolean = false) extends Animal(n,d) with Carnivore{
  def seDeplacer = println("Je glisse")
  def afficher = println("Je suis un serpent, je m'appelle " + nom)
  override def faireLeShow = if(dresse) println("Je mange des pizzas !!") else super.faireLeShow
  def manger(nourriture: NourritureCarnivore) = { aFaim = false }
}

class Poisson(n: String,d: Boolean = false) extends Animal(n,d) with Herbivore{
  def seDeplacer = println("Je nage")
  def afficher = println("Je suis un poisson, je m'appelle " + nom)
  override def faireLeShow = if(dresse) println("Je saute !!") else super.faireLeShow
  def manger(nourriture: NourritureHerbivore) = { aFaim = false }
}

object Spot extends Animal("Spot", true) with Carnivore with Herbivore {
  def seDeplacer = println("Je cours")
  def afficher = println("Je suis un hanmster, je m'appelle " + nom)
  override def faireLeShow = if(dresse) println("Je joue au ballon !!") else super.faireLeShow
  def manger(nourriture: NourritureCarnivore) = { aFaim = false }
  def manger(nourriture: NourritureHerbivore) = { aFaim = false }
  //...
}
object Jojo {
  def dresser(a: Animal) = a.dresser
  def faireMangerH(animal: Herbivore, aliment: NourritureHerbivore) = animal.manger(aliment)
  def faireMangerC(animal: Carnivore, aliment: NourritureCarnivore) = animal.manger(aliment)
}