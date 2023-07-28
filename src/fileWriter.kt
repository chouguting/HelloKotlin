import java.io.File
import java.io.FileNotFoundException
import java.io.FileWriter
import java.util.*

fun main(args:Array<String>){
    val fileWriter = FileWriter("test.txt", true)
    fileWriter.write("Hello Im gordon\n")
    fileWriter.close()
    try {
        val file = File("test2.txt")
        val scanner = Scanner(file)
        while(scanner.hasNextLine()){
            println(scanner.nextLine())
        }
    }catch (ex :FileNotFoundException){
        println(ex)
    }

}