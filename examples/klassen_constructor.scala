class Succ(n: Nat){
  def isZero: boolean = false
  def pred: Nat = n
  override def toString: String = "Succ("+n")"
