val clans = List("Eshin", "Test", 2)

// one not so real generator
for(i <- clans
  if clans.contains("Eshin")
) println("Skaven!")

// a real generator
for(j <- clans
  if j == "Eshin"
) println("Skaven are here")

