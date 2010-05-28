var p = Map(1 -> "ruby", 9 -> "scala")
// Map[Int,java.lang.String] = Map(1 -> ruby, 9 -> scala)

// an eine Map noch ein Element dranhaengen
p + 2 -> "test"

p(1)          // jo
p(88)         // eek
p.get(88)     // Option[java.lang.String] = None
p -= 9        // key-value entfernen
p.contains(1) // true
