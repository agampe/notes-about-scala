object ExtendsBuiltins extends Application {
  def fac(n: Int): BigInt =
    if (n == 0) 1 else fac(n-1) * n
  class Factorizer(n: Int) {
    def ! = fac(n)
  }
  
  implicit def int2fac(n: Int) = new Factorizer(n)
  
  println(new Factorizer(10)!)
  println("10 = " + (10!)) // better syntax
  println("5 = " + fac(5))
}

/* 
 * implzit sagt, dass wenn wir ! durch Int aufrufen wollen, dann verwende
 int2fac, ohne die Komplizierte Schreibweise
 *
*/
