package advance

import java.util.*

const val MaxBookBorrowCount = 10


class Book(val title:String, val author:String,val year:String,var pages:Int = 35) {


    companion object{
        const val BASE_URL = "www.book.com"

    }

    fun getTitleAuthor():Pair<String, String>{
        //return this.title to this.author
        return Pair(title, author)
    }

    fun getTitleAuthorYear():Triple<String, String, String>{
        return Triple(this.title, this.author, this.year)
    }

    fun canBorrow(userBorrowCount:Int):Boolean{
        return userBorrowCount<= MaxBookBorrowCount
    }

    fun printUrl(){
        println( "$BASE_URL$title.html")
    }
}

fun Book.getWeight():Double{
    return this.pages*1.5
}

fun Book.tornPages(numOfTornPages:Int){
    pages-=numOfTornPages
    if(pages<0)pages=0
}

class Puppy{
    fun playWithBook(book: Book){
        book.tornPages(Random().nextInt(5))
    }
}

fun main(){
//    val book = Book("a","b","2022")
//    val (t,a,y) = book.getTitleAuthorYear()
//    println("Here is your book $t written by $a in $y")
//
//    val allBook = setOf("AAAA","BBB","CCCC","DDDD","Hamlet")
//    val library = mapOf("Shakespeare" to allBook)
//    println(library.any { it.value.contains("Hamlet") })
//    val moreBooks = mutableMapOf("Jason" to "CCCC")
//    moreBooks.getOrPut("AAA"){"DDDD"}
//    println(moreBooks)
    val puppy = Puppy()
    val myBook = Book("A","B","C",40)
    while (myBook.pages>0){
        println("pages left:${myBook.pages}")
        puppy.playWithBook(myBook)
    }
    println("pages left:${myBook.pages}")
}