abstract class Term
case class Num(x: int) extends Term
case class Plus(left: Term, right: Term) extends Term

# dann ist folgendes moeglich
Plus(Plus(Num(1), Num(2)), Num(3))
