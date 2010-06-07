// override val ist mit de haesslichste Syntax in Scala
case class MarriedPerson(override val name: String,
  override val age: Int,
  override val valid: Boolean,
  spouse: Person) extends Person(name, age, valid)


def mOlder(p: Person): Option[String] = p match {
  case Person(name, age, true) if age > 35 => Some(name)
  case MarriedPerson(name, _, _, Person(_, age, true))
    if age > 35 => Some(name)
  case _ => None
}

