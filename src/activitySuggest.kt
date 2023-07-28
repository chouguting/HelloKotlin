fun main(){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val curryList = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(curryList)
    val ceList1 = spices.filter { it[0]=='c' && it[it.length-1]=='e' }
    println(ceList1)
    val  ceList2 = spices.asSequence().filter { it[0]=='c' && it[it.length-1]=='e'  }
    println(ceList2.toList())
    val startWithCinFirstThree = spices.subList(0,3).filterIndexed {i, it ->(i<3 && it[0]=='c') }
    println(startWithCinFirstThree)
}

fun whatShouldIDoToday(mood:String, weather:String="sunny", temperature:Int=24):String{
    return when{
        isSad(mood) && isSunny(weather) -> "stay"
        isHot(temperature) -> "swim"
        !isSad(mood) -> "happy go out"
        else->"bbb"
    }
}

fun isSad(mood: String) = mood=="sad"
fun isHot(temperature: Int) = temperature > 26
fun isSunny(weather: String) = weather=="sunny"

