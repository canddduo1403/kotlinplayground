fun main(args:Array<String>){
  print("Weight: ")
  val weight = readLine()?:"0"
  print("Height: ")
  val height = readLine()?:"0"

  var w = weight.toDoubleOrNull()?:0.0
  var h = height.toDoubleOrNull()?:0.0
  var Bmi = bmi(w,h)

  println("Your BMI is $Bmi")
}

fun bmi(weight: Double, height: Double): Double {
    val heightM = height / 100.0
    return weight / (heightM * heightM)
}
