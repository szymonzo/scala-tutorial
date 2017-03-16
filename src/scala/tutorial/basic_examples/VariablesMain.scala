package scala.tutorial.basic_examples

/*
  @keyword var
  @var can be re-assigned
 */
object VariablesMain {


  def main(args: Array[String]): Unit = {
    var variable = 3 + 4
    println(variable) //7
    variable = 10 // This compiles because "variable" is declared with the "var" keyword.
    println(10) //10
    println(variable * 2) // This compiles because "variable" is declared with the "var" keyword.
  }
}
