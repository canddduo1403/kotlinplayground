fun main(args:Array<String>){

    var wordList = mutableListOf<String>()

    while(true){
        val input = readLine()
        if(input=="exit"){
            wordList.reverse()
            printReversed(wordList)
        }
        if(input!=null){
            wordList.add(input)
        }
    }
}

fun printReversed(list:List<String>){
    for(item in list){
        println("$item")
    }
}