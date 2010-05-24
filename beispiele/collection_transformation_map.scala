List("A", "Cat").map(s => s.toLowerCase)
// kuerzer: List("A", "Cat").map(_.toLowerCase)
// List[java.lang.String] = List(a, cat)

List("A", "Cat").map(_.length)
// List[Int] = List(1, 3)
