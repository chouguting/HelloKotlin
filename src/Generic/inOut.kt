package Generic
open class Food
open class FastFood : Food()
class Burger : FastFood()

fun main() {
    // 正常情況
    // 想購買肉品食物的消費者可能也會想買漢堡
    val consumer1 : Consumer<Burger> = PurchaseFood()
    // 想購買速食食物的消費者可能也會想買漢堡
    val consumer2 : Consumer<Burger> = EatFastFood()
    val consumer3 : Consumer<Burger> = EatBurger()
    consumer1.consume(Burger())

    // 正常情況
    // 食品商店屬於食品商店
    val producer1 : Production<Food> = FoodStore()
    // 速食商品屬於食品商店
    val producer2 : Production<Food> = FastFoodStore()
    // 漢堡商店也屬於食品商店
    val producer3 : Production<Food> = InOutBurger()  //Production<Burger>
    println( producer3.produce())

    // 錯誤情況
//    val consumer1 : Consumer<Food> = PurchaseFood()
    // 直接想購買速食商品的消費者通常不會想買肉品
//    val consumer2 : Consumer<Food> = EatFastFood()
    // 直接想購買漢堡商品的消費者通常不見想買肉品
//    val consumer3 : Consumer<Food> = EatBurger()
}


// 定義一個生產者介面，運用 out 關鍵字
interface Production<out T> {
    // 將泛型 T 作為回傳值
    fun produce(): T
}

// 定義一個 FoodStore 類別，並利用 Food 類別實作生產者介面
class FoodStore : Production<Food> {
    override fun produce(): Food {
        println("食品商店")
        return Food()
    }
}

// 定義一個 FastFoodStore 類別，並利用 FastFood 類別實作生產者介面
class FastFoodStore : Production<FastFood> {
    override fun produce(): FastFood {
        println("速食商店")
        return FastFood()
    }
}

// 定義一個 FastFoodStore 類別，並利用 FastFood 類別實作生產者介面
class InOutBurger : Production<Burger> {
    override fun produce(): Burger {
        println("漢堡商店")
        return Burger()
    }
}

// 利用 in 關鍵字配合泛型
interface Consumer<in T> {
    // 將泛型 T 作為函數參數
    fun consume(item: T)
}

// 想購買食品商品
class PurchaseFood : Consumer<Food> {
    override fun consume(item: Food) {
        println("購買食品商品")
    }
}

// 想購買速食食物
class EatFastFood : Consumer<FastFood> {
    override fun consume(item: FastFood) {
        println("購買速食食物")
    }
}

// 想購買漢堡食物
class EatBurger : Consumer<Burger> {
    override fun consume(item: Burger) {
        println("購買漢堡食物")
    }
}