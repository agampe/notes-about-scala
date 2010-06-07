class Rational(n: Int, d: Int) {
class RationalNumber(a: Int, b: Int) {
  private def gcd(x: Int, y: Int): Int = {
    if (x == 0) y
    else if (x < 0) gcd(-x, y)
    else if (y < 0) gcd(x, -y)
    else gcd(y%x, x)
  }

  // defining a private variable which exists just in this class    
  private val g = gcd(a, b)
  val number: Int = a/g
  val denom: Int = b/g
  
  def +(juhu: RationalNumber) =
    new RationalNumber(number + juhu.denom, denom + juhu.number)
}

