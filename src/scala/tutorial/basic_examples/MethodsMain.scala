package scala.tutorial.basic_examples

/*
  @Methods can not be assigned to val or var keyword
  we can recognize method by def keyword
  also methods has a return type
 */
object MethodsMain {

  def main(args: Array[String]): Unit = {
    val someValue = someMethod(10)
    println(someValue) //10
    println(addThenMultiply(3,4)(2)("Should return 14"))//14
   // val tryAssignMethod = someMethod // compilation error
    println(getName)

  }

  def someMethod(returnValue: Int): Int = {
    returnValue
  }

  def addThenMultiply(x: Int, y: Int)(multipler: Int)(someInformation:String): Int = {
    println(someInformation)
    (x + y) * multipler
  }

  def getName : String = System.getProperty("name")

}
