package classPractice

import `interface`.Curry
import `interface`.Spice
import `interface`.YellowSpiceColor

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}

fun main(){
    val aSC = SpiceContainer(Curry("aaa","mild"))


    println(aSC.label)
}