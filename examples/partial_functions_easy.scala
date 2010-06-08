def concatUpper(s1: String, s2: String): String = (s1 + " " + s2).toUpperCase

// keep care of the underscore
val c = concatUpper _
println(c("short", "pants"))

val c2 = concatUpper("short", _: String)
println(c2("pants"))

