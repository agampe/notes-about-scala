class SoUndSo (a: Int, b: Int){
  val aa: Int = a
  val bb: Int = b
  
  def +(that: SoUndSo) = {that.aa + that.bb}
  def +(string: String) = {string}  
}

object Overloading extends Application{
  println(new SoUndSo(1,2) + new SoUndSo(1,2))
  println(new SoUndSo(1,2) + "Hio")  
}

