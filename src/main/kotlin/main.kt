fun main(){
    Hobbies(listOf("Eating","Cooking","Dancing","Reading","Sleeping","Preaching","Hiking","Watching","Biking","Debating"))

    println(peoplesHeight(listOf(4.5,2.3,6.7)))

    var name1= personObjects("Gumato",34,4.5,54)
    var name2=personObjects("Sabthe",68,6.8,49)
    var both = listOf( name1,name2,)
    var x = both.sortedByDescending { person -> person.age  }
    println(x)

    var name3 = personObjects("Elema", 12, 2.2, 32)
    var name4 = personObjects("John", 22, 3.5, 60)
    var brand = mutableListOf(name3,name4)
    println(brand.plus(brand))

    var S = Car("KBY 5257C", 80)
    var R = Car("KLM 4356D", 120)
    var cars = listOf(S, R)
    println(carDetails(cars))

}
fun Hobbies(types: List<String>):List<String>{
    types.forEachIndexed { index, z ->
        if (index % 2 == 0) {
          println(z)
        }
    }
    return types
}
fun peoplesHeight(values:List<Double>):String {
    var addition = values.sum()
    var averagepeoplesHeight = values.average()
    var both = "$addition, $averagepeoplesHeight"

    return both
}

data class personObjects(var name:String,var age:Int,var height:Double,var weight:Int)
fun createMorpersonObjects(more:List<Any>):List<Any>{
    return listOf()
}
data class Car(var registration:String, var mileage:Int)
fun carDetails(b:List<Car>):Int {
    var d = 0
    b.forEach { jeep -> jeep.mileage
        d += jeep.mileage
    }
    var total = d/b.count()
    return total
}

