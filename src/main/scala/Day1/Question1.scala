package Day1

object Question1 extends App{
  def result(a: Int, b: Int, c: Int): Int = {
    var numList = List(a, b, c).sorted
    (numList(0) + numList(1))* numList (2)
  }
  println(result(3,9,3))

}

