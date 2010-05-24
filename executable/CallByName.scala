object CallByName extends Application{

  def nano()= {
    println("Dwarf Warriors:")
    12
  }
  
  def delayed(t: => Long) = {
    println("Delayed method")
    println("Count: " + t)
  }
  
  def notDelayed(t: Long) = {
    println("not delayed method")
    println("Count: " + t)
  }
  
  delayed(nano)

  /*
    Delayed method
    Getting nano
    Param:12
  */
  
  notDelayed(nano)
  /*
   Getting nano
   not delayed method
   Param:5575172058663
  */

}

