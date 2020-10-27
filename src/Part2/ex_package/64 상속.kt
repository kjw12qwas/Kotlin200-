package Part2.ex_package

open class Person64(val name: String , val age : Int)

class Student(name : String,age : Int, val id:Int): Person64(name,age)

fun main(args:Array<String>){
    val person64 = Person64("석원준",18)
    val student = Student("신원준",19,20031010)
}