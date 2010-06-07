object HelloWorld {

  def main(args: Array[String]) = {
    println("Hello Helex!");
  }
}

// kuerzer durch Verwendung des Mixins
object HelloWorld extends Application {
    println("Hello Helex!");
}

