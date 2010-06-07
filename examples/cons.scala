// List[Int] = List(1, 2, 3)
1 :: 2 :: 3 :: Nil

// obiger Code wird auf folgenderweisse ausgewertet
new ::(1, new ::(2, new ::(3, Nil)))
