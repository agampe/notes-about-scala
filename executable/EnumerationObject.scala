object Breed extends Enumeration {
  val moulder = Value("Master Moulders")
  val pestilens = Value("Biological Weapon")
  val eshin = Value("Assassins")
  val skyre = Value("Gatling Gun and Warpstone")
  val khazad = Value("Great race in Warhammer")
}

object EnumerationObject extends Application{
  for (breed <- Breed) println(breed.id + "\t" + breed)
  
  // print just the molders :)
  println("\nJust Moulders:")
  Breed.filter(_.toString.endsWith("Moulders")).foreach(println)
}
