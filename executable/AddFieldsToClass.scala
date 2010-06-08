class SoUndSo (a: Int, b: Int){
  val aa: Int = a
  val bb: Int = b
  
  def add(that: SoUndSo): SoUndSo ={
    new SoUndSo(
      aa + that.aa + that.bb,
      bb * that.aa + that.bb
    )
  }
}

object AddFieldsToClass extends Application{
  val test = new SoUndSo(1,2)
  val newValue = test.add(new SoUndSo(1,2))
  newValue.aa // 4
}
