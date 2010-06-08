import java.io.Filereader

val file = new FileReader("bla.txt")
try {
  // use the file
} finally {
  file.close()
}
