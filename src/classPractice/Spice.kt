package classPractice

class Spice(var name:String, var spiciness: String = "mild") {
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "hot" -> 10
            else -> 0
        }
    init {
        println("name: $name  spiciness: $spiciness heat:$heat")
    }
}

fun makeSalt()=Spice("salt")

fun main(){
    val spiceList = mutableListOf(Spice("curry"),Spice("chilly","hot"),Spice("pepper","hot"))
    spiceList.add(makeSalt())
    val mildSpice = spiceList.filter { it.heat==5 }
    println(mildSpice)
}