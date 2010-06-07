trait AbstractT2 {
  println("In AbstractT2:")
  val value: Int
  lazy val inverse = { println("initializing inverse:"); 1.0/value }
}

val c2d = new AbstractT2 {
  println("In c2d:")
  val value = 10
}

println("Using c2d:")
println("c2d.value = "+c2d.value+", inverse = "+c2d.inverse)
