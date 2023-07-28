import java.util.*

fun main(){
    val rand1 = random()
    val rand2 = {random()}
    val rand3 = ::random
    println(rand3)
    println(rand3())
    println(rand3())
}

fun random():Int{
    return Random().nextInt()
}

