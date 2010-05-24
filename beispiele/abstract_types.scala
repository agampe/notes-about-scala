import java.io._

abstract class BulkReader {
  type In
  val source: In
  def read: String
}

class StringBulkReader(val source: String) extends BulkReader {
  type In = String
  def read = source
}

class FileBulkReader(val source: File) extends BulkReader {
  type In = File
  def read = {
    val in = new BufferedInputStream(new FileInputStream(source))
    val numBytes = in.available()
    val bytes = new Array[Byte](numBytes)
    in.read(bytes, 0, numBytes)
    new String(bytes)
  }
}

println( new StringBulkReader("Hello Scala!").read )
println( new FileBulkReader(new File("abstract-types-script.scala")).read )


// man kann es aber auch mit parameterized types wie folgt formulieren:

abstract class BulkReader[In] {
  val source: In
  ...
}

class StringBulkReader(val source: String) extends BulkReader[String] {...}
class FileBulkReader(val source: File) extends BulkReader[File] {...}




