

/**
 * @author su.yang
 */
object Hello extends App{
  println("Hello, World!")
  val x: jourDeLaMalchance = new jourDeLaMalchance
  println("sd")
  x.maledictionDeMario
}

class Personnage {

var nom:String = ""
var hp: Int = 10
var argent:Int = 0

def mourir(s:String = "The hero is dead.") = {println(s); this.perdreVie(1)}

def perdreVie(n:Int) = this.hp -= n
def gagnerArgent(n:Int) = this.argent +=n
def perdreArgent(n:Int) = if (n>=this.argent) argent = 0 else argent -= n
def battre(p:Ennemi) = println(nom + " a battu l'ennemi " + p.nom)
def battre(p:Boss) = println(nom + " a battu le boss " + p.nom)

def entrerChateau =  println("Le personnage " + nom + " est entré dans le chateau!")
def sauter = println ("Le héros a réussit le saut!")
}


class Ennemi {

var nom:String = ""

def battre(p:Personnage) = {
println(nom + " a infligé 1 point de vie à " + p.nom)
p.perdreVie(1) }

}

class Boss {

var nom:String = ""

def battre(p:Personnage) = {
println(nom + " a infligé 1 point de vie au personnage " + p.nom)
p.perdreVie(1)}
def battre(p:Ennemi) = println(nom + " a battu l'ennemi " + p.nom)
def battre(p:Boss) = println(nom + " a battu le boss " + p.nom)

}

class Princesse {

var nom:String = ""

def donnerBisou(p:Personnage) = println("La princesse " + nom +
" a donné un bisou à "+ p.nom)
def gifler(p:Personnage) = {
println("La princesse " + nom + " a giflé "+ p.nom +"!")
p.perdreVie(1) }

}

class jourDeLaMalchance {

var gameOver = false
val rand = new scala.util.Random
var Mario = new Personnage
var Peach = new Princesse
var Bowser = new Boss
var Goomba = new Ennemi

Mario.nom="Mario"
Peach.nom="Peach"
Bowser.nom="Bowser"
Goomba.nom="Goomba"

def chance (n:Int, m:Int) = {
rand.nextInt(m)>=n
}

def maledictionDeMario {
for (i<-1 to 10; if (!gameOver))
{

if (chance(1,5)) {
  Mario.sauter
  if (chance(1,3)||chance(1,3)) {
    Mario.sauter
    if (chance(1,4)) {
      Mario.battre(Goomba)
      if (chance(7,10)) {
        Mario.entrerChateau
        if (chance(1,2)) {
          Mario.battre(Bowser)
          if (chance(1,3)) {
            Peach.donnerBisou(Mario)
            gameOver=true
            }
          else Peach.gifler(Mario)
        }
        else Bowser.battre(Mario)
      }
      else Mario.mourir("Oh, " + Mario.nom +" a été repéré par le gardien!")
    }
    else Goomba.battre(Mario)
  }
  else Mario.mourir(Mario.nom +" est tombé dans le deuxième trou!")
}
else Mario.mourir(Mario.nom + " a raté le premier saut!")

if (Mario.hp==0) gameOver= true
Thread.sleep(3000)
println ("Il reste à " + Mario.nom + " " + Mario.hp + "pv")
println("*" * 50)
}
println("Game Over")

}
}
