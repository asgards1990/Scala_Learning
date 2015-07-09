

/**
 * @author su.yang
 */
class Zero (private val nom: String, private var age: Int, private var citation: String = "Aucune citation") {

  // with 2.11 can't use default parameters in auxiliary constructors.
   def this(_age: Int, _nom: String, _citation: String ) = 
     this(_nom, _age, _citation)
   def this(_age: Int, _nom: String) = this(_nom, _age)
//  var nom = _nom

  def afficher = println("Nom: " + nom + " Age: " + age + " Citation: " + citation)
  def avancerAge = age += 1
  var msg = "Aucun Message"
  def afficherMessage = println(msg)
  def envoyerMessage(nouveauMsg: String, z: Zero) = {z.msg = nouveauMsg}
//  Zozor.direBonjour(this)
}

//
////factory
//object Zero {
//  def apply(nom: String, age: Int, citation: String = "Aucune citation") = { // l'argument citation est facultatif, on lui donne donc une valeur par défaut
//    val resultat = new Zero
//    resultat.nom = nom
//    resultat.age = age
//    resultat.citation = citation
//    resultat // ou return resultat
//  }
//}

object Zozor {
  def afficher(msg: String) = println(msg)
  def envoyerMessage(msg: String, z: Zero) = z.msg = msg
//  def direBonjour(z: Zero) = println("Bonjour, "+z.nom+ "!") // ceci ne marche plus car private
}