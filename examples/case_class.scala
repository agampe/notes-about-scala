case class Stuff(name: String, age: Int)

# erzeuge eine Instanz
val s = Stuff("Arsch", 24)

# equals-Methode anwenden
s == Stuff("Arsch", 24)

# Zugriff auf die Member-Variablen
s.name; s.age;

# eigene Klasse schreiben, die das gleiche leistet wie die case-Klasse
class Stuff(val name: String, val age: Int) {
  override def toString = "Stuff("+name+","+age+")"
  override def hashCode = name.hashCode + age
  override def equals(other: AnyRef) = other match {
    case s: Stuff => this.name == s.name && this.age == s.age
    case _ => false
  }
}

