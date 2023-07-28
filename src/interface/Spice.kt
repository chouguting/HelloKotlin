package `interface`

abstract sealed class Spice(var name:String, var spiciness: String, color: SpiceColor) :SpiceColor by color{
    var heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "hot" -> 10
            else -> 0
        }
        set(value) {

        }
    init {
        println("name: $name  spiciness: $spiciness heat:$heat")
    }

    abstract fun prepareSpice()
}

interface Grinder{
    fun grind()
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}

interface SpiceColor{
    val color:Color
}

object RedSpiceColor:SpiceColor{
    override val color = Color.RED
}

object YellowSpiceColor:SpiceColor{
    override val color = Color.YELLOW
}

class Curry(name: String,spiciness: String,color: SpiceColor = YellowSpiceColor): Spice(name, spiciness,color),Grinder{
    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        TODO("Not yet implemented")
    }
}




fun main(){
    println(Curry("","").color)
}