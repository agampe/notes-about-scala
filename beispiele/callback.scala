def oncePerSecond(callback: () => Unit) {
  while (true) { callback(); Thread sleep 10 }
}

def timeFlies() {
  println("The dwarfs will pass away ...")
}


oncePerSecond(timeFlies) // start for 10 seconds the thread

