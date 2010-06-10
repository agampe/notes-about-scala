// define a class with 1-arg constructor
class Circle(r: Int) {
  // define an read-only field
  val radius = r
  
  // define a method to compute diameter
  def diameter = radius * 2
  
  def area  = {
    val pi = 3.14
    var area = pi * radius
    area *= radius
    area
  }
  
  // override superclass
  // without it we can't compile
  override def toString = "Circle with radius " + radius
}

class Cylinder(h: Int, r: Int) extends Circle (r) {
  val height = h
  override def area = (super.area * 2) + (2 * 3.14 *height)
  def volume = super.area * height
  override def toString = "Cylinder with volume " + volume
}


object ClassAndInheritance extends Application{
  val circle = new Circle(4)
  val cylinder = new Cylinder(2, 4)
  circle.toString
  circle.diameter
  circle.radius
  circle.area
  cylinder.toString
  cylinder.height
  cylinder.volum
}

