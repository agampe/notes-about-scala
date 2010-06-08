class RationalClass(n: Int, d: Int){
  // ohne dass kommt RationClass@54dh32 heraus
  override def toString = n + "/" + d
}

object RationalOverriding extends Application{
  println(new RationalClass(1, 3))  
}
