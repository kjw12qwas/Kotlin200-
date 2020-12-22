package Part2.ex_package

data class Employee102(val name: String, val age: Int, val salary: Int)

fun main() {
    val (name, _, salary) = Employee102("John",30,3300)
    println(name);println(salary)
}