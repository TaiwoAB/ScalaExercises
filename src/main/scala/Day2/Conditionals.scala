package Day2

object Conditionals extends App{
  def results(num:Int, number:Int, flag:Boolean):Int={
    var res=0
    if(flag){
      if(num!=0 &number!=0){

        res= num+number
      }else if(num>0){
        res= num
      }else{
        res=number
      }
    }else{
      if(num!=0 &number!=0){

        res=num*number
      }else if(num>0){
        res= num
      }else{
        res=number
      }

    }
    res
  }
  println(results(0,0,false))
}
