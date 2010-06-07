var my_list = List("Test1", "Test2", "Test3", 1)
my_list.foreach(elem => println(elem))
//  my_list.foreach((elem: Int) => println(elem)) funzt nicht
my_list.foreach((elem: Any) => println(elem)) // funzt

List(1, 2, 3, 4, 5) foreach { i => println("Int: " + i) }  


val stateCapitals = Map(
  "Lustria" -> "Montgomery",
  "Great Mountains" -> "Karaz-A-Karak",
  "Imperium" -> "Altdorf")
stateCapitals foreach { kv => println(kv._1 + ": " + kv._2) }

