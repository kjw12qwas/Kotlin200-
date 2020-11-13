package Part2.ex_package

object Person88{
    var name : String = ""
    var age : Int = 0
    fun print(){
        println(name)
        println(age)
    }
}

fun main() {
    Person88.name = "Singleton"
    Person88.age = 45
    Person88.print()
}