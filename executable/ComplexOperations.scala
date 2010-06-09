object ComplexOperations extends Application {
  class Complex (val re: Double, val im: Double) {
    def + (that: Complex) =
      new Complex(re + that.re, im - that.im)
    def / (that: Complex) = {
      val denom = that.re * that.re + that.im * that.im
      new Complex ((re * that.re + im * that.im) / denom,
                   (im * that.re - re * that.im) / denom)
    }
    
    override def toString =
      re + (if (im < 0) "-" + (-im) else "+" + im) + "*i"
  }
  println(new Complex(2, 1) + new Complex(1, 3))
}

