package Day2

object IterationExtended extends App {
  def results(name:String, num:Int):Unit={
    var res = new StringBuilder("")
    for(i<-0 until num){
      for(i<-0 until num) {
        res.append(name)
      }
      println(res)
      res= new StringBuilder("")
    }

  }
    results("H",4)
}
