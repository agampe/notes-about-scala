class SoUndSo (a: Int, b: Int){
  val aa: Int = a
  val bb: Int = b
  
  def greaterThen(that: SoUndSo) = {
    if (this.aa * this.bb > that.aa * that.bb)
     this.aa
    else
     that.aa
    }
}

