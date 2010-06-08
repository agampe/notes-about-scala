class State(_code: String, _desc: String, _loc: Symbol) {
  val code = _code
  val desc = _desc
  val location = _loc
  
  override def toString = desc
}

object Yield extends Application {
  val states = List(new State("DC", "District", 'east),
    new State("VA", "Virginia", 'east),
    new State("CA", "California", 'west),
    new State("AL", "Alabama", 'south))
  
  val noEastCost =
    for (state <- states if state.location != 'east)
      yield state
  println(noEastCost)
}

