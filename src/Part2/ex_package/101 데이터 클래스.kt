package Part2.ex_package

data class Employee101(val name : String, val age: Int, val salary: Int)

fun main() {
    val first = Employee101("John",30,3000)
    val second = Employee101("Page",24,5300)
    val third = first.copy()

    println(first.toString())
    println(third.toString())
    println(first == second)
    println(first == third)
}