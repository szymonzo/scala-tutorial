package scala.tutorial.basic_examples

/*
  @blocks
  combine expression using {}
  Inside block value @val or @val keyword can be changed.
 */
object BlocksMain {

  def main(args: Array[String]): Unit = {

    println({
      val x = 3 + 5
      x + 3
    }) //11

    println({
      var x: Int = 3 + 5
      x + 3
    }) //11

    // x is not in range
    //so we can not do this outside of a block : x * x
  }
}
