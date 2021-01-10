package Part2.ex_package

import java.io.Serializable

data class Triple<out A, out B, out C>(
        val first: A,
        val second: B,
        val third : C) : Serializable

fun calculateCircle(radius:Int): Triple<Int, Double, Double> =
        Triple(radius * 2, radius * 2 * 3.14, 3.14 * radius * radius)

fun main() {
    val (diameter, _, area) = calculateCircle(5)
    println("지름: $diameter")
    println("넓이: $area")
}