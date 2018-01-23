fun main(args:Array<String>){
  val name = readLine()
  val round = readLine()?:"0"
  val a = round.toInt()

  for(i in 1..a){
    println("Hello $name")
  }

}
