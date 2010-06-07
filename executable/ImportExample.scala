import collection.mutable.{Map => Marf}

object ImportExample extends Application{
  val mymap = Marf("dwarf" -> 1, "elves" -> 2) // instead of Map
  
  class Goblin {
    val goblinName = "Gratsnik"
    def bellow {
      println("yes-yes")
    }
  }
  
  val test = new Goblin
  
  // import of instance's members
  import test._
  bellow
  goblinName  
}

