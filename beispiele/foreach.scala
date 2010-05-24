List(1, 2, 3, 4, 5) foreach { i => println("Int: " + i) }
val stateCapitals = Map(
  "Alabama" -> "Montgomery",
  "Alaska" -> "Juneau",
  "Wyoming" -> "Cheyenne")
stateCapitals foreach { kv => println(kv._1 + ": " + kv._2) }


// The signature of foreach is the following:
trait Iterable[+A] {
  ...
  def foreach(f : (A) => Unit) : Unit = ...
  ...
}

