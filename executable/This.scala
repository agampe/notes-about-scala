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

object This extends Application{
  println(new SoUndSo(1,2).greaterThen(new SoUndSo(2,3)))
}

