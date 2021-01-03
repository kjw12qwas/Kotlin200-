package Part2.ex_package

fun <T,R> T.map(mapper: (T) -> R): R {
    return mapper(this)
}

fun main() {
    val square: Int =
            11.map {
                it * it
            }
    println(square)
}