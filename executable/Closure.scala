object Closure extends Application{
  val more = 13
  def sum(a: Int): Int = a + more
  println(sum(1))
  
  def sumMoore(more: Int) = (x: Int) => x + more
  val bla = sumMoore(1) // <function>
}

