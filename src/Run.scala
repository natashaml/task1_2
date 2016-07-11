import scala.util.Random;

/**
  * Created by natalya on 11.07.2016.
  */
object Run {

  def run(body: => Unit) = new {
    def until(condition: Unit => Boolean): Unit = {
      var value = body
      while (!condition(value)) {
        value = body
      }
      value
    }
  }

  def main(args: Array[String]): Unit = {
    val value = run {
      Random.nextInt(10)
    } until (_ == 0)
    println(value);
  }
}