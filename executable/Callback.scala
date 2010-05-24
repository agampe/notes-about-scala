object Callback {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 10 }
  }
  
  def timeFlies() {
    println("The dwarfs will pass away ...")
  }
  
  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}
