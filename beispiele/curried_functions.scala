def multiplier(i: Int)(factor: Int) = i * factor
val byFive = multiplier(5) _
val byTen = multiplier(10) _

// byFive underscore drueckt aus, dass das Ergebnis aus dieser Operation eben zwischegespeichert wird und dann von byTen verwendet werden kann

scala> byFive(2)
res4: Int = 10
scala> byTen(2)
res5: Int = 20

