package Day2

object FizzBuzz extends App {
  def results(name:String, word:String, num:Int):Unit={
    var res= new StringBuilder("")
    for(i<-1 to num){
      if(i % 3 == 0){
        res.append(name)
      }
      if(i%5==0){
        res.append(word)
      }
      if(res.isEmpty){
        print(i)
      }
      print(res)
      res= new StringBuilder("")
      if(i!=num){
        print(',')
      }
    }
  }
  results("fizz","buzz",15)
}
