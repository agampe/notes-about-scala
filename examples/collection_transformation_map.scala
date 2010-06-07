List("A", "Cat").map(s => s.toLowerCase) // List[java.lang.String] = List(a, cat)

// kuerzer: List("A", "Cat").map(_.toLowerCase)

List("A", "Cat").map(_.length)
// List[Int] = List(1, 3)
