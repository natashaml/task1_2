/**
  * Created by natalya on 11.07.2016.
  */
object WhileLoop {

  def whileLoop(b: Boolean)(command: => Unit) {
    if (b) {
      (command);
      whileLoop(b)(command)
    } else ()
  }

  def main(args: Array[String]): Unit = {
    whileLoop(true)()
  }
}
