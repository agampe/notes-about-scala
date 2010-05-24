for (i <- 1 to 10) println(i *10)

// filter einbauen in Generatoren
for (breed <- dogBreeds
  if breed.contains("Terrier");
  if !breed.startsWith("Yorkshire")
) println(breed)

