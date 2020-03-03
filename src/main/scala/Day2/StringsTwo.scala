package Day2

object StringsTwo extends App{
  def result(word:String,name:String,char: Char,c:Char):String={
    val res = (word+name).replace(char,c)
    res
  }
  println(result("Ha","llo",'a','e'))
}
