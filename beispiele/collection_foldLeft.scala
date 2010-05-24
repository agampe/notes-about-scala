List(1,2,3,4).foldLeft(2) (_ + _)
// Int = 12

List(1,2,3,4).foldLeft(1) (_ * _)
// Int = 24

List("b", "a", "elwood", "archer").foldLeft(0)(_ + _.length)
