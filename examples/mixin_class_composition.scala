object Test {
  def main(args: Array[String]): unit = {
    class Iter extends StringIterator(args(0)) with RichIterator[char]
    val iter  = new Iter
    iter foreach System.out.println
  }
}
