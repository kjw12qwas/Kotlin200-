package Part2.ex_package

/*interface Iterable<out T>{
    operator fun iterator(): Iterable<T>

    open class IntProgression{
        val first: Int
        val last: Int
        val step: Int
    }
}*/

fun main() {
    val prog: IntProgression = 3..7
    println(prog.first)
    println(prog.last)
    println(prog.step)

    for (i in prog)
        print("$i")
}