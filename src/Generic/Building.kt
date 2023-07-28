package Generic

open class BaseBuildingMaterial(var numberNeeded:Int = 1)

class Wood:BaseBuildingMaterial(4)

class Brick:BaseBuildingMaterial(8)

class Building< T:BaseBuildingMaterial>(var buildingMaterial: T){
    var baseMaterialsNeeded = 100
    fun actualMaterialsNeeded() = baseMaterialsNeeded * buildingMaterial.numberNeeded

    fun build(){
        println("type:${buildingMaterial::class.simpleName}  needed:${actualMaterialsNeeded()}")
    }

}

fun<T:Building<*>> isSmallBuilding(building:T){
    if(building.actualMaterialsNeeded()<500){
        println("small building")
    }else{
        println("large building")
    }
}

fun main(){
    var building = Building(Wood())
    building.build()
    isSmallBuilding(building)
}