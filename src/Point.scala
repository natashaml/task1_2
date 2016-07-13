
/**
  * Created by natalya on 12.07.2016.
  */
case class Point(val x: Int, val y: Int) {

  def add(vector: Vector) = Point(x + vector.x, y + vector.y)

  def distance(to: Point): Double = {
    val deltaX = (x - to.x).toDouble * (x - to.x).toDouble
    val deltaY = (y - to.y).toDouble * (y - to.y).toDouble
    Math.sqrt(deltaX + deltaY)
  }

  def quarter(): Quarter.Value = {
    if (x > 0 && y > 0) Quarter.FIRST

    if (x > 0 && y < 0) Quarter.SECOND

    if (x < 0 && y > 0) Quarter.THIRD

    if (x < 0 && y < 0) Quarter.FOURTH

    if (x == 0) Quarter.ON_X
    if (y == 0) Quarter.CENTER

    Quarter.ON_Y
  }

  def areSymmetric(p: Point) = (x == -p.x && y == -p.y)

  def areCollinear(p0: Point, p1: Point, p2: Point) = ((p0.y - p1.y) * (p0.x - p2.y) == (p0.y - p2.y) * (p0.x - p2.x))
}


object Quarter extends Enumeration {
  val FIRST, SECOND, THIRD, FOURTH, ON_X, ON_Y, CENTER = Value
}

case class Vector(val x: Int, val y: Int)

