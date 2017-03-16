package scala.tutorial.basic_examples

/*
  @functions function has body and parameters
  function has zero or more arguments
 */
object FunctionsMain {

  def main(args: Array[String]): Unit = {
    val fun1 = () => {
      10
    }
    println(fun1()) //10
    val fun2 = (a: Int, b: Int) => a + b
    println(fun2(1, 3)) //4
    val fun3 = (a:Int, b: String) => a + b
    println(fun3(2,"fun3")) //2fun3
  }

}
