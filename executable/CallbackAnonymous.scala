object CallbackAnonymous {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 10 }
  }
    
  def main(args: Array[String]) {
    oncePerSecond(() => println("The dwarfs will pass away ..."))
  }
}
