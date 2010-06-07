def myMules(name: String) = name match {
  case "Dwarf" | "Dawi" => Some("stubborn")
  case "Elves" => Some("intriguer")
  case "Skaven" | "Skavenblight" => Some("back-stabbing")
  case _ => None
}
