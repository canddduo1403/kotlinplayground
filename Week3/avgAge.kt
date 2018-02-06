data class Person(val name:String,val age:Int,val gender:Char,val realation:Boolean)

fun main (args:Array<String>){
    val allPeople = listOf(
        Person("James", 32, 'm', false), Person("Sarah", 25, 'f', false),
        Person("Vera", 57, 'f', false), Person("Deborah", 21, 'f', true),
        Person("Chris", 23, 'm', false), Person("Joanna", 19, 'f', false),
        Person("Cecile", 29, 'f', false), Person("Peter", 36, 'm', false),
        Person("Beryl", 65, 'f', false), Person("Victoria", 29, 'f', true),
        Person("Tony", 17, 'm', true), Person("George", 14, 'm', true)
    )

    val age = allPeople.map{it.age}.fold(0,{total,next->total+next})
    val avgAge = age/allPeople.size.toDouble()
    print("$avgAge")
}