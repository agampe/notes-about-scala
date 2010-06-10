object FindMethod extends Application{
  val states = List("Blub", "Bla", "Bli")
  val foundYes = states.find((name) => name == "Bli")  // some(Bli)
  val foundNo = states.find((name) => name == "Bla")   // None
}

