package Part2.ex_package

class Building70(val name:String = "",val date:String ="", val area:Int = 0){
    override fun toString() = "이름:${this.name}\n" +
            "건축일자:${this.date}\n" +
            "면적:${this.area} m2"
}

fun main(args:Array<String>){
    val building = Building70("코틀린",area = 100)
    printObject(building)
}

fun printObject(any:Any){
    println(any.toString())
}