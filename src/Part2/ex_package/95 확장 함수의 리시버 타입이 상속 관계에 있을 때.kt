package Part2.ex_package

open class AAA95; class  BBB: AAA95()

fun AAA95.hello() = println("AAA")
fun BBB.hello() = println("BBB")

fun main() {
    val test95 : AAA95 = BBB()
    test95.hello()
}
