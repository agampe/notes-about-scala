class CheckSomething{
  private var sum = 0  
  def add(b: Byte) {sum += b}
  def checksum {sum}
}

object PrivateClasses extends Application{
  val test = new CheckSomething
  test.add(2)
  test.checksum
}

