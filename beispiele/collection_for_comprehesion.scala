def isOdd(in: Int) = in % 2 == 1
def isEven(in: Int) = !isOdd(in)
val n = (1 to 10).toList

// dirty-Variante
n.filter(isEven).flatMap(i => n.filter(isOdd).map(j => i * j))

// for-comprehension
for {i <- n if isEven(i); j <- n if isOdd(j)} yield i * j
// List[Int] = List(2, 6, 10, 14, 18, 4, 12, 20, 28, 36, 6, 18, 30, 42, 54, 8, 24, 40, 56, 72, 10, 30, 50, 70, 90)

