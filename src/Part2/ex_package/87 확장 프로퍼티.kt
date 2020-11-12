package Part2.ex_package

val String.isLarge: Boolean
    get() = this.length >= 10

fun main() {
    println("1,2,3,4,5,6,7,8,9,0".isLarge)
    println("500 원".isLarge)
}