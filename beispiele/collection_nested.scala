val n = (1 to 3).toList
//List[Int] = List(1, 2, 3)

n.map(i => n.map(j => i * j))
// List[List[Int]] = List(List(1, 2, 3), List(2, 4, 6), List(3, 6, 9))
