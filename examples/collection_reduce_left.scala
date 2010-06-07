List(8, 6, 22, 2).reduceLeft(_ max _)
// Int = 22

// reduceLeft verwenden, um das laengste Wort zu finden
List("moose", "cow", "A", "Cat").
reduceLeft((a, b) => if (a.length > b.length) a else b)
// java.lang.String = moose
