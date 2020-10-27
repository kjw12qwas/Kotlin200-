package Part2.ex_package

class Building{
    var name = ""
    var date = ""
    var area = 0
    fun print(){

        println("이름: " + this.name)
        println("건축일자: "+ this.date)
        println("면적: ${this.area}.area")
    }
}

fun printBuilding(building: Building){
    println("이름: " + building.name)
    println("건축일자: "+ building.date)
    println("면적: "+ building.area)
}

fun main(args:Array<String>){
    val building = Building()
    building.name = "A 오피스텔"
    building.date = "2017-02-13"
    building.area = 120 * 8

    building.print()
}

