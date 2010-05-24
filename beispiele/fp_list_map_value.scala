var factor = 3
val multiplier = (i:Int) => i * factor
val l1 = List(1, 2, 3, 4, 5) map multiplier

factor = 5
val l2 = List(1, 2, 3, 4, 5) map multiplier

println(l1)
println(l2)

// List(3, 6, 9, 12, 15)
// List(5, 10, 15, 20, 25)

