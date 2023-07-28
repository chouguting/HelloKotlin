package classPractice

class SimpleSpice {
    var name:String = "curry"
    var spiciness:String = "mild"
    val heat: Int
        get() = when (spiciness) {
                "mild" -> 5
                else -> 0
            }
}

fun main(args:Array<String>){
    val mySpice = SimpleSpice()
    println("name: ${mySpice.name} \n heat: ${mySpice.heat}")
}