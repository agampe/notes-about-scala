var p = Map(1 -> "David", 9 -> "Elwood")
// Map[Int,java.lang.String] = Map(1 -> David, 9 -> Elwood)

// an eine Map noch ein Element dranhaengen
p + 2 -> "test"
// Map[Int,java.lang.String] = Map(1 -> David, 9 -> Elwood, 2 -> test)

p(1)          // funzt
p(88)         // exception
p.get(88)     // Option[java.lang.String] = None
p -= 9        // key-value entfernen
p.contains(1) // true
