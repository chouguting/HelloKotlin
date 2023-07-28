import java.util.*

fun main(){
    val rollDice:(Int) -> Int = { numOfSide ->  if(numOfSide!= 0) Random().nextInt(1,numOfSide+1) else 0}
    gameplay(6,rollDice)
}

fun gameplay(sideNum:Int,roll: (Int)->Int){
    println( roll(sideNum))
}