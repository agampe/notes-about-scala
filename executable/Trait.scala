trait Test {
  def soUndSo {
    println("test")
  }
}

object Trait extends Application with Test{
  soUndSo
}

