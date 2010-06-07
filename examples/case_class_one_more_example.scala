case class Point(x: Double, y: Double)
abstract class Shape() {
  def draw(): Unit
}

case class Circle(center: Point, radius: Double) extends Shape() {
  def draw() = println("Circle.draw: " + this)
}

case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape() {
  def draw() = println("Rectangle.draw: " + this)
}

case class Triangle(point1: Point, point2: Point, point3: Point)
    extends Shape() {
  def draw() = println("Triangle.draw: " + this)
}

val shapesList = List(
  Circle(Point(0.0, 0.0), 1.0),
  Circle(Point(5.0, 2.0), 3.0),
  Rectangle(Point(0.0, 0.0), 2, 5),
  Rectangle(Point(-2.0, -1.0), 4, 3),
  Triangle(Point(0.0, 0.0), Point(1.0, 0.0), Point(0.0, 1.0)))
  
val shape1 = shapesList.head // grab the first one.
println("shape1: "+shape1+". hash = "+shape1.hashCode)
for (shape2 <- shapesList) {
  println("shape2: "+shape2+". 1 == 2 ? "+(shape1 == shape2))
}


