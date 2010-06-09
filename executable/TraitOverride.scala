trait Test {
  def soUndSo {
    println("test")
  }
}

class Warhammer extends Test {
  override def soUndSo {
    println("Warhammer")
  }
}
object TraitOverride extends Application with Test{
  new Warhammer bla
}

