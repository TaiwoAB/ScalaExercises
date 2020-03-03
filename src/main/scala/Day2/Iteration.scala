package Day2

object Iteration extends App {
  def results(name:String, num:Int):Unit={
    for(i<-0 until num){
      println(name)
    }
  }
  results("Hi",3)
}
