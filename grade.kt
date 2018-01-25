fun main(args:Array<String>){
  println("Enter your grades: (q to end)")
  var grades = mutableListOf<Int>()
  while(true){
    val input = readLine()?:"0"
    var num = input.toIntOrNull()
    if (input == "q") {
        var avg = calAverage(grades)
        println("Average is $avg")
        return
    }
    if(num!=null){
      grades.add(num)
    }
  }
}

fun calAverage(grade:List<Int>):Double{
  var sum = 0
  for(grades in grade){
    sum += grades
  }
  var average = sum.toDouble()/grade.size
  return average
}
