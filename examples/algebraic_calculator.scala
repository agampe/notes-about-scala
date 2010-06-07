abstract class Term {
  def eval: int
}

class Num(x: int) extends Term {
  def eval: int = x
}

class Plus(left: Term, right: Term) extends Term {
  def eval: int = left.eval + right.eval
}
