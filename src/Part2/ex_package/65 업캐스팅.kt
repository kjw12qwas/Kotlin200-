package Part2.ex_package

open class Person65(val name: String, val age: Int)

class Student65(name: String, age: Int, val id: Int): Person65(name,age)

fun main(args:Array<String>)
{
    val person65: Person65 = Student65("Kim",32,200031113)
}