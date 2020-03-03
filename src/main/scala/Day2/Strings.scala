package Day2

object Strings extends App {
 def results(name:String, num:Int):StringBuilder={
   val res= new StringBuilder("")
   for (a<-name.length-num to name.length-1){
     res.append(name.charAt(a))
   }
   res
 }
  println(results("Hello", 3))
}
