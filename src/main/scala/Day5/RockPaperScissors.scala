package Day5

object RockPaperScissors extends App {
  val listChoice: List[String] = List("r","p","s","sp","l")
  def game():Unit= {
    var bool =true
    while(bool){
      println("Enter Y to start or N to quit")
      if(scala.io.StdIn.readLine().equalsIgnoreCase("y")){
        compareChoice(playerChoice(), aiChoice())
      }
      else bool=false
    }
  }
  def aiChoice():String={
    val r = scala.util.Random
    listChoice(r.nextInt(5))
  }
  def playerChoice():String={
    println("Please type in either R for rock, P for paper, S for scissors, L Lizard, SP for spock")
    scala.io.StdIn.readLine().toLowerCase
  }
  def compareChoice(plChoice:String, aiChoice:String):Unit={
    plChoice match {
      case "r" => aiChoice match {
        case "r" => println("You drew with the AI")
        case "p" =>println("You lost as paper covers rock")
        case "s" =>println("You win as rock crushes scissors")
        case "sp" =>println("You lose as spock vapourises rock")
        case "l"=>println("You win as rock crushes lizard")

      }
      case "p" => aiChoice match{
        case "r" => println("You win as paper covers rock")
        case "p" =>println("You drew with the AI")
        case "s" =>println("You lose as against scissors cuts paper")
        case "sp" =>println("You win as paper disproves spock")
        case "l"=>println("You lose as lizard eats paper")
      }
      case "s" => aiChoice match{
        case "r" => println("You lose as rock crushes scissors")
        case "p" =>println("You win as scissors cuts paper")
        case "s" =>println("You drew with the AI")
        case "sp" =>println("You lose as spock smashes scissors")
        case "l"=>println("You win as scissors decapitates lizard")
      }
      case "sp" => aiChoice match{
        case "r" => println("You win as spock vapourises rock")
        case "p" =>println("You lose as paper disproves spock")
        case "s" =>println("You win as spock smashes scissors")
        case "sp" =>println("You drew with the AI ")
        case "l"=>println("You lose as lizard poisons spock")
      }
      case "l" => aiChoice match{
        case "r" => println("You lose as rock crushes lizard")
        case "p" =>println("You win as lizard eats paper")
        case "s" =>println("You lose as scissors decapitates lizard")
        case "sp" =>println("You win as lizard poisons spock ")
        case "l"=>println("You drew with the AI")
      }
      case _ => println("invalid entry")

    }
  }

  game()


}
