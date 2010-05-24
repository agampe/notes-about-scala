val f: Int => String = x => "Dude: "+x
val g: Int => Double = x => 20.0
def t42[T](f: Int => T): T = f(42)
// t42: [T]((Int) => T)T

t42(f)
// String = Dude: 42

t42(g)
// Double = 20.0

t42(1 +)
// Int = 43
