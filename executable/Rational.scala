class RationalNumber(a: Int, b: Int) {
  private def gcd(x: Int, y: Int): Int = {
    if (x == 0) y
    else if (x < 0) gcd(-x, y)
    else if (y < 0) gcd(x, -y)
    else gcd(y%x, x)
  }
  
  private val g = gcd(a, b)
  val number: Int = a/g
  val denom: Int = b/g
  
  def +(juhu: RationalNumber) =
    new RationalNumber(number + juhu.denom, denom + juhu.number)
}

object Rational extends Application{
  var test1 = new RationalNumber(3, 9)
  var test2 = new RationalNumber(3, 9)
  var test3: RationalNumber = test1.+(test2)
  var test4 = test1 + test2  
}

