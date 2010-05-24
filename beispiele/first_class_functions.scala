// family
def sum(f: Int => Int, a: Int, b: Int):
  Int = if (a > b) 0 else f(a) + sum(f, a + 1, b)

// helper 
def id(x: Int): Int = x
def square(x: Int): Int = x * x

// 
def sumInt(a: Int, b:Int): Int = sum(id, a, b)
def sumSquare(a: Int, b: Int): Int = sum(square, a, b)
