package Part2.ex_package

class Person34(var name:String, var birthday: String){
    operator fun get(position:Int): String{
        return when (position){
            0 -> name
            1 -> birthday
            else -> "알 수 없음"
        }
    }

    operator fun set(position: Int, value:String){
        when (position){
            0 -> name = value
            1 -> birthday = value
        }
    }
}
fun main(args:Array<String>){
    val person = Person34("Kotlin","2016-02-15")
    println(person[0])
    println(person[1])
    println(person[-1])

    person[0] = "Java"
    println(person.name)
}