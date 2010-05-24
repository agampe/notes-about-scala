trait Person {
      def age: Int
      def first: String
      def valid: Boolean
}

def validByAge(in: List[Person]) =
  in.filter(_.valid).
  sort(_.age < _.age).
  map(_.first)
