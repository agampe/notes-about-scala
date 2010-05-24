def isOdd(in: Int) = in % 2 == 1
for {i <- 1 to 5 if isOdd(i)} println(i)
