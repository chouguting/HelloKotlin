
open class Animal(val weight:Int, val height:Int)

fun Animal?.talk(){
    if(this!=null){
        println("AAA")
    }else{
        println("BB")
    }
}

class Cat(weight: Int,height: Int):Animal(weight, height)
class Dog(weight: Int,height: Int):Animal(weight, height)

inline fun <reified T:Animal> Animal.isAnimalOfType():Boolean{
    return this is T
}

fun <R> returnR(r:R):R{
    return r
}

fun main(){
//    val theList = mutableMapOf("a" to 0,"b" to 1,"c" to 2)
//    println(theList.getOrElse("d",{3 to 4}))
//
//    val ani:Animal? = null
//    ani.talk()
    var cat = Cat(20,3)
    println(cat.isAnimalOfType<Cat>())

}