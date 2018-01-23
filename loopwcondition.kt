fun main(args:Array<String>){
  /* do{
    val name = readLine()?:"0"
    if(name!="exit"){
      println("Hello $name")
    }
  }while(name!="exit") */
  while(true){
    val name = readLine()?:"0"
    if(name=="exit"){
      break
    }
    else{
      println("Hello $name")
    }
  }
}
