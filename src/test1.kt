import java.util.*




fun main(args:Array<String>){
    println(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish(tankSize:Double, currentFish:List<Int>, fishSize:Int=2, hasDecorations :Boolean=true):Boolean{
    val limit = if(hasDecorations) tankSize*0.8 else tankSize
    return currentFish.sum()+fishSize<=limit
}

fun getBirthday():Int{
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?:1
}

fun getFortuneCookie(birthday:Int):String{
    return when(birthday){
        in 0..10->"WOW"
        11 , 31 ->"OH"
        else ->"???"
    }
}

fun dayOfWeek(){
    println("What day is it today?")
    val days = arrayOf("error","Sunday","Monday","Tuesday")
    var currentDayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(days[currentDayOfWeek])
}
