object PartialFunctions extends Application{
  def sum(a: Int, b: Int, c: Int) = a - b + c
  val test1 = sum(1, _: Int, 3)
  val test2 = sum(_: Int, 2, _: Int)
  
  println(test1(2))   // 2
  println(test2(1,1)) // 0  
  
}

