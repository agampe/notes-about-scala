throw new Exception("Working...")

try {
  throw new Exception("Working...")
} finally {
  println("This will always be printed")
}
