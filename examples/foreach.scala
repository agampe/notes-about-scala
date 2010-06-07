List(1, 2, 3, 4, 5) foreach { i => println("Int: " + i) }
val stateCapitals = Map(
  "Lustria" -> "Montgomery",
  "Great Mountains" -> "Karaz-A-Karak",
  "Imperium" -> "Altdorf")
stateCapitals foreach { kv => println(kv._1 + ": " + kv._2) }

trait Iterable[+A] {
  ...
  def foreach(f : (A) => Unit) : Unit = ...
  ...
}

