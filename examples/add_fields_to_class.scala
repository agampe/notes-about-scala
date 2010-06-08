class SoUndSo (a: Int, b: Int){
  val aa: Int = a
  val bb: Int = b
  
  def add(test: SoUndSo): SoUndSo ={
    new SoUndSo(
      aa + that.aa + that.bb,
      bb * that.aa + that.bb
    )
  }
}

