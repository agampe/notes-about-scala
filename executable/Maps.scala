object Maps extends Application {
  val colors = Map("Bla" -> 0xFF,
                    "Blubb" -> 0xDD)
  val colorArray = List("Bla", "Po")
  for (name <- colorArray) println(
    colors.get(name) match {
      case Some(code)  =>
        name + " has code " + code
      case None =>
        "Unknown color: " + name
    }
  )  
}

