package Day2

object AnyReturnType extends App{
  def result(name:Any):Any={
    name
  }
  println(result("Taiwo"))
  println(result(10))
  println(result(10.00))
}
