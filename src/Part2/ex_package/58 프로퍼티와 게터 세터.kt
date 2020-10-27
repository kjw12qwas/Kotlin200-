package Part2.ex_package

class Person3
{
    var age:Int = 0
        get(){
            return field
        }
        set(value) {
            field = if (value >= 0) value else 0
        }
}

fun main(args:Array<String>){
    val person = Person3()

    person.age = -30
    println(person.age)
}