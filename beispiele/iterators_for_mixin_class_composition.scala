trait RichIterator[T] extends AbsIterator[T] {
  def foreach(f: T => unit): unit =
    while (hasNext) f(next)
}


# ein konkreter Iterator, der sukzessive die Zeichen eines Strings returnd
class StringIterator(s: String) extends AbsIterator[char] {
  private var i = 0
  def hasNext = i < s.length
  def next = {val x = s charAt i; i = i +1; x}
}
