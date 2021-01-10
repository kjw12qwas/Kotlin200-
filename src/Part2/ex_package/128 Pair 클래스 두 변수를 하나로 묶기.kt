package Part2.ex_package

import java.io.Serializable

data class Pair128<out A, out B> (
        val first: A,
        val second: B) : Serializable

fun divide(a: Int , b: Int): Pair128<Int, Int> = Pair128(a / b, a % b)

fun main() {
    val (q, r) = divide(10, 3)
    println("몫:$q")
    println("나머지:$r")
}