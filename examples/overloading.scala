class SoUndSo (a: Int, b: Int){
  val aa: Int = a
  val bb: Int = b
  
  def +(that: SoUndSo) = {that.aa + that.bb}
  def +(string: String) = {string}  
}

