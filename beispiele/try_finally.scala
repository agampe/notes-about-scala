try {
  file.write(stuff)
} catch {
  case e: java.io.IOException => // handle IO Exception
  case n: NullPointerException => // handle null pointer
}
