class Complex(real: Double, imaginary: Double){
  def re = real
  def im = imaginary
}

object Bla{
  def main(arg: Array[String]) {
    val test = new Complex(1.5, 2.3)
    println("real     : " + test.re)
    println("imaginary: " + test.im)
  }
}
