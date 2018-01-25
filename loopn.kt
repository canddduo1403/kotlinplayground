fun main(args:Array<String>){
  print("What is your name?: ")
  val name = readLine()
  print("Round?: ")
  val round = readLine()?:"0"

  val a = round.toIntOrNull()?:0

  for(i in 1..a){
    println("Hello $name")
  }

}
