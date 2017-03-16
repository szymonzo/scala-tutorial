package scala.tutorial.basic_examples

/*
  Value keyword can not be re assigned
  @val keyword
 */
object ValuesMain {

  def main(args: Array[String]): Unit = {
    val sum = 1 + 1
    println(sum) //2
    sum + 2
    println("sum value is not 4 is : " + sum) // value can not be changed
    val anotherSum = sum + 1
    println(anotherSum) //3
    //sum = 4*2 // value can not be re-computed. It is a compilation error. val keyword can not be changed
    println("Types of values")
    val integerValue: Int = 12
    println(integerValue) //12
  }

}
