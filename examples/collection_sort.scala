List(99, 2, 1, 45).sort(_ < _)
// List[Int] = List(1, 2, 45, 99)

List("b", "a", "elwood", "archer").sort(_ < _)
//List[java.lang.String] = List(a, archer, b, elwood)

List("b", "a", "elwood", "archer").sort(_.length > _.length)
// List(archer, elwood, a, b)
